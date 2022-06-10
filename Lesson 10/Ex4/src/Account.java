public class Account {
    private long balance;
    private String ownerName;
    private boolean locked;

    public Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void isLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }
}
