package Task;

import java.util.Arrays;
import java.util.Scanner;

public class RotationString {
    public static void main(String[] args) {
        int j=0,i,n;
        String s1,s2;
        char k;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        char[] ch=s1.toCharArray();
        char[] ch1=s2.toCharArray();
        int len=ch.length;
        for(n=0;n<len;n++) {
            k=ch[len-1];
            for (i = len - 1; i >0; i--) {
                ch[i] = ch[i - 1];
            }
            ch[0] = k;
            if(Arrays.equals(ch,ch1)) {
                j=1;
                break;
            }
        }
        if(j==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
