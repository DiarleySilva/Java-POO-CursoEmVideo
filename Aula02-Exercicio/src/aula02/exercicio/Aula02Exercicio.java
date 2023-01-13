package aula02.exercicio;

/**
 * @author diarley
 */
public class Aula02Exercicio {

    public static void main(String[] args) {
        
        Mouse mouse1 = new Mouse();
        mouse1.cor = "Preto";
        mouse1.botoes = 5;
        mouse1.clicar();
        
        Dormir cochilo = new Dormir();
        cochilo.tempo = "30 minutos";
        cochilo.deitar();
        cochilo.estado();
    }    
}