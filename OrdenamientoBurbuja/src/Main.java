// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Creamos un arreglo
        int[] arr = {6, 3, 5, 2, 9, 1, 8};
        //Imprimimos el arreglo sin ordenar
        System.out.println("Arreglo antes de ordenar:");
        printArray(arr);
        //Llamamos al metodo sort de la clase BubbleSort
        BubbleSort.sort(arr);

        //Imprimimos el arreglo ordenado
        System.out.println("Arreglo después de ordenar por medio de BubbleSort:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
