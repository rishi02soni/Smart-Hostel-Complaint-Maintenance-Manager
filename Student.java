public class Student extends User {

    public Student(String name, int id) {
        super(name, id);
    }

    public void raiseComplaint() {
        System.out.println(name + " raised a complaint.");
    }
}
