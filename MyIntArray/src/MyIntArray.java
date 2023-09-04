public class MyIntArray {
    private int[] array;
    public MyIntArray(int size) {
        array = new int[size];
    }
    public MyIntArray() {
        array = new int[5];
    }

    public void add(int element) {
        if (size() == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size()] = element;
    }
    public void remove(int index) {
        if (index >= 0 && index < size()) {
            for (int i = index; i < size() - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size() - 1] = 0;
        }
    }
    public void sortRight() {
        for (int i = 0; i < size() - 1; i++) {
            for (int j = 0; j < size() - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void sortLeft() {
        for (int i = 0; i < size() - 1; i++) {
            for (int j = 0; j < size() - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public int size() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size(); i++) {
            result += array[i] + " ";
        }
        return result;
    }
}
