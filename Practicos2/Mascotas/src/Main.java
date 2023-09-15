import TiendaMascostas.*;

public class Main {
    public static void main(String[] args) {
        PerroPequeno perroPequeno = new PerroPequeno("Bobby", 2, "Blanco", 3.5, false, "Chihuahua");
        PerroMediano perroMediano = new PerroMediano("Rex", 4, "Negro", 12.0, true, "Bulldog");
        PerroGrande perroGrande = new PerroGrande("Max", 5, "Marrón", 25.0, false, "Pastor Alemán");

        GatoSinPelo gatoSinPelo = new GatoSinPelo("Whiskers", 1, "Rosado", 0.8, 1.0, "Sphynx");
        GatoPeloLargo gatoPeloLargo = new GatoPeloLargo("Fluffy", 3, "Blanco", 0.6, 0.9, "Angora");

        System.out.println("Sonidos de los perros:");
        System.out.println("-----------------------");
        Perro.sonido();
        System.out.println();
        System.out.println();

        System.out.println("Sonidos de los gatos:");
        System.out.println("----------------------");
    }
}
