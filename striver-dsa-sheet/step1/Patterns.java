
public class Patterns {

    // sheet link :
    // https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

    public static void pattern1(int length) {

        for (int i = 1; i <= length; i++) {

            // star
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern2(int length) {

        for (int i = 1; i <= length; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern3(int length) {

        for (int i = 1; i <= length; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int length) {

        for (int i = 1; i <= length; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int length) {

        for (int i = length; i > 0; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int length) {

        for (int i = length; i > 0; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int length) {
        // pyramid equilateral traingle

        for (int i = 1; i <= length; i++) {

            // space
            for (int j = length - i; j >= 0; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    public static void pattern9(int length) {
        // pyramid equilateral traingle

        char ch = 'A'; // note char value is in single inverted

        for (int i = length; i > 0; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);

            }
            ch++;

            System.out.println();

        }

    }

    public static void pattern8(int length) {
        // pyramid equilateral traingle

        System.out.println("reverse");
        for (int i = length; i > 0; i--) {

            // space
            for (int j = length - i; j >= 0; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

        for (int i = 1; i <= length; i++) {

            // space
            for (int j = length - i; j >= 0; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    public static void pattern10(int length) {

        char ch = 'A'; // note char value is in single inverted

        for (int i = 1; i <= length; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch = 'A';
            System.out.println();

        }
    }

    public static void pattern11(int length) {

        System.out.println("Butterfly");

        // upper star half

        for (int i = 1; i <= length; i++) {

            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space gap
            for (int j = 1; j <= 2 * (length - i); j++) {
                System.out.print(" ");
            }

            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // lower second half

        for (int i = length - 1; i > 0; i--) {

            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // gap print
            for (int j = 1; j <= 2 * (length - i); j++) {
                System.out.print(" ");
            }

            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        pattern1(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern2(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern3(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern4(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern5(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern6(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern7(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern8(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern9(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern10(5);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        pattern11(7);
    }
}
