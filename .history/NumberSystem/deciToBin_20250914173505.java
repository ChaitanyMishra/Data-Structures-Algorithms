import java.util.Scanner;
class desiToBin{
    int desiToBin(int num){
        int decimalNum;
        while(num > 0 ){
            int rem = num % 2;
            num/= 2;
            decimalNum+=(rem)


        }
    }
}
class main{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number You Want to Conver! ");
    int num = sc.nextInt();
    public static void main(String[] args) {
        desiToBin ob = new desiToBin();
        ob.desiToBin(num);
    }
}