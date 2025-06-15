package fonction;

import java.util.List;

public class ArithmeticTest {

    ListeFunctions listeFunctions = new ListeFunctions();

    public void test24(int[] nombre) {
        List<int[]> allPermutations = Permutations.generatePermutations(nombre);

        for (int[] permutation : allPermutations) {
            if (listeFunctions.function1(permutation)) {
                System.out.println("Donne 24 avec la fonction 1.");
            } else if (listeFunctions.function2(permutation)) {
                System.out.println("Donne 24 avec la fonction 2.");
            } else if (listeFunctions.function3(permutation)) {
                System.out.println("Donne 24 avec la fonction 3.");
            } else if (listeFunctions.function4(permutation)) {
                System.out.println("Donne 24 avec la fonction 4.");
            } else if (listeFunctions.function5(permutation)) {
                System.out.println("Donne 24 avec la fonction 5.");
            } else if (listeFunctions.function6(permutation)) {
                System.out.println("Donne 24 avec la fonction 6.");
            } else if (listeFunctions.function7(permutation)) {
                System.out.println("Donne 24 avec la fonction 7.");
            } else if (listeFunctions.function8(permutation)) {
                System.out.println("Donne 24 avec la fonction 8.");
            }
        }
    }
}