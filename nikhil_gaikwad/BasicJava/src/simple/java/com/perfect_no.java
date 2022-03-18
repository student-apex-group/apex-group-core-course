package simple.java.com;

import java.util.Scanner;

public class perfect_no {
    public static void main(String[] args) {
        // perfect no
        // input no 6 = 1 2 3 4 5
        //6=1+2+3 perfect no
        int n,sum = 0;
        System.out.println("enter any no");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(sum);
            }

        }
            if(n==sum){
                System.out.println("perfect no");
            }else
            {
                System.out.println("not perfect no");
            }
        }
    }
