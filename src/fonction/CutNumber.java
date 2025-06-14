package fonction;

public class CutNumber {

    public int[] CutNombre(int nombre) {
        int[] tableauNombre = new int[4];

        int add = nombre / 1000;
        tableauNombre[0] = add;
        int resteadd = nombre % 1000;


        int bal = resteadd / 100;
        tableauNombre[1] = bal;
        int restebal = resteadd % 100;

        int ejej = restebal / 10;
        tableauNombre[2] = ejej;
        int resteejej = restebal % 10;

        tableauNombre[3] = resteejej;

        return tableauNombre;
    }
}
