/*
  input:house no : 123@ cbe
output: ebc32 1o : nes@ uoh
 */



package Strings;
import java.util.Scanner;
public class DoNotChangePosition {
    static void reverse(char[] s)
    {
        int i=0,j=s.length-1;
        char t;
        while(i!=j)
        {
            if((s[i]>=32&&s[i]<=47) || (s[i]>=58&&s[i]<=64) || (s[i]>=123&&s[i]<=126))
                ++i;
            if((s[j]>=32&&s[j]<=47) || (s[j]>=58&&s[j]<=64) || (s[j]>=123&&s[j]<=126))
                --j;
            if((i!=j)&&((s[i]>=97&&s[i]<=122)||(s[i]>=48&&s[i]<=57))&&((s[j]>=97&&s[j]<=122)||(s[j]>=48&&s[j]<=57)))
            {
                t=s[i];
                s[i]=s[j];
                s[j]=t;
                ++i;
                --j;
            }
        }
        for(char m:s)
            System.out.print(m);
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        reverse(s.toCharArray());
    }
}
