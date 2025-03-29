public class Strong_number{
    public static void main(String[] args) {
        int n = 145;
        int original = n;
        int strong = 0;


        while(n!=0){
            int remainder = n % 10;
            strong+=fact(remainder);
            n/=10;
        }

        if(original==strong){
            System.out.println("its a Strong number");
        }
        else{
            System.out.println("ist not a strong number");
        }
    }

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
