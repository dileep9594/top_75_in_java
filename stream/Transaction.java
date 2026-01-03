package stream;

public class Transaction {
    private String date ;
    private int amount ;

    public Transaction(String date, int amount){
        this.amount = amount ;
        this.date = date ;
    }

    public  String getDate(){
        return this.date ;
    }
    public int getAmount(){
        return this.amount ;
    }
}
