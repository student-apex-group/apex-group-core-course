package variable_java;

public class static_variable_2 {
   static  int x=10;
    int y=20;

    public static void main(String[] args) {
        static_variable_2 r1=new static_variable_2();
        r1.x=888;
        r1.y=999;
        static_variable_2 r=new static_variable_2();
        System.out.println(r.x+"---"+r.y);

    }
}