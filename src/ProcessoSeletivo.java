import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       selecaoCandidatos();

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