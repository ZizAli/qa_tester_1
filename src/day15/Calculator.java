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

//Task2.1

//public class Calculator{
//    public static double calculator(int[] regem){
//        int cavab =1;
//        for(int r:regem){
//            cavab *= r;
//            if (cavab ==0){ return 0; }
//        }
//        return cavab;
//
//    }
//
//    public static void main(String[] args) {
//        int [] regem = {1,4,0,7,9};
//        System.out.println(calculator(regem));
//    }
//}

//Task2.2
public class Calculator{
    public static double calculator(int[] regem){
        int cavab =0;
        for(int r:regem){
            cavab += r;
            if (cavab ==0){ return 0; }
        }
        return cavab;

    }

    public static void main(String[] args) {
        int [] regem = {1,4,0,7,9};
        System.out.println(calculator(regem));
    }
}