public class QuickSort {

    public static void sort(final int[] ints, int start, int end) {

        if (start < end) {

            int i = start;
            int j = end;

            int pivot = i - (i - j) / 2;

            while (i < j) {
                while ((i < pivot) && (ints[i] <= ints[pivot])) i++;
                while ((j > pivot) && (ints[j] >= ints[pivot])) j--;

                if (i < j) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;

                    if (i == pivot) pivot = j;
                    else if (j == pivot) pivot = i;
                }
            }

            sort(ints, start, pivot);
            sort(ints, pivot + 1, end);
        }
    }

    private static int partition(final int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void quickSort(final int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

}
