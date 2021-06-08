/*
   input:hello world
   output:olleh dlrow
 */

package Task;
import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        String s;
        int i,j,k,pos=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char[] ch=s.toCharArray();
            for (i = 0; i < ch.length; i++) {
               if (ch[i] == ' ') {
                    for (j = i-1;j >= pos; j--)
                        System.out.print(ch[j]);
                   System.out.print(" ");
                    pos=i+1;
                }
                 if (i ==ch.length-1) {
                    for (k = i; k >= pos; k--)
                        System.out.print(ch[k]);
                }
            }
    }
}
