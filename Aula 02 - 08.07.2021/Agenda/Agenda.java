package Agenda;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args){

        String dados;
        boolean fim = false;
        ArrayList<String> agenda = new ArrayList();

        while (!fim){

            System.out.print("Informe seu nome e seu número: ");
            Scanner sc = new Scanner(System.in);
            dados = sc.nextLine();
            agenda.add(dados);


            System.out.print("Deseja acrescentar outro contato? S/N");
            String continuar = sc.nextLine();
            String confirmar = "s";
            if (continuar.toLowerCase().equals(confirmar)) {
                System.out.print("\n");
                continue;
            } else { fim = true;}
        }

        int tamanho = agenda.size();

        if(tamanho > 0){
            for ( String contato : agenda ) {
                System.out.println(contato);
                System.out.print("\n");
            }
        }
    }
}
