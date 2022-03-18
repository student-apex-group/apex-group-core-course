package array.java;

public class array_1_d_string {
    public static void main(String[] args) {
        String[]s={"one","two","three","four"};
        System.out.println("these are element are one dimensional array");
        //for(int i=0;i<s.length;i++){
          //  System.out.println(s[i]);
       // }
        for(String s1:s ){
            System.out.println(s1);
        }
    }
}
