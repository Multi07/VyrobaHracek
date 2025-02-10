public class SkladSoucastek {
    private int hlava =0;
    private int telo=0;
    private int ruka=0;
    private int noha=0;
    private int panenka=0;

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
        if (hlava >=1 && telo >=1 && ruka >=1 && noha >=1) {
            hlava--;
            telo--;
            ruka--;
            noha--;
            panenka++;
            return true;
        }
        return false;
    }

    public int getPanenka() {
        return panenka;
    }
}
