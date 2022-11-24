package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください");
        String text = input.next();
        System.out.println( text+"と入力されました");
    }
}
