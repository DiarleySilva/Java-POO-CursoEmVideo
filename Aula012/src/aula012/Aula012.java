package aula012;

/**
 * @author diarley
 */
public class Aula012 {

    public static void main(String[] args) {
        
        // Animal animal1 = new Animal(); A classe Animal é abstrata, por isso não pode ser instanciada
        
        /*
        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();
        */
        
        Canguru canguru1 = new Canguru();
        Cachorro cachorro1 = new Cachorro();
        
        /*
        mamifero1.setPeso(13.6f);
        mamifero1.setCorPelo("Preto");
        mamifero1.alimentar();
        mamifero1.locomover();
        mamifero1.emitirSom();
        */
        
        /*
        reptil1.locomover();
        peixe1.locomover();
        ave1.locomover();
        */
        
        canguru1.locomover();
        cachorro1.locomover();
    }    
}