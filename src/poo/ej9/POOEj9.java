
package poo.ej9;

import poo.ej9.Entidades.Matematica;
import poo.ej9.Entidades.MatematicaServicios;

public class POOEj9 {

   

    public static void main(String[] args) {
        double num1 = 10 * Math.random();
        double num2 = 10 * Math.random();
        Matematica mat = new Matematica(num1, num2);
        MatematicaServicios ms = new MatematicaServicios();
        System.out.println("El mayor valor entre " + num1 + " y " + num2
                + " es " + ms.devolverMayor(mat));
        ms.calcularPotencia(mat);
        System.out.println("La raíz cuadrada de " + MatematicaServicios.menor + " es "
                + ms.calcularRaiz(mat));
    }

}
