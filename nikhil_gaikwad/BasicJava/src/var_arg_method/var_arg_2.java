package var_arg_method;

public class var_arg_2 {
    void add(int...a){            //var arg method
        int sum=0;
        for(int x:a) {           // for each loop
            sum = sum + x;
        }

        System.out.println(sum);
    }
   static class  test{
        public static void main(String[] args) {
            var_arg_2 r=new var_arg_2();    // object
            r.add();r.add(10,20);//method call
        }
    }
}
