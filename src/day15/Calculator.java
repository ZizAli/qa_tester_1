package day15;

/*
Write a Java program to calculate given inputs. (sum,subtract,divide,multiply)

//FOR EXAMPLE : input
int[] numbers = {1,2,0,4}
calculator("multiply",numbers);

//output
0 (because of multiply)

//FOR EXAMPLE : input
int[] numbers = {1,2,0,4}
calculator("sum",numbers);

//output
7 (because of sum)
 */

//public class Calculator {
//    public static void main(String[] args) {
//        int [] n = {2,8,9,4,1};
//        int a = n.length;
//        int sum = 0;
//
//        for (int i =0; i<a; i++ ){
//            sum += n[i];
//        }
//        System.out.println("Sum of elements array: " + sum);
//
//
//    }
//}
//public class Calculator {
//    public static void main(String[] args) {
//        int [] n = {2,8,9,4,1};
//        int a = n.length;
//        int subs = 0;
//
//        for (int i =0; i<a; i++ ){
//            subs -= n[i];
//        }
//        System.out.println("Substraction of elements array: " + subs);
//
//
//    }
//}

//public class Calculator {
//    public static void main(String[] args) {
//        int [] n = {2,8,9,4,0};
//        int a = n.length;
//        int div = 1;
//
//        for (int i =0; i<a; i++ ){
//            div *= n[i];
//        }
//        System.out.println("Divaded of elements array: " + div);
//
//
//    }
//}
public class Calculator {
    public static void main(String[] args) {
        double[] num = {10, 2, 5, 9};

        double n = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] != 0) {
                n /= num[i];
            } else {
                System.out.println("Cannot divide by zero!");
                return;
            }
        }
        System.out.println("Dvide of the numbers: " + n);
    }
}
