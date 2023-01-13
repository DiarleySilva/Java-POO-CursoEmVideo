package aula02;

/**
 * @author diarley
 */
public class Aula02 {

    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Teste";
        caneta1.cor = "Azul";
        caneta1.ponta = 1.0f;
        caneta1.carga = 50;
        
        // Caneta destampada
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        
        // Caneta tampada
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        
        // Nova caneta
        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Teste 2";
        caneta2.cor = "Preta";
        caneta2.ponta = 0.5f;
        caneta2.carga = 100;
        
        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
    }    
}