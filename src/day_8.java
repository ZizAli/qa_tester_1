//public class day_8 {
//    public static void main(String[] args) {
//
//        int[] a = {5,9,23,78,90,3,64};
//        int max = a[0];
//        int min = a[0];
//
//        for(int i=1; i<a.length; i++){
//            if(a[i] > max) {
//                max = a[i];
//            }
//           if(a[i] < min) {
//               min = a[i];
//            }
//            System.out.println("En boyuk eded " + max);
//            System.out.println("En kicik eded " + min);
//
//
//
//        }
//            }
//        }

//public class day_8 {
//    public static void main(String[] args) {
//
//        int[] a = {5, 9, 23, 78, 90, 3, 64};
//
//        int max = a[0];
//        int min = a[0];
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//            if (a[i] < min) {
//                min = a[i];
//            }
//        }
//
//        System.out.println("Ən böyük rəqəm: " + max);
//        System.out.println("Ən kiçik rəqəm: " + min);
//    }
//}

//public class day_8 {
//    public static void main(String[] args) {
//       int[] num= {8, 90, 87, 6, 4, 78, 998} ;
//       int max = num[0];
//       int min = num[0];
//       for(int i:num){
//           if(max < i ) {
//               max = i;
//           }
//           else if (min > i){
//               min= i;
//           }
//       }
//        System.out.println( "Kicik regem " + min);
//        System.out.println( "Boyuk regem " + max);
//    }
//}


//   public class day_8 {
//       public static void main(String[] args) {
//           int[] a={5,9,23,78,90,3,64,12,5,9,90,5,3,9};
//           for(int i = 0; i < a.length; i ++){
//               boolean a_duplic = false;
//               for(int j =i+1; j<a.length; j++){
//                   if(a[i]==a[j]){
//                       a_duplic = true;
//                       break;
//                   }
//               }
//               if (a_duplic){
//                   System.out.println(a[i] + " bu eded tekrarlandi");
//               }
//           }
//       }
//
//
//       }
public class day_8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 6, 3, 7, 1, 4, 6};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Tekrarlanan reqemler: " + a[i]);
                }
            }
        }
    }
}


//OOP TASKS
//public class day_8 {
//    public static void main(String[] args) {
//        class NewCar {
//            int say;
//            String ad;
//            String reng;            // masinin rengi
//            boolean buraxilish_teze;    //islenmis ya teze olmasi
//            boolean buraxilish_evvelki;
//            int qapi_sayi;
//            String model;          // modelin adi
//        }
//        NewCar car1 = new NewCar();
//        car1.say = 150;
//        car1.ad = "Audi Smart";
//        car1.reng = "qara";
//        car1.model= "Audi2025";
//        car1.qapi_sayi = 2;;
//        System.out.println(car1.say);
//        System.out.println(car1.reng);
//        System.out.println(car1.model);
//        System.out.println(car1.qapi_sayi);

//        NewCar car2 = new NewCar();
//        car2.say = 50;
//        car2.ad = "Audi Q7";
//        car2.reng = "Ag";
//        car2.model = "Audi2020";
//        car2.qapi_sayi = 4;
//        System.out.println(car2.say);
//        System.out.println(car2.reng);
//        System.out.println(car2.model);
//        System.out.println(car2.qapi_sayi);

//        NewCar car3 = new NewCar();
//        car3.say = 120;
//        car3.ad = "Mersedes AMG";
//        car3.reng = "Gold";
//        car3.model = "Mersedes 2025";
//        car3.qapi_sayi = 5;
//        System.out.println(car3.say);
//        System.out.println(car4.ad);
//        System.out.println(car3.reng);
//        System.out.println(car3.model);
//        System.out.println(car3.qapi_sayi);

//        NewCar car4 = new NewCar();
//        car4.say = 45;
//        car4.ad = "Tesla fly";
//        car4.reng = "white";
//        car4.model = "Tesla 2025";
//        car4.qapi_sayi = 4;
//        System.out.println(car4.say);
//        System.out.println(car4.reng);
//        System.out.println(car4.ad);
//        System.out.println(car4.model);
//        System.out.println(car4.qapi_sayi);

//        }
//}

//public class day_8 {
//    public static void main(String[] args) {
//        class NewBuldig {
//            int mertebe_sayi;
//            String seher;
//            int sayi;
//            String dizayn;
//            int balkon_sayi;
//            String reng;
//        }
//        NewBuldig bulding1 = new NewBuldig();
//        bulding1.balkon_sayi =2;
//        bulding1.dizayn = "Elit";
//        bulding1.mertebe_sayi = 21;
//        bulding1.seher = "Baki";
//        bulding1.reng = "Ag-Qara- shahmat";
//        System.out.println(bulding1.balkon_sayi);
//        System.out.println(bulding1.dizayn);
//        System.out.println(bulding1.sayi)
//        System.out.println(bulding1.mertebe_sayi);
//        System.out.println(bulding1.reng);
//        System.out.println(bulding1.reng);
//    }
//}

//public class day_8 {
//    public static void main(String[] args) {
//        class NewPaltar {
//            int sayi;
//            String material;
//            String dizayn;
//            String forma;
//            String reng;
//        }
////        NewPaltar paltar1 = new NewPaltar();
////        paltar1 .sayi =2;
////        paltar1.material = "Ipek";
////        paltar1.forma = "Kostyum";
////        paltar1.reng = "Yasil";
////
////        System.out.println(paltar1.sayi);
////        System.out.println(paltar1.dizayn);
////        System.out.println(paltar1.material);
////        System.out.println(paltar1.forma);
////
//
//        NewPaltar paltar2 = new NewPaltar();
//        paltar2 .sayi =2;
//        paltar2.material = "Spatel";
//        paltar2.forma = "Platya";
//        paltar2.reng = "Ag";
//        paltar2.dizayn = "casual";
//
//        System.out.println(paltar2.sayi);
//        System.out.println(paltar2.dizayn);
//        System.out.println(paltar2.material);
//        System.out.println(paltar2.forma);
//        System.out.println(paltar2.dizayn);
//
//    }
//}
//

