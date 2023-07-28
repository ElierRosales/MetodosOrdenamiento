// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 2, 9, 1, 8};

        System.out.println("Arreglo antes de ordenar:");
        printArray(arr);

        InsertSort.sort(arr);

        System.out.println("Arreglo después de ordenar:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
