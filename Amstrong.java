import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integer");
        int n = input.nextInt();
        int original = n;
        int real = n ;

        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }

        int amstrong_number = 0;
        while(original!=0){
            int remainder = original%10;
            int power = 1;

            for(int i =0;i<count;i++){
                power*=remainder;
            }
            amstrong_number+=power;

            original/=10;
        }

     
        if(real==amstrong_number){
            System.out.println("its a amstrong number");
        }
        else{
            System.out.println("its not a amstrong number");
        }
    }
    
}
