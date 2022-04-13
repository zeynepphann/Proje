package deneme;


import java.util.ArrayList;


import java.util.List;

public class removeDuplicates<arr> {
    /*
       Verilen int array
       duplicated(tekrarlanan) öğeleri array den kaldır
      non-duplicated(tekrarlanmayan) öğe sayisini print et
       Örnek:
       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
       //1 2 2 2 3 3 3 4 4 4 5 5 5
       result  5 olmalı
       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,4,4,7,8,8,9,4,5,5,5};

        List<Integer> tekrarlanan = new ArrayList<>();

        for (Integer each : arr){
            if (!tekrarlanan.contains(each)){ //contain ile sayi tekrarliyor mu diye kontrol ettim
                tekrarlanan.add(each);        // tekrar etmiyorsa ekle dedim.
            }
        }

        System.out.println("sonuc : "  + tekrarlanan.size()); // sayi icinde ki index adedini yazdirdim
        System.out.println("sda;laskd'al;");
        System.out.println("sda;laskd'al;");
        System.out.println("sda;laskd'al;");
        System.out.println("sda;laskd'al;");
    }
}

    // public static void main(String[] args) {

  //     Scanner scan = new Scanner(System.in);

  //     String myStr = scan.nextLine();

  //     String[] arr = myStr.split(" ");

  //     int[] useThisArray = new int[arr.length];

  //     for(int i = 0 ; i < useThisArray.length ; i++){

  //         int num = Integer.parseInt(arr[i]);

  //         useThisArray[i] = num;

  //     }

////       code start here
////       dont change anything before this line
////       your Array is useThisLine

  //     // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
  //     //   useThisLine arrayini kullan
  //     int n=useThisArray.length;
  //     int[]temp=new int[n];
  //     int j=0;
  //     for (int i = 0; i <n-1 ; i++) {
  //         if(useThisArray[i]!=useThisArray[i+1]){
  //             temp[j++]=useThisArray[i];
  //         }

  //     }
  //     temp[j++]=useThisArray[n-1];
  //     System.out.println(Arrays.toString(temp));
  // }
//“Java Collections Nedir” verileri saklamak,  saklanan veriyi çekmek, işlemek
// ve zaman zaman sakladığımız yerde çeşitli verileri aramak için collections kullanırız
        //Collections.sort(tekrarlanan); //elemanlari siraliyoruz

     //   }
    //}