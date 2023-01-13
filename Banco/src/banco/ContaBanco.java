package banco;

/**
 * @author diarley
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo) {

        setTipo(tipo);
        setStatus(true);

        if (tipo == "CC") {
            setSaldo(50);
        } else if (tipo == "CP") {
            setSaldo(150);
        }
    }

    public void fecharConta() {

        if (saldo > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (saldo < 0) {
            System.out.println("Conta em débito.");
        } else {
            setStatus(false);
        }
    }

    public void depositar(double valor) {

        if (status == true) {
            setSaldo(getSaldo() + valor);
            // saldo = saldo + valor;
        } else {
            System.out.println("Não é possivel depositar.");
        }
    }

    public void sacar(double valor) {

        if (isStatus() == true) {
            if (getSaldo() > 0) {
                setSaldo(getSaldo() - valor);
            }
        } else {
            System.out.println("Não é possivel sacar.");
        }
    }

    public void pagarMensal() {

        int valorMensal = 0;

        if (getTipo() == "CC") {
            valorMensal = 12;
        } else if (getTipo() == "CP") {
            valorMensal = 20;
        }

        if (isStatus() == true) {
            if (getSaldo() > valorMensal) {
                setSaldo(getSaldo() - valorMensal);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}