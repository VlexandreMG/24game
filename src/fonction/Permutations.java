package fonction;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<int[]> generatePermutations(int[] arr) {
        List<int[]> result = new ArrayList<>();
        permute(arr, 0, result);
        return result;
    }

    private static void permute(int[] arr, int index, List<int[]> result) {
        if (index == arr.length) {
            result.add(arr.clone()); // Copier la permutation actuelle
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);                    // Échange deux éléments
            permute(arr, index + 1, result);        // Appel récursif
            swap(arr, i, index);                    // Remet en place (backtracking)
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
}

