package aula05;

/**
 * @author diarley
 */
public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos personalizados
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String tipo) {
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if (tipo == "CC") {
            this.setSaldo(50);
            //this.saldo = 50;
        } else if (tipo == "CP") {
            this.setSaldo(150);
            //this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
        //this.tipo = tipo;
        //this.status = true;        
    }
    
    public void fecharConta() {
        
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor) {
        
        if (this.isStatus()) {
            this.setSaldo(getSaldo() + valor);
            //this.saldo = this.saldo + valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel depositar. Conta fechada.");
        }
    }
    
    public void sacar(float valor) {
        
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Não foi possivel sacar: Conta fechada.");
        }
    }
    
    public void pagarMensal() {
        
        int valor;
        
        if (this.getTipo() == "CC") {
            valor = 12;
        } else {
            valor = 20;
        }
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Não foi possivel pagar a mensalidade: Conta fechada.");
        }
    }

    // Métodos especiais
    public ContaBanco() {
        
        this.setSaldo(0);
        this.setStatus(false);

        //this.saldo = 0;
        //this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}