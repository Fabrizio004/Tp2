package Autos;

public class VehículoTerrestre extends Vehículo implements interfaz.Motor {
    private int cantidadLlantas;
    private String uso;

    public VehículoTerrestre(int velocidadMáxima, int cantidadLlantas, String uso) {
        super(velocidadMáxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
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
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}

