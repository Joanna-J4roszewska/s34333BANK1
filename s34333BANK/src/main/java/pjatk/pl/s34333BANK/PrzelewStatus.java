package pjatk.pl.s34333BANK;

public class PrzelewStatus {
    private String status;
    private String Accepted;
    private String Declined;

    boolean isAcepted = true;
    boolean isDeclined = false;

    public PrzelewStatus(String status, String accepted, String declined) {
        this.status = status;
        this.Accepted = accepted;
        this.Declined = declined;
    }
    public String getStatus() {
        return status;
    }
    public String getAccepted() {
        return Accepted;
    }
   public String getDeclined() {
        return Declined;
   }

}
