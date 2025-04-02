import java.util.Scanner;
public class sortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("original array");
        for(int num:arr){
            System.out.print(num+" ");
        }

    

       

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }



    
    }
    
}
