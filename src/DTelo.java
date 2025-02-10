public class DTelo extends Delnik {
    public DTelo(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        super(name1, sklad, skladSoucastek);
    }
    private final int Pocet_Plastu =50;
    @Override
    public void run() {
        while (true) {
            System.out.println("Výrobce těla " + super.getName1() + " vyrábí tělo");
            if (super.getSklad().uberPlast(Pocet_Plastu)) {
                super.getSkladSoucastek().VytvorTelo();
                System.out.println("Výrobce těla "+super.getName1()+ "Dokončil tělo");
            } else {
                System.out.println("Výrobce těl čeká na Materiál");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
