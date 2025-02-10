public class Stvoritel extends Delnik {
    public Stvoritel(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        super(name1, sklad, skladSoucastek);
    }
    private final int Pocet_Plastu =10;

    @Override
    public void run() {
        while (super.getSkladSoucastek().getPanenka()<10) {
            System.out.println("Stvoritel " + super.getName1() + " vyrábí Panenku");
            if (super.getSkladSoucastek().Vytvorpanenku()) {
                System.out.println("------------------------------------------------");
                System.out.println("Stvoritel "+super.getName1()+ " Dokončil Panenku");
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("Stvoritel čeká na Součástky");
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
