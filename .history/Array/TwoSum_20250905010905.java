import java.util.*;
// Brute Force Logic Two Sum meens we need to find the sum of any two number in array that sum are equals to the target
//  So here i use Brute Force Logic Like i use 2 loops i and j where and find sum if equals return the index.
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
//  hear i use optmized method HashMap.Logic is simple insted of finding sum of two number 
// we Find diffrence between target and one number example - brootForce - 7 + 3 =
class optmized{
    public int[] twoSum(int[] arr , int target){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff) , i};
            }
            map.put(arr[i] , i);
        }
        return new int[]{-1,-1};
    }
}

class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the Size Of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter Values In Array Index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Please: ");
        int target = sc.nextInt();
        System.out.print("Press 1 for BruteForce Approch And 2 for Optmized Approch: ");
        int ch = sc.nextInt();
        if(ch == 1){
            BrootForce ob = new BrootForce();
            int[] response = ob.twoSum(arr, target);
            System.out.println(response[0] + "," + response[1]);
        }else if(ch == 2){
            optmized ob = new optmized();
            int[] response = ob.twoSum(arr, target);
            System.out.println(response[0] + "," + response[1]);
        }else{
            System.err.println("Erro! choose Correct Opertaions! ");
        }
    }
}