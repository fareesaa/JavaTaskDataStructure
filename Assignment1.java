import java.util.Scanner;

public class Assignment1_3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
          
        //Untuk menginput panjang data array dengan int
        int lengtharray = input.nextInt();
        
        //Menggunakan perulangan untuk memasukkan data array sesuai indexnya satu-persatu
        int [] numbers = new int[lengtharray];
        for( int i = 0; i < numbers.length; i++ ){
            System.out.print("Index ke-" + i + ": ");
            numbers[i] = input.nextInt();
        }
        
        //Untuk melakukan print dari total panjang array
        System.out.println("Panjang array adalah " + lengtharray );
        
        //Untuk menampilkan data yang telah dimasukkan kedalam array
        for (int n : numbers){
            System.out.println(n);
        }
        input.close();
     }
}
