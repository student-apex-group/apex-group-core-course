package simple.java.com;

public class A {
  void add (){   // method
       int a=10,b=20;
       System.out.println(a+b);
   }
    public static void main(String[] args) {
        A r=new A();//object
        r.disp();  //method call
       r.add();
    }
    void disp(){       //method
        System.out.println("learn coading");
    }
}
