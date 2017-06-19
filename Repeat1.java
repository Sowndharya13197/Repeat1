import java.io.*;
import java.util.*;
public class Repeat {
    public static void main(String args[])
    {
        int n,i;
        int min=-1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        HashSet <Integer> hs=new HashSet<Integer>();
        for(i=0;i<n;i++)
        { a[i]=s.nextInt(); 
     }
     for(i=n-1;i>=0;i--)
     {
       
        if(hs.contains(a[i]))
        {min=i;
     }else
        {
     
     hs.add(a[i]);
    
     }   }  
             
          if(min!=-1)
        {
            System.out.println(a[min]);
        }
    }
}
