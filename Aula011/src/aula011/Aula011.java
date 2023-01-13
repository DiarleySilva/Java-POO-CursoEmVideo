package aula011;

/**
 * @author diarley
 */
public class Aula011 {

    public static void main(String[] args) {
        
        //Pessoa pessoa1 = new Pessoa(); classe abstrata
        
        Visitante visitante1 = new Visitante();
        visitante1.setNome("Marta");
        visitante1.setIdade(30);
        visitante1.setSexo("F");
        System.out.println(visitante1.toString());
        
        System.out.println("");
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Fulano");
        aluno1.setIdade(17);
        aluno1.setSexo("M");
        aluno1.setMatricula(1010);
        aluno1.setCurso("Administração");
        aluno1.pagarMensalidade();
        System.out.println(aluno1.toString());
        
        System.out.println("");
        
        Bolsista bolsista1 = new Bolsista();
        bolsista1.setNome("Ciclano");
        bolsista1.setIdade(18);
        bolsista1.setBolsa(10f);
        bolsista1.setMatricula(1210);
        bolsista1.pagarMensalidade();
        System.out.println(bolsista1.toString());
        
        System.out.println("");
        
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNome("Beltrano");
        tecnico1.setIdade(18);
        tecnico1.setSexo("F");
        tecnico1.setMatricula(0010);
        tecnico1.setCurso("Enfermagem");
        tecnico1.setRegistroProfissional(1234);
        tecnico1.praticar();
        System.out.println(tecnico1.toString());
        
        System.out.println("");
        
        Professor professor1 = new Professor();
        professor1.setNome("Marcos");
        professor1.setIdade(35);
        professor1.setSexo("M");
        professor1.setEspecialiade("Mestrado em medicina");
        professor1.setSalario(4500);
        professor1.receberAumento(600);
        System.out.println(professor1.toString());
    }
}
