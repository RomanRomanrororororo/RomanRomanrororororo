public class Main {
    public static void main(String[] args) {
        MyIntArray myIntArray = new MyIntArray();
        myIntArray.add(4);
        myIntArray.add(2);
        myIntArray.add(6);
        myIntArray.add(1);
        myIntArray.add(3);

        System.out.println("Массив: " + myIntArray);
        myIntArray.remove(2);
        System.out.println("Массив после удаления элемента: " +
                myIntArray);
        myIntArray.sortRight();
        System.out.println("Массив после сортировки по возрастанию: " +
                myIntArray);
        myIntArray.sortLeft();
        System.out.println("Массив после сортировки по убыванию: " +
                myIntArray);
        System.out.println("Количество заполненных ячеек: " +
                myIntArray.size());
    }
}
