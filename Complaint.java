public class Complaint {
    protected int complaintId;
    protected String issue;
    protected String status;

    public Complaint(int complaintId, String issue) {
        this.complaintId = complaintId;
        this.issue = issue;
        this.status = "Pending";
    }

    public void displayComplaint() {
        System.out.println("Complaint ID: " + complaintId);
        System.out.println("Issue: " + issue);
        System.out.println("Status: " + status);
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
