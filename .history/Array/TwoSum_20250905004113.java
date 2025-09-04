import java.util.*;
class BrootForce{
    public int[] twoSum(int[] arr , int target ){
        int[] temp = new int[2];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if( arr[i] + arr[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
    }
}

class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the Size Of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter Values In Array Index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.err.println("Enter Target Please: ");
        int target = sc.nextInt();
        System.out.print("Press 1 for BruteForce Approch And 2 for Optmized Approch: ");
        int ch = sc.nextInt();
        if(ch == 1){
            BrootForce ob = new BrootForce();
            ob.twoSum(arr, target);
        }
    }
}