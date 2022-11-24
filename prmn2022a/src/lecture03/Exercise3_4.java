package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> veg = new ArrayList<>();
        Vegetable veg1 = new Vegetable("にんじん" ,117);
        Vegetable veg2 = new Vegetable("たまねぎ" ,120);
        Vegetable veg3 = new Vegetable("じゃがいも" ,154);
        veg.add(veg1);
        veg.add(veg2);
        veg.add(veg3);
        for(Vegetable vegs:veg){
            vegs.print();
        }

    }
}
