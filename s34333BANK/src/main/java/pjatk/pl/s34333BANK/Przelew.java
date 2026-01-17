package pjatk.pl.s34333BANK;

public class Przelew {
    private String klientID;
    private String wartoscPrzelew;
    private String saldo;
    private String imie;

    public Przelew(String klientID, String wartoscPrzelew, String saldo, String imie) {
        this.klientID = klientID;
        this.wartoscPrzelew = wartoscPrzelew;
        this.saldo = saldo;
        this.imie = imie;
    }
    public String getKlientID() {
        return klientID;
    }
    public String getWartoscPrzelew() {
        return wartoscPrzelew;
    }
    public String getSaldo() {
        return saldo;
    }
}
