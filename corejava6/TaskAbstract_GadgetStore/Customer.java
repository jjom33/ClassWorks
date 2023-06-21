package corejava6.ElectronicShop;

public class Customer {
    String name;
    double giftcardBalance;
    public Customer(String name, int giftCardBalance){
        this.name =name;
        this.giftcardBalance = giftCardBalance;
    }
    public double getGiftCardBalance(){
        return this.giftcardBalance;
    }
    public String getName(){
        return this.name;
    }
    public void setGiftCardBalance(double newAmount){
        this.giftcardBalance = newAmount;
    }
}
