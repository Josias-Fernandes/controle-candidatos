import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       String [] candidatos = {
                "Josias",
                "Nicolly",
                "Cacilda",
                "Ryan",
                "Mônica",
        };
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
       static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
               tentativasRealizadas++;
            else 
               System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
              System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativa ");
        
        else
             System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " REALIZADA");

       }

        //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3) == 1;
        }

          //imprimir candidatos selecionados
    static void imprimirSelecionados(){
        String [] candidatos = {
                "Josias",
                "Nicolly",
                "Cacilda",
                "Ryan",
                "Mônica",
        };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);
        }

        //forma abreviada usando For each
        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos

        String[] candidatos = {
                "Josias",
                "Nicolly",
                "Cacilda",
                "Ryan",
                "Mônica",
                "Juliana",
                "Antônio",
                "Joana",
                "Raul",
                "Daniela"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual =0;
        double salarioBase = 2500.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
           String candidato = candidatos[candidatoAtual];
           double salarioPretendido = valorPretendido();

           System.out.println("O candidato " + candidato + " tem a pretenção salarial de " + salarioPretendido);
           if(salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
           }
           candidatoAtual++;
        }
   
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2700);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2500.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR para o CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR os demais CANDIDATOS");
        }

    }
}