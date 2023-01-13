package banco;

/**
 * @author diarley
 */
public class Banco {

    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco(0, true);
        conta1.abrirConta("CC");
        conta1.depositar(100);
        conta1.isStatus();
    }    
}