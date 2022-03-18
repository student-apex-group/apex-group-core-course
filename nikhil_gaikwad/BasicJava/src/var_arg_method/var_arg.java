package var_arg_method;

public class var_arg {
    public static void main(String[] args) {
        sum();
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
    }
    public static void sum(int...x){     // var arg method
        int total=0;
        for(int x1:x){
            total=total+x1;
        }
        System.out.println("total sum"+total);
    }
}
