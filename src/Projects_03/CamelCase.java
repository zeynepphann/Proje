package Projects_03;

import java.util.Arrays;

    public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

        /*     Soru 1:
                CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
                büyük harfe çevirip geri döndüren metodun yazınız.
                 input:

               I lIVe in uSa

          Result should be

               I Live In Usa

         */
        public static void main(String[] args) {

            String cumle="I lIVe in uSa   ";
            String arr[]=cumle.split(" ");//oncelikle cumleyi kelimelere ayirdim
            System.out.println(Arrays.toString(arr));

            String sonHali=camelCase(arr,cumle);
            System.out.println(sonHali);
        }

        private static String camelCase(String[] arr, String cumle) {
            String sonHali="";
            for (int i = 0; i < arr.length ; i++) {
                sonHali += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase()+" ";
            }//daha sonra her kelimenin bas harfini buyuk, diger harflerini kucuk yaptim

            return sonHali;
        }
    }

