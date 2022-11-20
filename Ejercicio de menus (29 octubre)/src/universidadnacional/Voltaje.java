package universidadnacional;

public class Voltaje {
    public static double calcular_Voltaje(double corriente, double resistencia){
        double voltaje;
        voltaje = corriente * resistencia;
        return voltaje;
    }
}
