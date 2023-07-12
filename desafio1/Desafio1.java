package desafio1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada, i = 0;
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        entrada = scanner.nextInt();
        while(i < entrada){
            int numero_positivo = scanner.nextInt();
            if(numero_positivo % 2 == 0 ){
                pares.add(numero_positivo);
            }else {
                impares.add(numero_positivo);
            }
            i++;
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for (int elemento : pares) {
            System.out.println(elemento);
        }

        for (int elemento : impares) {
            System.out.println(elemento);
        }


    }
}