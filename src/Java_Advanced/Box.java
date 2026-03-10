package Java_Advanced;

public class Box <T,U>{
    private T t;
    private U u;
    public Box(T t, U u){
        this.t = t;
        this.u = u;
    }
    public T getT() {
        return t;
    }
   public U getU() {
        return u;
   }
}
