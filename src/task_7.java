//Tapshiriq matrix arrayle etdiyimizi for each le edin

//public class task_7 {
//    public static void main(String[] args) {
////        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7,8,9}};
////        for (int[] i : matrix) {
////            for (int numbers : i) {
////                System.out.print(numbers+ " ");
////            }
////        }
//
//
//        String[][] gul = {{"Lale", "Nergiz", "Qerenfil"}, {"Qizilgul", "Etirshah", "Yasemen"}};
//        for (String[] cicek : gul) {
//            for (String adlar : cicek) {
//                System.out.println(adlar + " etirlidir ");
//            }
//        }
//    }
//}

        // NETICE:
//        Lale etirlidir
//        Nergiz etirlidir
//        Qerenfil etirlidir
//        Qizilgul etirlidir
//        Etirshah etirlidir
//        Yasemen etirlidir

public class task_7{
    public static void main(String[] args) {
       String[] cicekler = {"Lale", "Nergis", "Yasemen", "Qizilgul"};
       for(String gul:cicekler){
//           if(gul== "Yasemen"){
//               break;
//           }
//           System.out.println(gul+ " menim xosuma gelir");
           //netice:
           // Lale menim xosuma gelir
           //Nergis menim xosuma gelir
            if (gul== "Nergis"){
                continue;
            }
           System.out.println(gul+ " menim xosuma gelir");
            //netice:
           // Lale menim xosuma gelir
           //Yasemen menim xosuma gelir
           //Qizilgul menim xosuma gelir

       }




    }
}