package fonction;

public class ArithmeticTest {

    ListeFunctions listeFunctions = new ListeFunctions();
    public void test24 (int[] nombre) {
        if (listeFunctions.function1(nombre)) {
            System.out.println("Donne 24 avec la fonction 1.");
        } else if (listeFunctions.function2(nombre)) {
            System.out.println("Donne 24 avec la fonction 2.");
        } else if (listeFunctions.function3(nombre)) {
            System.out.println("Donne 24 avec la fonction 3.");
        }
    }
}
