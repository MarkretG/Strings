package Strings;

import java.util.ArrayList;
import java.util.Scanner;
class ShortestTime
{
    public static void  findShortTime(String[] times,int n)
    {
        ArrayList<Integer> hms=new ArrayList<Integer>();
        ArrayList<Integer> seconds=new ArrayList<Integer>();
        ArrayList<Integer> difference=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            String s=times[i];
            String[] s1=s.split(":");
            for(int j=0;j<3;j++)
            {
                hms.add(Integer.parseInt(s1[j]));
            }

        }

        for(int i=0;i<hms.size();i+=3)
            seconds.add(hms.get(i)*60*60+hms.get(i+1)*60+hms.get(i+2));

        for(int i=0;i<seconds.size()-1;i++)
        {
            for(int j=i+1;j<seconds.size();j++)
            {
                difference.add(Math.abs(seconds.get(i)-seconds.get(j)));
            }
        }

        for(int i=1;i<difference.size();i++)
        {
            if(difference.get(0)>difference.get(i))
                difference.set(0,difference.get(i));
        }
        System.out.println(difference.get(0)/3600+":"+(difference.get(0)/60)%60+":"+difference.get(0)%60);


    }
}

public class Time {
    public static void main(String[] args) {
        int n,i;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        String[] times=new String[n];
        for(i=0;i<n;i++)
            times[i]=sc.nextLine();
        ShortestTime.findShortTime(times,n);


    }
}
