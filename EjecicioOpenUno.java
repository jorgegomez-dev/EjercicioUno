package domain;

public class EjecicioOpenUno {

    public static void main(String[] args) {
        int resultado = suma(5, 10, 3);
        System.out.println("Resultado: " + resultado);

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas.");
    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }

}
