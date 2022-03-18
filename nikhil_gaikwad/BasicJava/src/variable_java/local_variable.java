package variable_java;

public class local_variable {
    public static void main(String[] args) {
        int x;
        if (args.length >0) {
            x = 10;
        } else {
            x = 20;
        }
        System.out.println(x);
    }
}
