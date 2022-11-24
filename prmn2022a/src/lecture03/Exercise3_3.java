package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1番目の整数を入力してください:");
        String num1 = input.next();
        System.out.print("2番目の整数を入力してください:");
        String num2 = input.next();
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        System.out.println(num1 + "+" + num2  + "=" + (n1+n2));


    }
}
