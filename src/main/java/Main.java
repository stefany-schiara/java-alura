public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //binario 101101

         int numeroDigitado = 45;
         int guardarNumeroDigitado = numeroDigitado;
         int divisaoPorDois = 2;
         //int valorDivisao = 0;
         int resto = 0;

         while (numeroDigitado > 0){

             numeroDigitado = numeroDigitado / divisaoPorDois;
             resto = (numeroDigitado % 2);
             System.out.println(resto);

         }
    }
}