package lecture04;

public class Account {
    private String name;
    private String number;
    private long balance;

    Account(String name,String number){
        this.balance = 0;
        this.name = name;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    public long getBalance(){
        return balance;
    }






}
