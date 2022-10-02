import java.util.Scanner;

public class Assignment1_3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        int lengtharray = input.nextInt();
        
        int [] numbers = new int[lengtharray];
        for( int i = 0; i < numbers.length; i++ ){
            System.out.print("Index ke-" + i + ": ");
            numbers[i] = input.nextInt();
        }
        

        System.out.println("Panjang array adalah " + lengtharray );

        for (int n : numbers){
            System.out.println(n);
        }
        input.close();
     }
}