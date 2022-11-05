package demo;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int [][]arr = new int[3][3];
        int []a = new int[3];
        int num=0;
        System.out.println("请依次输入三名学生的各科成绩");
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            num=0;
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scanner.nextInt();
                num+=arr[i][j];
            }
            a[i]=num;
        }
        System.out.println("该三名同学各自的总分为:");
        for(int i=0;i<arr.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
