package Basic;
import java.util.Scanner;
public class RecursiveAsal {

    //Recursive metot ile asal sayı kontrolü
    static boolean isPrime(int number , int bolen){
        //Durumlar
        if(number < 2){  //2'den küçük sayılar asal değildir
            return false;
        }
        if(bolen == 1){  //Tüm bölenleri kontrol ettik asal sayıdır
            return true;
        }
        if(number % bolen == 0){  //Tam bölünüyorsa asal değildir
            return false;
        }

        return isPrime(number,bolen-1);  //Bir sonraki böleni kontrol et
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int number = input.nextInt();


        //Sayının asal olup olmadığını test etme
        if(isPrime(number,number/2)){
            System.out.println(number + " bir asal sayıdır");
        } else {
            System.out.println(number + " bir asal sayı değildir");
        }
    }
}
