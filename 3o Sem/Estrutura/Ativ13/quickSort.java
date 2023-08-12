public class quickSort {
    public static void main(String[] args) {
        int[] array = {25, 78, 42, 91, 5, 33, 67, 10, 58, 19, 88, 72, 97, 3, 51, 80, 37, 62, 14, 96, 48, 31, 69, 11, 75, 22, 65, 8, 55, 17, 83, 40, 86, 1, 46, 93, 28, 74, 99, 6, 53,
            15, 87, 30, 64, 21, 77, 34, 71, 9, 56, 13, 92, 44, 79, 36, 63, 0, 47, 94, 27, 73, 4, 52, 16, 89, 41, 85, 2, 45, 98, 29, 76, 7, 54, 12, 90, 43, 81, 38, 95, 32, 68,
            20, 57, 18, 84, 39, 82, 49, 26, 59, 23, 70, 35, 100, 66, 24, 61, 50, 80, 60, 49, 83, 18, 67, 91, 29, 10, 36, 71, 93, 47, 3, 77, 98, 54, 13, 86, 41, 9, 60, 83, 35,
            80, 41, 26, 67, 98, 59, 10, 77, 13, 91, 83, 60, 29, 36, 47, 54, 71, 3, 9, 13, 26, 29, 35, 36, 41, 47, 54, 59, 60, 67, 71, 77, 80, 83, 91, 98, 10, 3, 13, 26, 29, 35,
            36, 41, 47, 54, 59, 60, 67, 71, 77, 80, 83, 91, 98, 10, 3, 13, 26, 29, 35, 36, 41, 47, 54, 59, 60, 67, 71, 77, 80, 83, 91, 98, 10, 3, 13, 26, 29, 35, 36, 41, 47, 54,
            59, 60, 67, 71, 77, 80, 83, 91, 98, 10, 3, 13, 26, 29, 35, 36, 41, 47, 54, 59, 60, 67, 71, 77, 80};

        quickSt(array, 0, array.length - 1);

        // Mostrar os valores ordenados no console
        System.out.print("Array organizado: [");
        for (int i = 0; i < array.length; i++) {
            if (i % 15 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void quickSt(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSt(array, low, pivotIndex - 1);
            quickSt(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}