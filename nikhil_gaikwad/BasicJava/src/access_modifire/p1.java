package access_modifire ;
// abstract class

 abstract class p1 {
     public abstract void m1();//abstract m1 method
     public abstract void m2();//abstract m2 method
}
  abstract class c1 extends p1{//class extends
     public  void m1(){
         System.out.println("m1 method");//abstract m1 method body
     }
     public void m2(){
         System.out.println("m2 method");// abstract m2 method body
     }
     public abstract void m3();// abstract  m3 method

}
  class l1 extends c1{
     public void m3(){
         System.out.println("m3 method");//abstract m3 method body
     }
     public void m4(){
         System.out.println("m4 method");
     }

      public static void main(String[] args) { //main method
          l1 obj=new l1();// class l1 object
          obj.m1();//method m1 call
          obj.m2();//method m2 call
          obj.m3();//method m3 call
          obj.m4();//method m4 call
      }
 }
