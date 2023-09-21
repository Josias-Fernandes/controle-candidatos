
public class ProcessoSeletivo {
   public static void main(String[] args) {
    analisarCandidato(2300.00);
    //analisarCandidato(2700.00);
   // analisarCandidato(2500.00);

   }
   static void analisarCandidato(double salarioPretendido ){
     double salarioBase = 2500.00;
     if(salarioBase > salarioPretendido){
       System.out.println("LIGAR para o CANDIDATO");
     }else if(salarioBase == salarioPretendido){
        System.out.println("Ligar para o candidato com CONTRA PROPOSTA");
     } else {
        System.out.println("AGUARDAR os demais CANDIDATOS");
     }


   }
}