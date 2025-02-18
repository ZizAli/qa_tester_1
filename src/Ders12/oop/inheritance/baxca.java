package Ders12.oop.inheritance;

public class baxca extends mekteb{
    int yash = 3;
    final int MAXBAXCA_YASHI = 6;


    //overriding
    @Override
    public void levazimat() {
        System.out.println("Baxcalar oyuncaqla temin edilir");
    }
}
