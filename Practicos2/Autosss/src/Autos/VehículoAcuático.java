package Autos;

public class VehículoAcuático extends Vehículo implements interfaz.Vela{
    private String tipo;
    private int capacidadPasajeros;

    public VehículoAcuático(int velocidadMáxima, String tipo, int capacidadPasajeros) {
        super(velocidadMáxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMáxima) {
            velocidadActual += incrementoVelocidad;
        } else {
            velocidadActual = velocidadMáxima;
        }
    }

    @Override
    public void frenar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual -= decrementoVelocidad;
        } else {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("La velocidad del viento es muy alta. No se recomienda navegar.");
            velocidadActual = 0;
        } else if (velocidadViento < 10) {
            System.out.println("La velocidad del viento es muy baja. No se recomienda navegar.");
            velocidadActual = 0;
        }
    }
}

