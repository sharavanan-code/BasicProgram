import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        System.out.println("enter the integer number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n ;
        int reverse = 0 ;
       
      
    

        while(n!=0){
            int remainder = n % 10;
            reverse = reverse *10 + remainder;
            n/=10;


        }

        System.out.println(reverse);

        


    }
    
}
