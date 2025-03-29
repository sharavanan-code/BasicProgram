import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer to check the plaindrome");
        int n = input.nextInt();
        int original = n ;
        int reverse = 0;

        while(n!=0){
            int remainder = n % 10;
            reverse = reverse *10 + remainder;
            n/=10;
        }

        if(original==reverse){
            System.out.println("its a plaindrome");
        }

        else{
            System.out.println("its not a plaindrome");
        }

        
    }
}
