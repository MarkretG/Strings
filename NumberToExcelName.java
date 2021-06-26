/**
 *
 *input:1 2 3 26 27
 * output:A B C Z AA
 */

package Strings;
import java.util.Scanner;
public class NumberToExcelName {
    static  void print(int num)
    {
        int rem;
        StringBuilder  name=new StringBuilder();

            while (num > 0) {
                rem = num% 26;
                if (rem == 0) {
                    name.append("Z");
                    num = (num/26) - 1;
                } else {
                    name.append((char) ((rem - 1) + 'A'));
                    num = num/ 26;
                }
            }
            System.out.println(name.reverse());

    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++)
            a[i]= sc.nextInt();
        for(int j=0;j<num;j++)
          print(a[j]);
    }
}
