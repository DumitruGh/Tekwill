public class Account {
    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance){
        this.id = id;
        this.code = code;
        this.balance = balance;
    }
        //Account{id=10, code='123-456-789', balance=2000}
    public String toString(){
        return "Account{id=" + id +"," + " code=" + code  +  "," + " balance=" + balance + "}";
    }
}
