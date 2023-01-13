package aula02;

/**
 * @author diarley
 */
public class Aula02 {

    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta();
        
        caneta1.modelo = "BIC Cristal";
        caneta1.cor = "azul";
        // caneta1.ponta = 0.5f;
        caneta1.carga = 50;
        // caneta1.tampada = false;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        
        //Caneta caneta2 = new Caneta();
        
    }    
}