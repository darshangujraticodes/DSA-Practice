public class Recurssion {

    public void printNumber(int firstNum, int lastNum) {

        if (firstNum <= lastNum) {
            System.out.println(firstNum);
            printNumber(firstNum + 1, lastNum);
        }

    }

    public void printName(String name, int i, int times) {

        if (i <= times) {
            System.out.println(name);
            printName("Harry", i + 1, times);
        }

    }

    public void printLastToFirst(int last, int first) {

        if (last >= first) {
            System.out.println(last);
            printLastToFirst(last - 1, first);
        }

    }

    public int sumOfN(int i, int last, int sum) {

        if (i <= last) {
            sum += i;
            return sumOfN(i + 1, last, sum);

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println();
        Recurssion rc = new Recurssion();
        rc.printNumber(1, 10);

        rc.printName("Harry", 1, 8);

        rc.printLastToFirst(10, 1);

        System.out.println("sum = " + rc.sumOfN(1, 10, 0));

    }
}
