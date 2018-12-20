import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 5, 5, 1, 2, 3, 7, 1};

        QuickSort.sort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);

    }

}
