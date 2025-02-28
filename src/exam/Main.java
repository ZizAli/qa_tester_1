package exam;

public class Main {
    public static int reHesab(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a++;
        }

    }


    public static void main(String[] args) {

        int a = 5;
        System.out.println("a-nin recursiv hesabalanmasi braberdir" + a);
    }
}

