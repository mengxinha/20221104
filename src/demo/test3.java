package demo;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        while (true){
            System.out.print("请输入两个非负数：");
            Scanner scanner = new Scanner(System.in);
            a= scanner.nextInt();
            b=scanner.nextInt();

            if(a>0&&b>0){
                System.out.println("这两个数的和为："+(a+b));
            }
            else
                System.out.println("输入数错误");
        }
    }
}
