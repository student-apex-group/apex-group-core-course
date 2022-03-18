package simple.java.com;

import java.util.Scanner;

public class find_array_element {
    public static void main(String[] args) {
        int n;
        int count=0;
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array element is");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter search element");
        n=sc.nextInt();
        for(int i=0;i< a.length;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("item found"+"  " +count+"times");
        }
        else{
            System.out.println("item not found");
        }


    }
}
