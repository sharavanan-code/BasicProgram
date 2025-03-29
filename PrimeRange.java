public class PrimeRange {
    public static void main(String[] args) {
      int n = 20;
      for(int i = 2;i<=n;i++){
        if(isprime(i)){
            System.out.print(i+" ");
        }
      }
    }
    public static boolean isprime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for(int i =3; i*i<=num; i+=2){
            if(num%i==0) return false;
        }
        return true;


    }
    
}
