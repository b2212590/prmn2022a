package lecture04;

import java.util.Scanner;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    void attack(Fighter enemy){
        enemy.hitPoint = enemy.hitPoint - power;
        System.out.println(name + "は" + enemy.name +"に" + power +"ダメージを与えた");
        System.out.println(enemy.name +"の残り　hitPoint :" + enemy.hitPoint);
        if(enemy.isAlive() !=true){
            System.out.println(enemy.name +"は倒れた");
        }

    }
    boolean isAlive(){
        if(hitPoint<0){
            return false;
        }
        return true;
    }

    int getHitPoint(){

        return hitPoint;
    }

    void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    static String getName(){
        System.out.println("名前を入力");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;

    }

}
