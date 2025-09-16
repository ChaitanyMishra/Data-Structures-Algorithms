
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
        int leng = 0;
        int armStrong = 0;
        System.out.print("Enter Number: ");
        int numb = sc.nextInt();
        while (numb > 0) {
            leng += 1;
            armStrong = numb /= 2;
        }

        if ((Math.pow(armStrong, leng)) == numb) {
            System.out.print("Number is Armstrong");
        } else {
            System.out.println("Number is not ArmStrong! ");
        }
         // Easy Problem 3 Find Larges and Smallest
         System.err.println("Enter THe Size Of Array! ");
         int size = sc.nextInt();
         int []arr = new int[size];
         for(int i = 0 ; i < size ; i++){
            
         }
         
             }

}
