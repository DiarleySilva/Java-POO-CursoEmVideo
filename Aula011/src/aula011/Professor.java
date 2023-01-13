package aula011;

/**
 * @author diarley
 */
public class Professor extends Pessoa {

    private String especialiade;
    private float salario;

    public void receberAumento(float aumento) {
        this.salario += aumento;
        System.out.println("Salario aumentado em R$" + aumento + ".");
    }

    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
