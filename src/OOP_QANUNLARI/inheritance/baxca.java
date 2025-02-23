package OOP_QANUNLARI.inheritance;

public class baxca extends TehsilNazirliyi{
    final double MINYASH = 1.5;
    final int MAXBAXCA_YASHI = 6;


    //overriding
    @Override
    public void levazimat() {
        System.out.println("Baxcalar oyuncaqla temin edilir");
    }
}
