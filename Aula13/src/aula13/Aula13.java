package aula13;

/**
 * @author diarley
 */
public class Aula13 {

    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        
        cachorro1.reagir("Olá");
        cachorro1.reagir("Vai apanhar");
        cachorro1.reagir(11, 45);
        cachorro1.reagir(21, 00);
        cachorro1.reagir(true);
        cachorro1.reagir(false);
        cachorro1.reagir(2, 12.5f);
        cachorro1.reagir(17, 4.5f);
    }
}