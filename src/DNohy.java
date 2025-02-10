public class DNohy extends Delnik {
    public DNohy(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        super(name1, sklad, skladSoucastek);
    }
    private final int Pocet_Plastu =15;

    @Override
    public void run() {
        while (super.getSkladSoucastek().getPanenka()<10) {
            System.out.println("Výrobce " + super.getName1() + " vyrábí nohu");
            if (super.getSklad().uberPlast(Pocet_Plastu)) {
                super.getSkladSoucastek().VytvorNoha();
                System.out.println("Výrobce "+super.getName1()+ " Dokončil nohu");
            } else {
                System.out.println("Výrobce nouhou čeká na Materiál");
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
