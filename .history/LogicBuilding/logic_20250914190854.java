
import java.util.*;
class logic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter Number: 10");
        int num = sc.nextInt();
        while(num > 0){
            count+=1;
            num/=10;
        }
        System.out.println("Digit count -> " + count);
    }

}