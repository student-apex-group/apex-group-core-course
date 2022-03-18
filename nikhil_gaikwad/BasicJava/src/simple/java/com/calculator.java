package simple.java.com;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // calculator
        int n1,n2,ch,result;
        System.out.println("enter two no");
        Scanner sc=new Scanner(System.in);
        n1= sc.nextInt();
        n2=sc.nextInt();
        System.out.println("the n1 is:"+n1+" "+"and n2 is:"+n2);
        System.out.println("enter the choise");
        System.out.println("1:addition");
        System.out.println("2:substraction");
        System.out.println("3:multiplication");
        System.out.println("4:division");
        ch=sc.nextInt();
        if (ch==1){
            result=n1+n2;
            System.out.println("addition of no is:"+result);
        }
        else if(ch==2){
            result=n1-n2;
            System.out.println("substraction of no is:"+result);

        }
        else if(ch==3){
            result=n1*n2;
            System.out.println("multiplication of no is:"+result);

        }
        else if(ch==4){
            result=n1/n2;
            System.out.println("division of no is:"+result);

        }else{
            System.out.println("you choose wrong no");
        }

    }
}
