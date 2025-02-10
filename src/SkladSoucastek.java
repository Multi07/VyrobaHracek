public class SkladSoucastek {
    private int hlava;
    private int telo;
    private int ruka;
    private int noha;
    private int panenka;

    public String VytvorHlavu() {
        hlava++;
        return "Hlava byla vytvořena, na skladu je: "+hlava;
    }
    public void VytvorTelo() {
        telo++;
    }
    public void VytvorRuka() {
        ruka++;
    }
    public void VytvorNoha() {
        noha++;
    }
    public synchronized boolean Vytvorpanenku() {
        if (hlava >=1 && telo >=1 && ruka >=2 && noha >=2) {
            hlava--;
            telo--;
            ruka-=2;
            noha-=2;
            panenka++;
            return true;
        }
        return false;
    }
}
