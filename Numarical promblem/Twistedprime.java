import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int count=0;

        // check prime
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count!=2){
            System.out.println("Not a Twisted Prime");
            return;
        }

        // reverse number
        int temp=n;
        int rev=0;

        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }

        int count2=0;

        // check prime for reversed number
        for(int i=1;i<=rev;i++){
            if(rev%i==0){
                count2++;
            }
        }

        if(count2==2)
            System.out.println("Twisted Prime");
        else
            System.out.println("Not a Twisted Prime");

        sc.close();
    }
}
