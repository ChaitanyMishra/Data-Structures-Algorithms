// It use to solve Maximum SubArray Sum ex -( [1,2,3,4,5] Output - 15 - 1+2+3+4+5 ) ex -2 ( [1,5,-2,-5,6] - 6 - 1+5)
// Subarray meens the continus part  of array 
import java.util.Scanner;
class BruteForce{
        void bruteForce(int[] arr){
        int MaximumSum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            int currentSum = 0;
            for(int j = i ; j < arr.length ; j++){
                currentSum += arr[j];
                if(currentSum > MaximumSum){
                    MaximumSum = currentSum;
                }
            }
        }
     System.out.println("Maximum Subarray Sum (Brute Force) = " + MaximumSum);

    // This Will Print the Maximu Subarray but its not optmial Approch hear we use 2 loops and inner loop depend on outer loop so the 
    // Time Complexity - O(n)^2
    }
    void optmizeSolution(int[] arr){

    }

}
  class KadansAlgo{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array! ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            BruteForce ob = new BruteForce();
            ob.bruteForce(arr);

        
        }
    }