package aula07;

/**
 * @author diarley
 */
public class Lutador {

    // Atributos
    private String nome, nacionalidade, categoria;
    private byte idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade, byte idade, byte vitorias, byte derrotas, byte empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        setPeso(peso);
    }

    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + "vitorias");
        System.out.println(getDerrotas() + "derrotas");
        System.out.println(getEmpates() + "empates");
    }

    public void ganharLuta() {
        setVitorias((byte) (getVitorias() + 1));
    }

    public void perderLuta() {
        setDerrotas((byte) (getDerrotas() + 1));
    }

    public void empatarLuta() {
        setEmpates((byte) (getEmpates() + 1));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

        if (peso <= 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public byte getVitorias() {
        return vitorias;
    }

    public void setVitorias(byte vitorias) {
        this.vitorias = vitorias;
    }

    public byte getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(byte derrotas) {
        this.derrotas = derrotas;
    }

    public byte getEmpates() {
        return empates;
    }

    public void setEmpates(byte empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }
}
