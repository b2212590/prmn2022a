package lecture04;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    ArrayList<Account> accountList = new ArrayList<>();
    ATM(){
        this.accountList = accountList;
    }
    void registerAccount(String name, String number){

        Account u1 = new Account(name,number);
        accountList.add(u1);
        System.out.println(name + "さんのアカウントを口座番号:"+ number + "で登録しました。");

    }
    boolean existsAccount(String name,String number){
        for(Account user : accountList) {
            if (name.equals(user.getName()) && number.equals(user.getNumber())) {
                return true;
            }
        }
        return false;
    }

    void deposit(String number,long money){
        for(Account user : accountList) {
            if (number.equals(user.getNumber())) {
                long money1 = user.getBalance() + money;
                user.setBalance(money1);
            }
        }

    }


    long withdraw(String number,long money){
        for(Account user : accountList) {
            if (number.equals(user.getNumber())) {
                if(user.getBalance() < money){
                    return (-1)*user.getBalance();
                }else{
                    long money1 = user.getBalance() - money;
                    user.setBalance(money1);
                    return money1;
                }
            }
        }
        return 0;

    }
}
