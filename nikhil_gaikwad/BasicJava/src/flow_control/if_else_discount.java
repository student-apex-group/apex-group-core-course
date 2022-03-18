package flow_control;

import java.util.Scanner;

public class if_else_discount {
    public static void main(String[] args) {
        int price=100;//int quantity=45;
        System.out.println("your product price"+ " "+price);
        //Scanner p =new Scanner(System.in);
        //int price=p.nextInt();
        System.out.println("enter the product quantity");
        Scanner q =new Scanner(System.in);
        int quantity=q.nextInt();

        double amount;
        double discount;
         amount =quantity*price;
        System.out.println("your product price is"+" "+amount);
         if(amount>2000){
             discount=amount*0.05;
             System.out.println("your discount is"+" "+discount);
             amount=amount-discount;
             System.out.println("you got 5% discount for your purchase:"+"  "+amount);
         }
         else{
             System.out.println("your purchase amount is low so you dont get any discount");
         }
    }

}
