package projetolivro;

/**
 * @author diarley
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];
        
        pessoas[0] = new Pessoa("Diarley", 23, "Homem");
        pessoas[1] = new Pessoa("Fulano", 33, "Mulher");
        
        livros[0] = new Livro("Senhor das Moscas", "Fulano de tal", 300, 0, true, pessoas[0]);
        livros[1] = new Livro("Harry Potter", "JK Rowling", 400, 0, true, pessoas[1]);
        livros[2] = new Livro("Senhor dos Aneis", "Tolkien", 450, 0, true, pessoas[0]);
        
        livros[0].abrir();
        livros[0].folhear(150);
        livros[0].avancarPag();
        System.out.println(livros[0].detalhes());
        System.out.println("");
        System.out.println(livros[1].detalhes());
    }    
}