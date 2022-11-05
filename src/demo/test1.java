package demo;

public class test1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.print("最大值为：");
        if(a>b){
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }
        else if(b>a){
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
    }
}
