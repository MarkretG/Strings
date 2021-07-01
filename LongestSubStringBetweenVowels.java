/**
 * case 1:
 * alphabet
 * lph
 * case 2:
 * signal
 * gn
 * case 3:
 * america
 * m r c
 */

import java.util.Scanner;
public class LongestSubStringBetweenVowels {
    public static void subString(String str)
    {
        int k = 0,max=0,m=0;
        int[] a = new int[10];
        String s;
        String[] sub=new String[10];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                a[k] = i;
                k++;
            }
        }
        for (int i =0; i < k; i++) {
            int len;
            if (i + 1 < k) {
                s = str.substring(a[i]+1,a[i + 1]);
                len = s.length();
                if (len>=max) {
                     max = len;
                     sub[m]=s;
                    m++;              
                }
               
            }
        }
         int maxLength=sub[0].length();
        for(int j=1;j<m;j++)
            if(sub[j].length()>maxLength)
                maxLength=sub[j].length();

        for (int j=0;j<m;j++)
            if(sub[j].length()==maxLength)
                System.out.println(sub[j]);
       
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        subString(str);
    }
}
