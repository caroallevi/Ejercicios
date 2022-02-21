
package poo.ej9.Entidades;


public class MatematicaServicios {
    
    
    public static double menor;

    public double devolverMayor(Matematica m){
        double mayor=Math.max(m.getNum1(),m.getNum2());
        return mayor;
    }
   
    public void  calcularPotencia(Matematica m) {
        double potencia;
        double mayorRed=(double)Math.round(devolverMayor(m));
        menor = Math.min(m.getNum1(), m.getNum2());
        double menorRed = (double)Math.round(menor);
        if(mayorRed>menorRed){
            potencia=Math.pow(mayorRed,menorRed);
        } else{
            potencia=Math.pow(menorRed,mayorRed);
        }   
        System.out.println("Para los numeros "+ menorRed+" y "+mayorRed+" la potencia es "+potencia);
      
    }
    
    public double calcularRaiz(Matematica m){
        double absoNum=Math.abs(menor);
        double raizCuad=Math.sqrt(absoNum);
        return raizCuad;
    }    
}
