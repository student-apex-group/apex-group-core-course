package variable_java;

public class instance_variable
{
    int x=10;
public static void main(String[]args){
    //System.out.println(x);                not directally print
    instance_variable i=new instance_variable();// object
   System.out.println(i.x);// instance variable print
      }
      public void m1(){
       System.out.println(x);
      }
}
