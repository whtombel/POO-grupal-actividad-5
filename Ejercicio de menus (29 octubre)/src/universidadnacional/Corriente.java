package universidadnacional;

public class Corriente {
    public static double calcular_corriente(double voltaje, double resistencia){
        double corriente;
        corriente = voltaje/resistencia;
        return corriente;
    }
}
