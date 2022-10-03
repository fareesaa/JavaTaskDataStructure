import java.util.Scanner;

public class Assignment1_3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        //Memasukkan jumlah bari dann kolom untuk array 2d
        System.out.println("Masukkan jumlah baris: ");
        int rowarray = input.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int colarray = input.nextInt();
        
        //numbers var untuk data array yang akan menampung berapapun inputan pada 'rowarray' dan 'colarray' untuk menjadikan array 2d
        int [][] numbers = new int[rowarray][colarray];
        
        //Menggunakan perulangan untuk menambah data pada array perbarisnya
        for( int row = 0; row < rowarray; row++ ){
            for( int col = 0; col < colarray; col++ ){
                System.out.print("Baris ke-" + row + " Index ke-" + col + ": ");
                numbers[row][col] = input.nextInt();
            }
        }
        
        System.out.println("Baris array adalah " + rowarray );
        
        System.out.println(" Kolom array adalah " + colarray );
        
        System.out.println("Baris dan kolom array 2 dimensi adalah  [" + rowarray + ", " + colarray + "]\n");
        
        System.out.println("Array multidimensi 2 dimensi");
        
        //Menggunakan perulangan untuk menampilkan data array dengan tersusun 
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                System.out.format("| %s | \t", numbers[row][col]);
            }
            System.out.println("");
        }
        input.close();
     }
}
