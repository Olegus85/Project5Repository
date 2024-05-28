public class ArrayPersonGen {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        Person[] array1 = bubbleSort.generateArray();
        Person[] array2 = insertSort.generateArray();
        bubbleSort.sort(array1);
        insertSort.sort(array2);
    }
}
