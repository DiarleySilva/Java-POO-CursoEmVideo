package aula02;

/**
 * @author diarley
 */
public class Caneta {

    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada.");
        } else {
            System.out.println("Rasbicando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }
}