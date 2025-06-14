package fonction;

public class ListeFunctions {

    public boolean function1(int[] nombre) {
        if (nombre[0] * nombre[1] * nombre[2] * nombre[3] == 24) {
            System.out.println(nombre[0]+" x "+nombre[1]+" x "+nombre[2]+" x "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 1.");
        return false;
    }

    public boolean function2(int[] nombre) {
        if (((nombre[0] + nombre[1]) * (nombre[2] + nombre[3])) == 24) {
            System.out.println("( "+nombre[0]+" + "+nombre[1]+") x ("+nombre[2]+" + "+nombre[3]+" )");
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 2.");
        return false;
    }

    public boolean function3(int[] nombre) {
        if ((nombre[2] * (nombre[0] * nombre[1]) + nombre[3]) == 24) {
            System.out.println(nombre[2]+" x "+" ( "+nombre[0]+" x "+nombre[1]+" ) + "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 3.");
        return false;
    }
}
