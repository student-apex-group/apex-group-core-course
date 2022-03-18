package oprator_assignment;

public class equality_operator_obj {
    public static void main(String[] args) {
        Thread t1= new Thread();// obj
        Thread t2= new Thread();// obj
        Thread t3=t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
