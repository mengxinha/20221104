package demo;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.println("请依次输入三科成绩");
        Scanner scanner = new Scanner(System.in) ;
        int num=0;
        int []arr= new int[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=scanner.nextInt();
            num+=arr[i];
        }
        System.out.println("这三科的总分为："+num);
    }
}
