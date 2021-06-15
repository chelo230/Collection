// Função Algoritmo: Exibe os meses do primeiro semestre com temperaturas acima da média
//Data: 14/06/2021
//Autor: Neilor R. Marangoni

package digital.innovation.one.collection;

import java.util.ArrayList;
import java.util.List;

class Exercicio1MediaList {

    public static void main(String[] args) {
        List<Meses> temperaturas = new ArrayList<>(){{
            add(new Meses(1, "Janeiro", 23.5));
            add(new Meses(2, "Fevereiro", 21.8));
            add(new Meses(3, "Março", 12.3));
            add(new Meses(4, "Abril", 17.1));
            add(new Meses(5, "Maio", 18.4));
            add(new Meses(6, "Junho", 9.5));
        }};

        // Apura a soma das temperaturas
        System.out.println(temperaturas);
        Double soma = 0.0;
        Double media = 0.0;
        for(int i=0; i <=5; i++){
            soma += temperaturas.get(i).getTemperatura();
        }

        // Apura a média das temperaturas e exibe meses com temperatura acima da média
        media = (soma /6);
        System.out.println("--> A media das temperaturas no primeiro semestre é: " +media +" oC");
        System.out.println("--------------------------------------------------");
        for(int i=0; i <=5; i++){
            if(temperaturas.get(i).getTemperatura() > media){
                System.out.println("Temperatura acima da média: mês: "+temperaturas.get(i).getMes() +" - "
                        +temperaturas.get(i).getNome()+" : "+temperaturas.get(i).getTemperatura()+" oC");

            }
        }

    }
}
