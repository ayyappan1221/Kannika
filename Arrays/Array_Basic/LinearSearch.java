import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int x=sc.nextInt();
        int f=-1;
        for(int i=0;i<n;i++)if(a[i]==x){f=i;break;}
        if(f!=-1)System.out.println("Found at index "+f);
        else System.out.println("Not found");
    }
}