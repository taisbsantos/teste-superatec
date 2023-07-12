import java.util.Scanner;
import java.util.ArrayList;

class Desafio3 {
    public static void main(String[] args) {
        int i = 0;
        int j;
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        while (i < n) {
            int entrada = scanner.nextInt();
            lista.add(entrada);
            i++;
        }

        int contador = 0;

        for (i = 0; i < lista.size(); i++) {
            for (j = i + 1; j < lista.size(); j++) {
                if ((lista.get(i) > lista.get(j)) && ((lista.get(i) - lista.get(j)) == k)) {
                    contador++;
                }
            }
        }

        for (i = 0; i < lista.size(); i++) {
            for (j = i + 1; j < lista.size(); j++) {
                if ((lista.get(j) > lista.get(i)) && ((lista.get(j) - lista.get(i)) == k)) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}
