package projetopessoas;

/**
 * @author diarley
 */
public class ProjetoPessoas {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();

        pessoa1.setNome("Diarley");
        pessoa1.setSexo("Masculino");
        pessoa1.setIdade(23);

        aluno1.setNome("Fulano");
        aluno1.setSexo("Feminino");
        aluno1.setIdade(26);
        aluno1.setCurso("Enfermagem");

        professor1.setNome("Ciclano");
        professor1.setSalario(2200);
        professor1.receberAum(400);

        funcionario1.setNome("Beltrano");
        funcionario1.setSetor("Almoxarifado");

        //pessoa1.receberAum(200);
        System.out.println(pessoa1.toString());
        System.out.println(aluno1.toString());
        System.out.println(professor1.toString());
        System.out.println(funcionario1.toString());
    }
}
