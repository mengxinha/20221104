package demo;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a=0;
        System.out.print("请输入成绩:");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        if(a>=90){
            System.out.println("A");
        }
        else if(80<=a&&a<90){
            System.out.println("B");
        }
        else if(70<=a&&a<80){
            System.out.println("C");
        }
        else if(60<=a&&a<70){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }
}
