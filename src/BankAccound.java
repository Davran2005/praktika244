public class BankAccound {
    private String name;
    private String cartNumber;
    private String balance;

    public BankAccound(String name, String cartNumber, String balance) {
        this.name = name;
        this.cartNumber = cartNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccound{" +
                "name='" + name + '\'' +
                ", cartNumber='" + cartNumber + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
