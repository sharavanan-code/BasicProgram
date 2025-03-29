public class Fibonacci {
    public static void main(String[] args) {
        int frist = 0;
        int second = 1;
        int n = 8;

        System.out.print(frist+" "+second);

        for(int i = 2;i<n;i++){
            int next = frist+second;
            System.out.print(next+" ");
            frist =second;
            second =next;
        }

    }
    
}
