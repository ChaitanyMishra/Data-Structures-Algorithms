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

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        system.o
    }
}