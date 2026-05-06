public class PlumbingComplaint extends Complaint {

    public PlumbingComplaint(int id, String issue) {
        super(id, issue);
    }

    @Override
    public void displayComplaint() {
        System.out.println("🚿 Plumbing Complaint");
        super.displayComplaint();
    }
}
