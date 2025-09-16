import java.util.Scanner;
class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number You Want to Conver! ");
    int num = sc.nextInt();
    int decimalNumber = 0;
    int power = 0;
    while(num > 0){
        int rem = num % 2;
        num/=2;
        decimalNumber += (int)(rem * (Math.pow(10 , power)));
        power+=1;    
    }
    System.err.println("Power of " + num + "Is" + decimalNumber);
    }

    
}