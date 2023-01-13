package aula011;

/**
 * @author diarley
 */
public class Bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("A bolsa do aluno " + this.nome + " foi renovada.");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista. Mensalidade paga.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
