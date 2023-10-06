package Strings;

/* O dasafio é receber uma String e retornar se é um palindromo ou não.
    Esses são os exemplos:
    "level", return true
    "algorithm", return false
    "A man, a plan, a canal: Panama.", return true
* */

import java.util.Arrays;

public class ValidPalindrome {


    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
       // System.out.println("Digite a palavra ou frase que deseja testar:");

        //Era pra receber a entrada do usuários, mas ainda não sei
        //usar o Scanner de modo a guardar Strings longas. Será refatorado em breve
        String entradaUsuario = "A man, a plan, a canal: Panama.";


        //Nesse caso, o primeiro passo é retirar todos os caracteres especiais
        //e padronizar o tamnaho das letras, por isso a utilização dos métodos
        //toLowerCase e split, porém o split transforma a String em um array de Strings
        String[] semCaracteresEspeciais = entradaUsuario.toLowerCase().split("[, ?.@:-]+");

        //Então o próximo passo é voltar esse array de Strings pra String,
        //esse método está explicado no final
        String strTratada = convertStringArrayToString(semCaracteresEspeciais);

        //Isso feito, hora de tranformar a String em um array de char pra poder inverte-la.
        //Porém serão necessários 2, um que se manterá "normal" e outro q será invertido,
        //pra podermos comparar no final se eles ficaram iguais ou diferentes um do outro,
        //ou seja, se são palindromos ou não
        char[] arrayNormal = strTratada.toCharArray();
        char[] arrayInvertida = strTratada.toCharArray();

        System.out.println("palavra antes de ser invertida:");
        for (char elemento : arrayInvertida) {
            System.out.print(elemento + " ");
        }

        System.out.println();
        System.out.println("-------------------------");

        //Aqui eu reutilizei o código feito no desafio anterior pra
        //inverter a String
        for (int i = 0; i < arrayInvertida.length/2; i++) {
            char aux = arrayInvertida[i];
            arrayInvertida[i] = arrayInvertida[arrayInvertida.length - 1 - i];
            arrayInvertida[arrayInvertida.length - 1 - i] = aux;
        }

        System.out.println("palavra depois de ser invertida:");
        for (char elemento : arrayInvertida) {
            System.out.print(elemento + " ");
        }

        System.out.println();
        System.out.println("----------------------");
        //Hora de comparar o array "normal" com o invertido,
        //pra isso é só chamar o método equals da classe array
        boolean comparaArrays = Arrays.equals(arrayNormal, arrayInvertida);
        System.out.println("É um palíndromo?: " + comparaArrays);





    }
    /* Esse método eu copiei da internet. Basicamente, ele recebe um array de Strings,
    então ele cria uma String mutável e com o for ele percorre todo o array q ele
    recebeu e adiciona cada elemento ao final da String mutável. Faz isso com
    o método append q concatena Strings. Ao final ele retorna todo o conteúdo
    da String com o método substring.
    * */
    private static String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str);
        return sb.substring(0, sb.length());
    }
}
       

