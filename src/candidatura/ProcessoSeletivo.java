package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {

    public static void main(String[] args) {
     selecaoCandidatos(); 
     System.out.println(" \n ");
     imprimirSelecionados();
    }
    
     static void imprimirSelecionados() {
        String [] candidatos = {"Joao", "Patricia", "Carine", "Jose", "Joabe"};
        System.out.println("Imprimindo a lista de candidatos, com indice do elemento!");
        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        
        System.out.println(" \n ");
        System.out.println("OBS:");
        System.out.println(" \n ");
        System.out.println("Forma abreviada e mais Simples, com o For each.");
        System.out.println(" \n ");
        for(String candidato: candidatos ) {
            System.out.println("Os candidatos selecionados foram: " + candidato);
        }
    }



     static void selecaoCandidatos() {
        //Array com lista de candidatos
        String [] candidatos = {"Joao", "Patricia", "Carine", "Jose", "Joabe", "Ronan", "Thiago", "Eduardo", "Danilo", "Josue"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou o valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
     }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        }

    
        static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato!");
            
            }else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o candidato com uma contra proposta!");    
            }
            else{
                System.out.println("Aguardando resultado dos demais candidatos!");   
            }
        }
}
 