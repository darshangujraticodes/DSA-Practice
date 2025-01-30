package Java;

public class Hello {

    public static int sum(int a, int b){
        int sum = a + b;

        return sum;
    }

    public  void main(String[] args) {
        System.out.println("Hello World !");


        Hello h = new Hello();
        int sumData = h.sum(20, 40);

        System.out.println(sumData);

    }
}
