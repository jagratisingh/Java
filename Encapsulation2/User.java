package Encapsulation2;

public class User {
      public String getName() {
        return name;
    }
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String name;
      private int id;
       
}
