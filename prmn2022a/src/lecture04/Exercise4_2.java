package lecture04;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.print("名前の入力:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("口座番号の入力");
        String number = input.next();
        if(atm.existsAccount(name,number)){
            System.out.println("名前:"+name + "口座番号:" + number +"は存在します");
        }else{
            System.out.println("名前:"+name + "口座番号:" + number +"は存在しません");
            atm.registerAccount(name,number);
        }

        System.out.println("入金金額を入力してください");
        long money1 = input.nextLong();
        atm.deposit(number,money1);
        System.out.println("口座番号:" + number +"に" + money1 + "円入金しました");
        System.out.println("引き出す金額を入力してください");
        long money = input.nextLong();
        long m1=atm.withdraw(number,money);
        if(m1==0){
            System.out.println("口座番号:" + number +"は存在しません。");
        }else if(m1<0){
            System.out.println("口座番号:" + number + "から" + money + "円引き出せませんでした");
            System.out.println("残高" + (0 - m1) +"円です");
        }else{
            System.out.println("口座番号:" + number + "から" + money + "円引き出しました");
            System.out.println("残高" + m1 +"円です");
        }
        long m2 =atm.withdraw(number,500);

    }
}
