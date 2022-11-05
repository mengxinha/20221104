import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int index = 0;
        int sum = 0;
        while (str1.indexOf(str2,index) != -1){
            index = str1.indexOf(str2,index)+1;
            sum ++;
        }
        System.out.println("出现的次数是：" + sum);

    }
}
