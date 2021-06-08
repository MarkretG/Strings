package Strings;

import java.util.ArrayList;
import java.util.Scanner;
class Convert
{
    public static  ArrayList<String> convert(String str)
    {
        ArrayList<String> words=new ArrayList<String>();
        int j=0;
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '|| i==str.length()-1)
            {
                String word="";
                        while(j<=i)
                        {
                            word= word+str.charAt(j);
                            j++;
                        }
                        j=i+1;
                        words.add(word);
            }
        }
        return words;
    }
}
class Fragment
{
    public static void common(String[] str,int n)
    {
        String str2, str1="";
        for(int k=0;k<str.length;k++)
            str1 = str1+str[k] + " ";

        str2=str[0];
        ArrayList<String> one= Convert.convert(str2);
        ArrayList<String> full=Convert.convert(str1);
        for(String k:one)
        {
            int count=0;
            for(int j=0;j<full.size();j++)
            {
                if(k.equals(full.get(j)))
                    count++;
            }
            if(count==n)
                System.out.print(k);

        }
    }
}

public class CommonFragment {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String[] str=new String[n];
        sc.nextLine();
        for(i=0;i<n;i++)
            str[i] = sc.nextLine();
        Fragment.common(str,n);
    }
}
