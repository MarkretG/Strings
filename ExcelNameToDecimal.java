package Strings;

import java.util.Scanner;

public class ExcelNameToDecimal {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            res=res*26;
            res=res+s.charAt(i)-'A'+1;
        }
        System.out.println(res);

    }
}
