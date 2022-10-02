import java.util.Scanner;

public class Assignment1_3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int lengtharray, menu;
        int [] numbers = new int[100];

        do {
            System.out.println("1.Input Bilangan");
            System.out.println("2.Urutkan Bilangan");
            System.out.println("3.Cari Bilangan");
            System.out.println("*Anything to cancel program!");

            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            
            if(menu==1) {
                System.out.println("Masukkan total array (max.length=100) : ");
                lengtharray = input.nextInt();
                numbers = new int[lengtharray];
                for( int i = 0; i < numbers.length; i++ ) {
                    System.out.print("Index ke-" + i + ": ");
                    numbers[i] = input.nextInt();
                }
                for (int n : numbers) {
                    System.out.println(n);
                }
                System.out.println("Panjang array adalah " + lengtharray );
            }

            else if (menu == 2) {
                //urutkan
                System.out.println("Array terurut :");
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
                for (int n=0 ; n < numbers.length ; n++) {
                    System.out.format("|%s| \t", numbers[n]);
                }
            } else if(menu ==3) {
                System.out.println("Masukkan angka target :");
                int target = input.nextInt();

                int left =0 ;
                int middle;
                int right  = numbers.length - 1;
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