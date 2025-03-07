// creating array with class

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {

        // if array has reach max length capacity the resize it

        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        // Else insert array value to end
        items[count] = item;

        // it is used to increase array length count
        count++;

    }

    public void removeAt(int indexVal) {

        // throw error if it has inserted invalid value
        if (indexVal < 0 || indexVal >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // shifting array elements backward if value is removed
        for (int i = indexVal; i < count; i++) {
            items[i] = items[i + 1];
        }

        // it is used to decrease array length count
        count--;
    }

    public void pop() {
        items[count - 1] = 0;
    }

    public void length() {
        System.out.println("Array Length = " + count);
    }

    public int indexOf(int arrayVal) {

        for (int i = 0; i < count; i++) {
            if (items[i] == arrayVal) {
                return i;
            }
        }
        return -1;
    }

    public boolean includes(int arrayVal) {
        for (int i = 0; i < count; i++) {
            if (items[i] == arrayVal) {
                return true;
            }
        }

        return false;
    }

}
