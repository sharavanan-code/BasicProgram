import java.util.Scanner;

public class primecheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n<=1){
            System.out.println("its not a prime number");
        }
        else if(isprime(n)){
            System.out.println(n+"its a prime number");

        }
        else{
            System.out.println(n+"its not a prime number");
        }


    }

    public static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i = 3; i * i<=n;i+=2){
            if(n%i!=0){
                return true;
            }
        }
        return false;
    }
}
