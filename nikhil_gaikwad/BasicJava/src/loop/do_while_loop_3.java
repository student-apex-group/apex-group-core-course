package loop;

import java.util.Scanner;

public class do_while_loop_3 {
    public static void main(String[] args) {
        int sum = 0, num = 0;
        Scanner sc = new Scanner(System.in);

        do {
            sum = sum + num;
            System.out.println("enter a no");
            num = sc.nextInt();
        } while (num >= 0);
        System.out.println("the sum of given no :"+sum);
    }
}