package simple.java.com;

import java.util.Scanner;

public class prime_or_notprime {
    public static void main(String[] args) {
        int n,count = 0;
        System.out.println("enter any no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }if(count==2){
            System.out.println("prime no");
        }else {
            System.out.println("not prime no");
        }
    }
}
