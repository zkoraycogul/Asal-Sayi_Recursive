import java.util.Scanner;
public class Main {

    static boolean isPrimeNumber(int number, int a) {
        if(number == 1 ) {
            return false;
        }else if (a >= number){
            return true;
        }else if (number % a == 0 ) {
            return  false;
        }
        return isPrimeNumber(number, a+1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number=input.nextInt();
        System.out.println("Is it prime number ? " + isPrimeNumber(number,2));

    }
}
