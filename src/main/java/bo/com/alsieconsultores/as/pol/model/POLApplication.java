package bo.com.alsieconsultores.as.pol.model;

public class POLApplication {
    private POLApplicationPersonalInfo polApplicationPersonalInfo;
    private POLApplicationResume polApplicationResume;

    public POLApplication() {
    }

    public POLApplicationPersonalInfo getPolApplicationPersonalInfo() {
        return polApplicationPersonalInfo;
    }

    public void setPolApplicationPersonalInfo(POLApplicationPersonalInfo polApplicationPersonalInfo) {
        this.polApplicationPersonalInfo = polApplicationPersonalInfo;
    }

    public POLApplicationResume getPolApplicationResume() {
        return polApplicationResume;
    }

    public void setPolApplicationResume(POLApplicationResume polApplicationResume) {
        this.polApplicationResume = polApplicationResume;
    }
}
