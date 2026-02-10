package Work2;

public class Cash extends Peyment{
    private int cash;

    public Cash(int cash) {
        this.cash = cash;
    }


    @Override
    public int Peyment() {
        return cash;
    }
}
