public class ElectricComplaint extends Complaint {
 
    public ElectricComplaint(int id, String issue) {
        super(id, issue);
    }

    @Override
    public void displayComplaint() {
        System.out.println("⚡ Electric Complaint");
        super.displayComplaint();
    }
}
