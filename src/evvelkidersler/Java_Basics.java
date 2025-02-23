package evvelkidersler;

public class Java_Basics {
    public static void main(String[] args) {

        //OPERATORS
        // Math operators * / + - ++ -- ^ ** % += -= *= /= %=
//    Boolean operators == != > < <= >= = ? : && ||
//        int a = 10;
//        System.out.println(a==10);

//        int a=5;
//        //postfix
//        System.out.println(a++);
//        System.out.println(a--);
//        System.out.println(a);
//        //prefix
//        System.out.println(--a);
//        System.out.println(++a);
//        int a=5;
//        a=a+1;
//        a+=1;

//        int a=10;
//        a %=3;
////        int qaliq = a%3;
//        System.out.println(a);
//        int a =18;
//        int b = 35;
//        && operatorunda true + true = true; false +true ve ya true + false = false; false + false = false;
//        || eger tereflerden biri truedursa cavab hemise truedur
//        System.out.println(a >=18 && b<35);
//        int c =25;
//        System.out.println(a >=18 && (b<35 || c==24));

//        Ternary operator
//        int a =17;
//        eger 18 den boyuk ve ya beraberdirse ekranda ala biler, deyilse ala bilmez gormeliyem
//        if(a>=18){
//            System.out.println("ala biler");
//        }else{
//            System.out.println("ala bilmez");
//        }
//        System.out.println(a>=18 ? "ala biler" : "ala bilmez");

//        Scope

        //scopelarda parent child elaqe var
//        int a;
//        {
//             a=10;
//        }
//        System.out.println(a);

        //Flow statements ve ya Control statements -> if, else if, else
//        if(true){
////            Emr vermeliyem, ve ya mentiqi kod yazmaliyam
//        }
//        int a= 18;
//        if(a>18){
//            System.out.println("Bu insan gencdir");
//        }else if(a<18){
//            System.out.println("Bu insan usaqdir");
//        }else{
//            System.out.println("Bu insanin 18 yashi var");
//        }

//        Switch case
//        String day = "Saturday";
//        switch(day){
//            case "Saturday","Sunday": {
//                System.out.println("Bu gun istirahet ");
//                break;
//            }
//             default:
//                System.out.println("Bu gun is gunudur");
//                break;
//        }
//        if(day =="Saturday" || day=="Sunday")
//            System.out.println("Bu gun istirahet ");
//        else System.out.println("Bu gun is gunudur");

        //LOOPS -- DONGU
        // 1. FOR LOOP
//        int[] reqemler = {1,2,3,4,5,6};
//        for(int i=0;i<reqemler.length;i++){
//            System.out.println("Salam dunya");
//        }
//        String[] meyveler = {"Alma","Armud"};

//         for(int i=0;i< meyveler.length;i++){
//             System.out.println(meyveler[i] + " dadlidir");
//         }

//        2. FOR EACH LOOP
        //break ve continue
//        String[] meyveler = {"Alma","Armud","Nar","Banan","Heyva"};
//        for(String meyve:meyveler){
//            if(meyve =="Armud" || meyve =="Banan"){
//                continue;
//            }
//            System.out.println(meyve + " dadlidir");
//        }

//        3. While and Do while loops
//        boolean isAlive = false;
//        while(isAlive){
//            System.out.println("Men nefes aliram");
//        }

//        do{
//            System.out.println("Men nefes aliram");
//        }
//        while(isAlive);

//        int yash =16;
//        while(yash<25){
//            System.out.println("Bu usaqdir");
//            yash++;
//            if(yash==18){
//                break;
//            }
//        }
//        do{
//        System.out.println("Bu usaqdir");
//            yash++;
//        }while(yash<18);

//        NESTED LOOP - ic ice loop
//        int[][] matrix = {{1,2,3},{4,5,6}};
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                matrix[i][j]+=10;
////                System.out.println(matrix[i][j]);
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
        //Tapshiriq matrix arrayle etdiyimizi for each le edin


  }
}


