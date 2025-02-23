package exeptions;

public class Ae {
    public static double calculator(int i, int j){
        try {
            if(j == 0) throw new ArithmeticException(" \nSifira bolunme olmaz");
            return i/j;
        }
        catch (ArithmeticException e) {
            System.out.println("Riyazi hesablama xetasi" + e.getMessage());
            return 0.0;
        }
        catch ( Exception e){
            System.out.println("Bolunmede xeta" + e.getMessage());
            return  -1;
        }
        finally {
            System.out.println("Temizlendi");
        }

    }

    public static void main(String[] args) {
        int a =10;
        int b = 0;
        if (b==0) throw new RuntimeException("Xetali emeliyyet");
        double cavab = calculator(10, 0);
        System.out.println(cavab);
    }
}
