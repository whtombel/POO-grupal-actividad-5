package universidadnacional;

public class Pitagoras {
    
    public static double calcular_hipotenusa(double catetoA, double catetoB){
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
        return hipotenusa;
    }
}
