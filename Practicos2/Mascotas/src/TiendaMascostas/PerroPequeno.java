package TiendaMascostas;

public class PerroPequeno extends Perro{
    private String raza;

    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

