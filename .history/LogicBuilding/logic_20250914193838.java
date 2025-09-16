
// This file is for improving my logic by solving basic problems!
import java.util.*;
import java.lang.Math;

class logic {

    public static void main(String[] args) {
        // Easy Proble 1
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        while (num > 0) {
            count += 1;
            num /= 10;
        }
        System.out.println("Digit count -> " + count);

        // Easy Problem 2 Check Armstrong
        int armStrong = 0;
        System.out.print("Enter Number: ");
        int numb = sc.nextInt();
        int len = String.valueOf(numb).length();
        int sum = 0;
        while (numb > 0) {
            armStrong = numb % 10;
            sum = Math.pow(armStrong , len);
            numb/=10;
        }

        if (sum == numb) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not ArmStrong! ");
        }
         // Easy Problem 3 Find Larges and Smallest
         System.err.println("Enter THe Size Of Array! ");
         int size = sc.nextInt();
         int []arr = new int[size];
         for(int i = 0 ; i < size ; i++){
            System.out.print("Enter Element At Index: " + i + " -> ");
            arr[i] = sc.nextInt();
         }
         int maxi = -99999;
         int mini = 99999;
         for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
            if(arr[i] < mini){
                mini = arr[i];
            }
         }
         System.out.println("Largest Number ----> "+ maxi + " Smallest ----> " + mini);
             }

}
