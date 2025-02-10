public class DHlava extends Delnik {
    public DHlava(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        super(name1, sklad, skladSoucastek);
    }
    private final int Pocet_Plastu =10;
    private final int Pocet_Vlasu = 2;

    @Override
    public void run() {
        while (super.getSkladSoucastek().getPanenka()<10) {
            System.out.println("Výrobce " + super.getName1() + " vyrábí hlavy");
            if (super.getSklad().uberPlast(Pocet_Plastu) && getSklad().uberVlasy(Pocet_Vlasu)) {
                super.getSkladSoucastek().VytvorHlavu();
                System.out.println("Výrobce "+super.getName1()+ " Dokončil hlavu");
            } else {
                System.out.println("Výrobce hlav čeká na Materiál");
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
