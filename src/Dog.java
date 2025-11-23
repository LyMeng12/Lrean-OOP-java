public class Dog extends Animal {
    public String name;
    public void sound(){
        System.out.println("Dog sound");
    }
    public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return this.name;
    }
}
