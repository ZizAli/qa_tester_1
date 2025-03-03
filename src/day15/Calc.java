package day15;

public class Calc {
    public static double calculator(String name, double[] num) {
        double cavab = 0;

        switch (name) {
            case "toplama":
                for (double n : num) {
                    cavab += n;
                }
                break;

            case "cixma":
                cavab = num[0];
                for (int i = 1; i < num.length; i++) {
                    cavab -= num[i];
                }
                break;

            case "vurma":
                cavab = 1;
                for (double n : num) {
                    cavab *= n;
                }
                break;

            case "bolme":
                cavab = num[0];
                for (int i = 1; i < num.length; i++) {
                    if (num[i] == 0) {
                        throw new ArithmeticException("Uppsss: Sifira bolme yoxdur.");
                    }
                    cavab /= num[i];
                }
                break;

            default:
                System.out.println("Noooouuuu: Secdiyiniz emeliyyat duzgun deyil.");
                return -1;
        }

        return cavab;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 2, 0, 4};

        try {
            System.out.println("Toplama: " + calculator("toplama", numbers));
            System.out.println("Cixma: " + calculator("cixma", numbers));
            System.out.println("Vurma: " + calculator("vurma", numbers));
            System.out.println("Bolme: " + calculator("bolme", numbers));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
