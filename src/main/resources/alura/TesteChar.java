package main.resources.alura;

public class TesteChar {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;  // Equivale a letra A!
        System.out.println(valor);

        //valor = valor + 1;         // Não compila!

        valor = (char) (valor + 1); // Compila Fazendo casting e esquivale a letra B
        System.out.println(valor);


    }
}
