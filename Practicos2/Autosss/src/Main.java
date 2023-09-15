import Autos.VehículoAcuático;
import Autos.VehículoTerrestre;

public class Main {
    public static void main(String[] args) {
        VehículoTerrestre vehículoTerrestre = new VehículoTerrestre(120, 4, "Civil");
        VehículoAcuático vehículoAcuático = new VehículoAcuático(60, "Superficie", 6);

        // Prueba de acelerar y frenar
        vehículoTerrestre.acelerar(50);
        vehículoTerrestre.frenar(20);

        vehículoAcuático.acelerar(40);
        vehículoAcuático.frenar(10);

        // Prueba de imprimir
        System.out.println("Información del Vehículo Terrestre:");
        vehículoTerrestre.imprimir();

        System.out.println("\nInformación del Vehículo Acuático:");
        vehículoAcuático.imprimir();

        // Prueba de recomendarVelocidad en el Vehículo Acuático
        System.out.println("\nRecomendación de Velocidad para el Vehículo Acuático:");
        vehículoAcuático.recomendarVelocidad(90); // Viento muy alto
        vehículoAcuático.recomendarVelocidad(5);  // Viento muy bajo
    }
}