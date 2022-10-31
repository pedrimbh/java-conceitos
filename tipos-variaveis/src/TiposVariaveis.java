public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String nome = "Joao";
        double salarioMinimo = 2500;
        byte idade = 123;
        short ano = 2021;
        int cep = 9876543;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double numero = 2132515;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        numero = 10;

        System.out.println(((int)numero));

        final double VALOR_DE_PI = 3.14;

    }
}
