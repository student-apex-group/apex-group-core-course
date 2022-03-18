package flow_control;

public class if_else_5 {
    public static void main(String[] args) {
        int mark=95;
        if(mark<50){
            System.out.println("fail");
        }
        else if(mark>=50&&mark<60){
            System.out.println("D grade");
        }
        else if(mark>=60&&mark<70){
            System.out.println("c grade");
        }
        else if(mark>=70&&mark<80){
            System.out.println("b grade");
        }
        else if(mark>=80&&mark<90){
            System.out.println("a grade");
        }
        else if(mark>=90&&mark<100){
            System.out.println("a+ grade");
        }
        else{
            System.out.println("invalid");
        }
    }
}
