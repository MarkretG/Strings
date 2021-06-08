package Task;

import java.util.Scanner;

public class ConvertWords {
    static void convert(char[] num)
    {
        int len=num.length;
        if(len==0)
        {
            System.out.println("Empty");
            return;
        }
        if(len>4)
        {
            System.out.println("To handle only four digit");
            return;
        }
        String[] one={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] two={"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] ten_multiple={"", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] ten_power={"hundred and ","thousand "};

        ////single digit
        if(len==1)
        {
            System.out.println(one[num[0]-'0']);
            return;
        }

        ///first two digit
        int m=0;
        while(m<num.length)
        {
            if(len>=3) {
                if (num[m] - '0' != 0) {
                    System.out.print(one[num[m] - '0'] + " ");
                    System.out.print(ten_power[len - 3]);
                }
                --len;
            }
            ///10-19 digits
            else
            {
                if(num[m]-'0'==1)
                {
                    int get;
                    get = num[m] - '0' + num[m + 1] - '0';
                    System.out.print(two[get]);
                    return;
                }
                //20 only
                else if(num[m]-'0'==2 && num[m+1]-'0'==0) {
                    System.out.print("twenty");
                    return;
                }
                ///21-99
                else
                {
                    int i=(num[m]-'0');
                    if(i>0)
                        System.out.print(ten_multiple[i]+" ");
                    else
                        System.out.print("");
                    ++m;
                    if(num[m]-'0'!=0)
                        System.out.print(one[num[m]-'0']);
                }
            }
            ++m;
        }

    }
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        String s=Integer.toString(number);
        convert(s.toCharArray());
    }
}
