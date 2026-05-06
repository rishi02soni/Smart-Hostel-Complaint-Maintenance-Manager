public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void solveComplaint(Complaint c) {
        c.setStatus("Resolved");
        System.out.println("Complaint Resolved by Admin.");
    }
}
