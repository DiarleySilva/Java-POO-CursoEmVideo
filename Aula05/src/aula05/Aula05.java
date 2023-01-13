package aula05;

/**
 * @author diarley
 */
public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco();
        ContaBanco conta2 = new ContaBanco();
        
        conta1.setNumConta(1000);
        conta1.setDono("Diarley");
        conta1.abrirConta("CP");
        conta1.depositar(300);
        //conta1.fecharConta(); // Não é possivel fechar conta com dinheiro
        conta1.sacar(450); // Saque para fechar conta
        conta1.fecharConta();

        conta2.setNumConta(1001);
        conta2.setDono("Fulano");
        conta2.abrirConta("CC");
        conta2.depositar(500);
        conta2.sacar(100);
        //conta2.sacar(1000);
        
        conta1.estadoAtual();
        conta2.estadoAtual();
    }
}