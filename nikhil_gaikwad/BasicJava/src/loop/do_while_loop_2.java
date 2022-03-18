package loop;

public class do_while_loop_2 {
    public static void main(String[] args) {
        int x=21,sum=0;
        do{
            sum+=x;
            x--;
        }while(x>10);
        System.out.println(sum);
    }
}
