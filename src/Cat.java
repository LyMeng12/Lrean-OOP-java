public class Cat extends Animal{
    public String name;

    public void sound() {
        System.out.println("sound cat");
    }
    public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return this.name;
    }
}
