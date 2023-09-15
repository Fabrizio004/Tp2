package Numericos;

public abstract class Numerica {
    public abstract String toString();

    public abstract boolean equals(Object ob);

    public abstract Numerica sumar(Numerica número);

    public abstract Numerica restar(Numerica número);

    public abstract Numerica multiplicar(Numerica número);

    public abstract Numerica dividir(Numerica número);
}
