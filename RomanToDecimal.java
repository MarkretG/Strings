package Strings;

import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int len=s.length();
        RomanSymbolsToDecimal obj=new RomanSymbolsToDecimal();
        System.out.println(obj.ConvertRomanToDecimal(s,len));
    }
}
