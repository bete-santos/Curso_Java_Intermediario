package exercicios;

public class Calculadora {

    enum Operacoes {
        SOMA("+") {
            @Override
            public double executarOperacoes(double x, double y) {
                return x + y;
            }
        },
        SUBTRAIR("-") {
            @Override
            public double executarOperacoes(double x, double y) {
                return 0;
            }
        },
        MULTIPLICAR("*") {
            @Override
            public double executarOperacoes(double x, double y) {
                return 0;
            }
        },
        DIVIDIR("/") {
            @Override
            public double executarOperacoes(double x, double y) {
                return 0;
            }
        };

        private String simbolo;

        Operacoes(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacoes(double x, double y);

        @Override
        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operacoes op: Operacoes.values()) {
            System.out.println(x + " =  ");
            System.out.println(op.toString() + " ");
            System.out.println(y + " = ");
            System.out.println(op.executarOperacoes(x,y));

        }

    }
}
