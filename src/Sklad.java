public class Sklad {
    private int plast = 10000;
    private int vlasy = 1000;

    public synchronized boolean uberPlast(int pocet) {
        if (plast >= pocet) {
            plast -= pocet;
            return true;
        }
        return false;
    }
    public synchronized boolean uberVlasy(int pocet) {
        if (vlasy >= pocet) {
            vlasy -= pocet;
            return true;
        }
        return false;
    }
    public synchronized void pridejVlasy(int pocet) {this.vlasy+=pocet;}
    public synchronized void pridejPlast(int pocet) {this.plast+=pocet;}

    public int getPocitadloOdbavenychCestujicih() {
        return plast;
    }
}
