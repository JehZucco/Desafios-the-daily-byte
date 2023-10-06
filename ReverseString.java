/*
Desafio de inverter uma String:
This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
    */


package Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //Pede uma entrada do usuário:
        System.out.println("Digite a palavra que você quer que seja invertida:");

        //A entrada do usuário é guardada na variável x, que é do tipo String:
        String x = entrada.next();
        
         //O array de caracteres j recebe o conteúdo da String x transformado em array, 
        //em que cada letra da String vira um elemento do array através do método .toCharArray():
        char[] j = x.toCharArray(); 
       
        //Esse for é apenas para imprimir o array com a entrada do usuário ainda sem alteração:
        for (char elemento : j) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        System.out.println("-----------");

        //Esse for faz a inversão do array, a lógica é a seguinte:
        /* a variável auxiliar recebe o conteúdo da posição 0, enquanto o conteúdo da posição 0
        recebe o da última posição, assim  o da última posição recebe o da auxiliar. Primeira troca feita,
        na próxima iteração o conteúdo da posição 1 é trocado pelo da penúltima posição, seguindo a mesma lógica.
        Isso tem que ser feito pelo número de vezes que é igual a metade do tamanho do array, não sei explicar
        a teoria matemática por trás, mas achava que isso tinha que ser feito pelo número de vezes igual ao tamanho do array,
        porém no teste de mesa foi possível perceber que quando chegava na metade a palavra já estava invertida
        e quando processeguia pelo número de vezes do seu tamanho o que ocorria era que a palavra era invertida e depois
        voltava para sua formação original*/
        for (int i = 0; i < j.length/2; i++) {
            char aux = j[i];
            j[i] = j[j.length - 1 - i];
            j[j.length - 1 - i] = aux;
        }

        //Esse for é para imprimir a entrada do usuário já invertida:
        for (char elemento : j) {
            System.out.print(elemento + " ");
        }
    }
}
