public abstract class Delnik extends Thread {
    private String name1;
    private Sklad sklad;
    private SkladSoucastek skladSoucastek;

    public Delnik(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        this.name1 = name1;
        this.sklad = sklad;
        this.skladSoucastek = skladSoucastek;
    }

    public String getName1() {
        return name1;
    }

    public Sklad getSklad() {
        return sklad;
    }

    public SkladSoucastek getSkladSoucastek() {
        return skladSoucastek;
    }
}
