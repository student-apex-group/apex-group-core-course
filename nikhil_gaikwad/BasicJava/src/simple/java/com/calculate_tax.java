package simple.java.com;

import java.util.Scanner;

public class calculate_tax {
    public static void main(String[] args) {
        int sal;
        double tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary");
        sal=sc.nextInt();
        if(sal<=10000){
            System.out.println("your sal is"+sal+"no tax");
        }
        else if(sal>10000&&sal<=100000){
            tax=sal*0.10;
            System.out.println("your sal is"+sal+" "+tax);
        }
        else if(sal>100000){
            tax=sal*0.20;
            System.out.println(sal+" "+tax);
        }
    }
}
