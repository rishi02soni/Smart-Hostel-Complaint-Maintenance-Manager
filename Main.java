import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rishi", 101);
        Admin admin = new Admin("Manager", 1);

        Complaint c1 = new ElectricComplaint(1, "Fan not working");
        Complaint c2 = new PlumbingComplaint(2, "Water leakage");

        ArrayList<Complaint> complaints = new ArrayList<>();
        complaints.add(c1);
        complaints.add(c2);

        s1.raiseComplaint();

        System.out.println("\nAll Complaints:");
        for (Complaint c : complaints) {
            c.displayComplaint();
            System.out.println("----------------");
        }

        admin.solveComplaint(c1);

        System.out.println("\nUpdated Complaint:");
        c1.displayComplaint();
    }
}
