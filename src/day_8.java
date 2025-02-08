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



   public class day_8 {
       public static void main(String[] args) {
           int[] a={5,9,23,78,90,3,64,12,5,9,90,5,3,9};
           for(int i = 0; i < a.length; i ++){
               for(int j =i+1; j<a.length; j++){
                   if(a[i]==a[j]){
                       System.out.println(a[i]);
                   }
               }
           }
       }


       }




