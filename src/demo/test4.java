package demo;

public class test4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("水仙花数有：");
        for(int i=100;i<1000;i++){
            a=i%10;
            b=i/10%10;
            c=i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.print(i+" ");
            }
        }
    }
}
