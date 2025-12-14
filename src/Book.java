public class Book {
    private int id;
    private String title;
    private double price;

    public Book(int id , String title , double price ){
        this.id = id;
        this.title=title;
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
    public void display(){
        System.out.println("ID: "+id+"\tTitle: "+title+"\tPrice:$ "+getPrice());
    }
}
