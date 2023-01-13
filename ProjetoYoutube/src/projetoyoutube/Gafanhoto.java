package projetoyoutube;

/**
 * @author diarley
 */
public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login, float experiencia) {
        super(nome, sexo, idade, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "\nGafanhoto --------------\n" + super.toString() + "\nLogin = " + login + "\nTotal assistido = " + totAssistido;
    }
}