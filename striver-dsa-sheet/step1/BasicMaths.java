import java.util.ArrayList;
import java.util.Scanner;

public class BasicMaths {

    public int countDigit(int mathValue) {

        int inputVal = mathValue;
        int count = 0;
        while (inputVal > 0) {

            count++;
            inputVal = inputVal / 10;

            // System.out.println(rem + " " + inputVal);
        }

        return count;

    }

    public int sum(int mathVal) {
        int sum = 0;

        while (mathVal > 0) {
            int rem = mathVal % 10;
            sum += rem;
            mathVal = mathVal / 10;
        }

        return sum;
    }

    public int reverseNumber(int mathVal) {

        int rev = 0;
        while (mathVal > 0) {
            int rem = mathVal % 10;
            rev = rev * 10 + rem;
            mathVal = mathVal / 10;
        }

        return rev;

    }

    public boolean palindromeCheck(int mathVal) {

        int revData = reverseNumber(mathVal);

        if (revData == mathVal) {
            return true;
        }

        return false;

    }

    public int findGcd(int n1, int n2) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {

            if (n1 % i == 0 && n2 % i == 0) {

                gcd = i;
            }
        }
        return gcd;
    }

    public ArrayList findDivisor(int num) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                int ndata;
                arr.add(i);
            }
        }

        return arr;
    }

    public boolean checkPrime(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your Math Value : ");
        String val1 = scn.nextLine();

        BasicMaths bm = new BasicMaths();

        System.out.println("Count of Entered Value = " + val1 + " is " + bm.countDigit(Integer.parseInt(val1)));

        // System.out.println("Enter your Math Value : ");
        // String val2 = scn.nextLine();

        System.out.println("Sum of Entered Value = " + val1 + " is " + bm.sum(Integer.parseInt(val1)));

        System.out.println("Reverse of Entered Value = " + val1 + " is " + bm.reverseNumber(Integer.parseInt(val1)));

        // System.out.println("Enter your Math Value : ");
        // String val3 = scn.nextLine();

        System.out
                .println("Entered Value = " + val1 + " is Palindrome : " + bm.palindromeCheck(Integer.parseInt(val1)));

        System.out.println(" GCD = " + bm.findGcd(18, 12));

        System.out.println(" Divisor List =  " + bm.findDivisor(36));

        System.out.println(" Entered Value  " + val1 + " is Prime : " + bm.checkPrime(Integer.parseInt(val1)));

    }
}