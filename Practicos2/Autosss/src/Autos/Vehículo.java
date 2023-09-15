package Autos;

public abstract class Vehículo {
    protected int velocidadActual;
    protected int velocidadMáxima;

    public Vehículo(int velocidadMáxima) {
        this.velocidadActual = 0;
        this.velocidadMáxima = velocidadMáxima;
    }

    public abstract void acelerar(int incrementoVelocidad);

    public abstract void frenar(int decrementoVelocidad);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMáxima + " km/h");
    }
}


