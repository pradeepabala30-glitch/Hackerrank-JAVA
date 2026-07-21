import java.util.Scanner;

class Check {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println("Input: n = " + n);

        if (n % 2 == 0) {
            System.out.println("Output: true");
            System.out.println("Explanation: The number is divisible by 2, Even number.");
        } else {
            System.out.println("Output: false");
            System.out.println("Explanation: The number is not divisible by 2, Odd number.");
        }

        scan.close();
    }
}