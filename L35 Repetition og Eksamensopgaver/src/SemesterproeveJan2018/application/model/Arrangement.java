package SemesterproeveJan2018.application.model;

public class Arrangement {
    private String titel;
    private String date;
    private String startTid;
    private String slutTid;
    private Double pris;
    public Arrangement(String titel, String date, String startTid, String slutTid, Double pris) {
        this.titel = titel;
        this.date = date;
        this.startTid = startTid;
        this.slutTid = slutTid;
        this.pris = pris;
    }

    public String getTitel() {
        return titel;
    }

    public String getDate() {
        return date;
    }

    public String getStartTid() {
        return startTid;
    }

    public String getSlutTid() {
        return slutTid;
    }

    public Double getPris() {
        return pris;
    }
}
