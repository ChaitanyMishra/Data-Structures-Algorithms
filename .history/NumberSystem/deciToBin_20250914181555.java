import java.util.Scanner;
import M
class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number You Want to Conver! ");
    int num = sc.nextInt();
    int decimalNumber = 0;
    int power = 1;
    while(num > 0){
        int rem = num % 2;
        num/=2;
        decimalNumber = (rem * (Math.pow(power , 10)));
        power+=1;
        
    }
    }

    
}