// Função Algoritmo: Exibe a classificação com base nas 5 respostas do interrogatório
//Data: 14/06/2021
//Autor: Neilor R. Marangoni

package digital.innovation.one.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2InterrogatorioList {

    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----> P__E__R__G__U__N__T__A__S <---- \n");

        //entrada de dados
        System.out.println("1 - Telefonou para a vítima?");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("2 - Esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("3 - Mora perto da vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("4 - Devia para a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("5 - Já trabalhou com a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Suas respostas foram: "+respostas);

        //acumula respostas "sim"
        int count =0;
        Iterator<String > contador = respostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count ++;
            }
        }

        //classifica pessoa com base no número de respostas "sim"
        switch(count){
            case 2:
                System.out.println("-->> Você é SUSPEITO(A) <<--");
                break;
            case 3:
            case 4:
                System.out.println("-->> Você é CÚMPLICE <<--");
                break;
            case 5:
                System.out.println("ATENÇÃO! -->> Você é ASSASSINO(A) <<--");
                break;
            default:
                System.out.println("-->> Você é INOCENTE <<--");
                break;
        }

    }
}
