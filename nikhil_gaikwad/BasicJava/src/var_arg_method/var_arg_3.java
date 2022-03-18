package var_arg_method;

public class var_arg_3 {
   static void display(String...values){
      for(String s:values){
         System.out.println(s);
      }
   }

   public static void main(String[] args) {
      display();                         //zero arg
      display("hello");           //one arg
      display("my"," name" ,"is"," nikhil");//four arg
   }
}
