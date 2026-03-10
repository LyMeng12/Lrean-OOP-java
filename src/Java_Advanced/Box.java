package Java_Advanced;

public class Box <T>{
    private T data;
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
}
