package main_method;

public class p {
    public static void main(String[] args) {
        System.out.println("parent main");
    }
}
class c extends p{
    public static void main(String[] args) {
        System.out.println("child main");
    }
}