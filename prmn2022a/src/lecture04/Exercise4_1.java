package lecture04;



public class Exercise4_1 {
    public static void main(String[] args) {

        String name1 = Fighter.getName();
        Fighter fighter1 = new Fighter(210,100,name1);
        String name2 = Fighter.getName();
        Fighter fighter2 = new Fighter(180,150,name2);

        while(true){
            fighter1.attack(fighter2);
            if(fighter2.isAlive()!=true){
                break;
            }
            fighter2.attack(fighter1);
            if(fighter1.isAlive()!=true){
                break;
            }
        }

    }

}
