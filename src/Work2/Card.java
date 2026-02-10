package Work2;

public class Card extends Peyment {
    private int card;
    public Card(int card) {
        this.card = card;
    }


    @Override
    public int Peyment() {
        return card;
    }
}
