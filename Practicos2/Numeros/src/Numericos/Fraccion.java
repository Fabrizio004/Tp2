package Numericos;

public class Fraccion extends Numerica{
        private int numerador;
        private int denominador;

        public Fraccion(int numerador, int denominador) {
            this.numerador = numerador;
            if (denominador == 0) {
                throw new IllegalArgumentException("El denominador no puede ser cero.");
            }
            this.denominador = denominador;
        }

        @Override
        public String toString() {
            return numerador + "/" + denominador;
        }

        @Override
        public boolean equals(Object ob) {
            if (this == ob) return true;
            if (ob == null || getClass() != ob.getClass()) return false;
            Fraccion fraccion = (Fraccion) ob;
            return numerador == fraccion.numerador && denominador == fraccion.denominador;
        }

        @Override
        public Numerica sumar(Numerica numero) {
            if (numero instanceof Fraccion) {
                Fraccion otraFraccion = (Fraccion) numero;
                int nuevoNumerador = (this.numerador * otraFraccion.denominador) + (otraFraccion.numerador * this.denominador);
                int nuevoDenominador = this.denominador * otraFraccion.denominador;
                return simplificarFracción(new Fraccion(nuevoNumerador, nuevoDenominador));
            }
            throw new IllegalArgumentException("No se puede sumar una fracción con otro tipo de número.");
        }

        @Override
        public Numerica restar(Numerica número) {
            if (número instanceof Fraccion) {
                Fraccion otraFracción = (Fraccion) número;
                int nuevoNumerador = (this.numerador * otraFracción.denominador) - (otraFracción.numerador * this.denominador);
                int nuevoDenominador = this.denominador * otraFracción.denominador;
                return simplificarFracción(new Fraccion(nuevoNumerador, nuevoDenominador));
            }
            throw new IllegalArgumentException("No se puede restar una fracción con otro tipo de número.");
        }

        @Override
        public Numerica multiplicar(Numerica número) {
            if (número instanceof Fraccion) {
                Fraccion otraFraccion = (Fraccion) número;
                int nuevoNumerador = this.numerador * otraFraccion.numerador;
                int nuevoDenominador = this.denominador * otraFraccion.denominador;
                return simplificarFracción(new Fraccion(nuevoNumerador, nuevoDenominador));
            }
            throw new IllegalArgumentException("No se puede multiplicar una fracción con otro tipo de número.");
        }

        @Override
        public Numerica dividir(Numerica número) {
            if (número instanceof Fraccion) {
                Fraccion otraFracción = (Fraccion) número;
                if (otraFracción.numerador == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                int nuevoNumerador = this.numerador * otraFracción.denominador;
                int nuevoDenominador = this.denominador * otraFracción.numerador;
                return simplificarFracción(new Fraccion(nuevoNumerador, nuevoDenominador));
            }
            throw new IllegalArgumentException("No se puede dividir una fracción por otro tipo de número.");
        }

        private Fraccion simplificarFracción(Fraccion fraccion) {
            int gcd = gcd(fraccion.numerador, fraccion.denominador);
            return new Fraccion(fraccion.numerador / gcd, fraccion.denominador / gcd);
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }


