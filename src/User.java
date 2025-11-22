public class User {
    // id username , email ,password used -->private
    // method get() set() used --> public
    private int id;
    private String Username;
    private String Password;
    private String Email;

    // Method set() -->void with param
    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String Username){
        this.Username = Username;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    // Method get() --> return type on param
    public int getId(){
        return id;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public String getEmail(){
        return Email;
    }


}
