package simple.java.com;

import java.util.Scanner;

public class copy_array {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  arry value");
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("first arry element");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("second arry element");
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
}
