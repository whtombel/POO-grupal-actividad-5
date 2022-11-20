package ejercicio.pkg2;

public class Nota {
    double[] listaNotas; 
    public Nota() {
        listaNotas = new double[5]; 
    }
    // método que calcula el promedio de notas 
    double calcularPromedio() {
        double suma = 0;
        for(int i=1; i < listaNotas.length; i++) { // Se recorre el array
            suma = suma + listaNotas[i]; // Suma las notas del array
        }
        //se obtiene el promedio de la suma de las notas
            return (suma / listaNotas.length);
    }
    
    //método que calcula la desviación estandar
    double calcularDesviación() {
        double prom = calcularPromedio(); 
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) { // Aplica fórmula para la sumatoria de elementos
            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
            return Math.sqrt (suma/listaNotas.length ); 
    }
     
    //Método que calcula el valor menor del array de notas
    
    double calcularMenor()  {
        double menor = listaNotas[0]; //define la nota menor
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] < menor) {
                menor = listaNotas[i];
            }
        }
            return menor;
    }
    
    //Método que calcula el valor mayor del array de notas
    double calcularMayor()  {
        double mayor = listaNotas[0]; //define la nota mayor
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] > mayor) {
                mayor = listaNotas[i];
            }
        }
            return mayor;
    }
}


