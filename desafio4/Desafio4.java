package desafio4;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeCasos = scanner.nextInt();
        int i = 0;
        ArrayList<String> lista = new ArrayList<>();


        while (i <= quantidadeCasos) {
            String texto = scanner.nextLine();
            lista.add(texto);
            i++;
        }
        for (String texto : lista) {
            int comprimento = texto.length();
            int meio = comprimento / 2;

            String primeiraParte = texto.substring(0, meio);
            String segundaParte = texto.substring(meio);

            StringBuilder builder = new StringBuilder(primeiraParte);
            String primeiraParteInvertida = builder.reverse().toString();

            StringBuilder builder2 = new StringBuilder(segundaParte);
            String segundaParteInvertida = builder2.reverse().toString();
            System.out.println(primeiraParteInvertida+segundaParteInvertida);
        }




    }
}