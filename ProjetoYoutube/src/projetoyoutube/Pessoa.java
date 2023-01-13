package projetoyoutube;

/**
 * @author diarley
 */
public abstract class Pessoa {
    
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;
    
    public void ganharExp() {
        
    }

    public Pessoa(String nome, String sexo, int idade, float experiencia) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\nSexo = " + sexo + "\nIdade = " + idade + "\nExperiencia = " + experiencia;
    }
}
