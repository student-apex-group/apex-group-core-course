package array.java;

public class arry_3d {
    public static void main(String[] args) {
        int[][][]x={{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
       // System.out.println(x[0][1][2]);
     //  System.out.println(x[1][0][1]);
      /*  for(int i=0;i< x.length;i++){
        }
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++){
                   System.out.println(x[i][j][k]);
                }
           }*/
        for(int [][]x1:x){
            for(int []x2:x1){
                for(int x3:x2){
                    System.out.println(x3);
                }
            }
        }
    }
}
