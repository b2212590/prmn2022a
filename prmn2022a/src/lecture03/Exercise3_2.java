package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("何行分入力しますか?" );
        int num = input.nextInt();
        ArrayList<String> bun = new ArrayList<String>();
        for(int i= 0;i<num;i++){
            System.out.println("入力してください");
            String text = input.next();
             bun.add(text);
        }
        System.out.println("入力した文字列:");
        for(String buns :bun){
            System.out.println(buns);

        }
    }
}
