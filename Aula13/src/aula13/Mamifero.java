package aula13;

/**
 * @author diarley
 */
public class Mamifero extends Animal {

    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamífero.");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
