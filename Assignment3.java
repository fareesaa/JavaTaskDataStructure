import java.util.Scanner;

public class Assignment1_3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
          
        //Mendeklarasikan beberap variabel yang akan digunakan
        int lengtharray, menu;
        int [] numbers = new int[100];
        
        //
        do {
            System.out.println("1.Input Bilangan");
            System.out.println("2.Urutkan Bilangan");
            System.out.println("3.Cari Bilangan");
            System.out.println("*Anything to cancel program!");
            
            //Memasukkan menu untuk menentukan yang akan digunakan
            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            
            //Jika menu yang di inputkan sesuai, maka akan segera mengeksekusi, jika tidak sebaliknya
            //Menu untuk melakukan input array 
            if(menu==1) {
                System.out.println("Masukkan total array (max.length=100) : ");
                lengtharray = input.nextInt();
                numbers = new int[lengtharray];
                
                //Perulangan untuk memasukkan data pada array
                for( int i = 0; i < numbers.length; i++ ) {
                    System.out.print("Index ke-" + i + ": ");
                    numbers[i] = input.nextInt();
                }
                 //Perulangan untuk menampilkan data pada array
                for (int n : numbers) {
                    System.out.println(n);
                }
                System.out.println("Panjang array adalah " + lengtharray );
            }
            //Menu untuk melakukan tampil array terurut 
            else if (menu == 2) {
                //urutkan
                System.out.println("Array terurut :");
                 //Perulangan untuk melakukan pengurutan data array
                int minpos=0;
                for(int i = 0 ; i < numbers.length; i++) {
                    minpos = i;
                    for (int j = i+1; j< numbers.length ; j++) {
                        if (numbers[j] < numbers[minpos]) {
                            minpos = j;
                        }
                    }
                    int temp = numbers[i];
                    numbers[i] = numbers[minpos];
                    numbers[minpos] = temp;
                }
                 //Menampilkan data array yang terurut
                for (int n=0 ; n < numbers.length ; n++) {
                    System.out.format("|%s| \t", numbers[n]);
                }
               //Menu untuk mencari data array 
            } else if(menu ==3) {
                System.out.println("Masukkan angka target :");
                int target = input.nextInt();

                int left =0 ;
                int middle;
                int right  = numbers.length - 1;
                 //if didalam perulangan untuk melakukan perbandingan atas data target dengan data pada array
                while(left <= right) {
                    middle  = (left+right)/2;
                    if(target == numbers[middle]) {
                        System.out.println(numbers[middle] + " found at index " + middle );
                        break;
                    } else if(target > numbers[middle]) {
                        left = middle + 1;
                    } else if(target < numbers[middle]) {
                        right = middle-1;
                    }
                }
            }else {
                System.out.println("Menu not found, Shut Down!");
                menu = 4;
            }

        } while(menu < 3);

        input.close();
     }
}
