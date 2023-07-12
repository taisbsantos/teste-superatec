package desafio2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        String valorMonetarioStr = scanner.nextLine();
        double valorMonetario = Double.parseDouble(valorMonetarioStr);

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatacaoDecimal = new DecimalFormat("#0.00", simbolos);

        System.out.println("NOTAS:");

        for (double nota : notas) {
            int quantidadeNotas = (int) Math.floor(valorMonetario/nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + formatacaoDecimal.format(nota));
            valorMonetario %= nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) Math.floor(valorMonetario/moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + formatacaoDecimal.format(moeda));
            valorMonetario %= moeda;
        }

    }
}