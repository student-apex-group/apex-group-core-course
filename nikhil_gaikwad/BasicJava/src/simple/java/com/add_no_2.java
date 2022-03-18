package simple.java.com;
import java.util.Scanner;
public class add_no_2 {
    public static <scanner> void main(String[] args) {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no");
num1=sc.nextInt();
        System.out.println("enter second no");
        num2=sc.nextInt();
        sc.close();
        sum=num1+num2;
        System.out.println("sum of these no:"+sum);
    }
}
