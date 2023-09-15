import Numericos.Fraccion;
import Numericos.Numerica;

public class Main {
    public static void main(String[] args) {
        Fraccion fracción1 = new Fraccion(1, 2);
        Fraccion fracción2 = new Fraccion(3, 4);

        Numerica resultadoSuma = fracción1.sumar(fracción2);
        System.out.println("Suma: " + resultadoSuma.toString());

        Numerica resultadoResta = fracción1.restar(fracción2);
        System.out.println("Resta: " + resultadoResta.toString());

        Numerica resultadoMultiplicacion = fracción1.multiplicar(fracción2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion.toString());

        Numerica resultadoDivision = fracción1.dividir(fracción2);
        System.out.println("División: " + resultadoDivision.toString());

        boolean igualdad = fracción1.equals(fracción2);
        System.out.println("¿Las fracciones son iguales? " + igualdad);
    }
}
