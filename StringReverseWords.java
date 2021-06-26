package Strings;

import java.util.Scanner;

public class StringReverseWords {
    static void rightToLeftReverseWords(char[] ch)
    {
        int len= ch.length,pos=len-1;
        for(int i=len-1;i>=0;i--) {
            if (ch[i] == ' ') {
                for (int j = i + 1; j <= pos; j++)
                    System.out.print(ch[j]);
                System.out.print(" ");
                pos = i - 1;
            }
            if (i == 0) {
                for (int j = i; j <= pos; j++)
                    System.out.print(ch[j]);

            }
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char[] ch=s.toCharArray();
        rightToLeftReverseWords(ch);
    }
}
