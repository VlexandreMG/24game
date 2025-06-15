package fonction;

public class ListeFunctions {

    public boolean function1(int[] nombre) {
        if (nombre[0] * nombre[1] * nombre[2] * nombre[3] == 24) {
            System.out.println(nombre[0]+" * "+nombre[1]+" * "+nombre[2]+" * "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 1 (produit).");
        return false;
    }

    public boolean function2(int[] nombre) {
        if (((nombre[0] + nombre[1]) * (nombre[2] + nombre[3])) == 24) {
            System.out.println("("+nombre[0]+" + "+nombre[1]+") * ("+nombre[2]+" + "+nombre[3]+")");
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 2 (sommes * sommes).");
        return false;
    }

    public boolean function3(int[] nombre) {
        if ((nombre[0] * nombre[1]) + (nombre[2] * nombre[3]) == 24)  {
            System.out.println("("+nombre[0]+" * "+nombre[1]+") + ("+nombre[2]+" * "+nombre[3]+")");
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 3 (produits + produits).");
        return false;
    }

    public boolean function4(int[] nombre) {
        if ((nombre[0] * nombre[1]) - (nombre[2] * nombre[3])== 24)  {
            System.out.println("("+nombre[0]+" * "+nombre[1]+") - ("+nombre[2]+" * "+nombre[3]+")");
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 4 (produits - produits).");
        return false;
    }

    public boolean function5(int[] nombre) {
        if (((nombre[0] + nombre[1] + nombre[2]) * nombre[3]) == 24)  {
            System.out.println("("+nombre[0]+" + "+nombre[1]+" + "+nombre[2]+") * "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 5 (somme * nombre).");
        return false;
    }

    public boolean function6(int[] nombre) {
        if (((nombre[0] * nombre[1]) - nombre[2] - nombre[3]) == 24) {
            System.out.println("("+nombre[0]+" * "+nombre[1]+") - "+nombre[2]+" - "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 6 (produit - a - b).");
        return false;
    }

    public boolean function7(int[] nombre) {
        if (((nombre[0] * nombre[1] * nombre[2]) / nombre[3]) == 24) {
            System.out.println("("+nombre[0]+" * "+nombre[1]+" * "+nombre[2]+") / "+nombre[3]);
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 7 (produit / nombre).");
        return false;
    }

    public boolean function8(int[] nombre) {
        if ((nombre[0] + nombre[1]) * (nombre[2] - nombre[3]) == 24) {
            System.out.println("("+nombre[0]+" + "+nombre[1]+") * ("+nombre[2]+" - "+nombre[3]+")");
            return true;
        }
        System.out.println("N'est pas compatible avec la fonction 8 (somme * différence).");
        return false;
    }
}