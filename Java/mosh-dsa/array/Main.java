
public class Main {

    public static void main(String[] args) {
        Array number = new Array(5);

        number.insert(45);
        number.insert(56);
        number.insert(63);
        number.insert(85);
        number.insert(85);
        number.insert(96);
        number.insert(78);
        number.insert(22);
        number.insert(41);

        number.removeAt(5);

        number.pop();

        number.print();

        number.length();

        System.out.println("does Array has 22 ? = " + number.includes(22));

        System.out.println("what is index postion of 22 in array = " + number.indexOf(22));

        System.out.println("does Array has value 125 = " + number.indexOf(125));

    }

}
