
public class StarPatterns {

    public static void squarePattern(int n) {

        System.out.println("Square Patterns");
        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void rightHalfTraingle(int n) {

        System.out.println("Right Half Traingle Patterns");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void invertedLeftHalfTraingle(int n) {

        System.out.println("Inverted Left Half Traingle Patterns");
        System.out.println("");
        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= n - i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void numberPyramid(int n) {

        System.out.println("Number Pyramid Half Traingle Patterns");
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void charachterPyramid(int n) {

        char ch = 'A';

        System.out.println("Charachter Pyramid Half Traingle Patterns");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void hollowRectangle(int n) {
        System.out.println("Hollow Rectangle Patterns");
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void invertRotatedHalfPyramid(int n) {
        System.out.println("Inverted Rotated Half Pyramid Patterns");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void invertedNumberHalfPyramid(int n) {
        System.out.println("Inverted Number Half Pyramid Patterns");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void floydTraingle(int n) {
        System.out.println("Inverted Number Half Pyramid Patterns");
        System.out.println();
        int count = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        squarePattern(5);
        rightHalfTraingle(6);
        invertedLeftHalfTraingle(4);
        numberPyramid(5);
        charachterPyramid(5);
        hollowRectangle(4);
        invertRotatedHalfPyramid(5);
        invertedNumberHalfPyramid(5);
        floydTraingle(4);
    }
}
