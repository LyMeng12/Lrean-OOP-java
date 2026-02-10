package Work2;

public class Mobile extends Peyment{
    private int mobile;

    public Mobile(int mobile){
        this.mobile = mobile;
    }

    @Override
    public int Peyment() {
        return mobile;
    }
}
