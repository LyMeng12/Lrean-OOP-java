package Work2;

public class Peyment {
    private int price;
    private int quantity;
    public void setPayment(int payment ,int quantity) {
        this.price = payment;
        this.quantity = quantity;
    }

    public int Peyment(){
        return price * quantity;
    };
}
