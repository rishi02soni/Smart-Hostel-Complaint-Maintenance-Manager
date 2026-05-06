public class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
