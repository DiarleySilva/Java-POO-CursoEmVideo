package projetoyoutube;

/**
 * @author diarley
 */
public class ProjetoYoutube {

    public static void main(String[] args) {

        Video videos[] = new Video[3];

        videos[0] = new Video("Java", 0, 0, 0, false);
        videos[1] = new Video("Python", 0, 0, 0, false);
        videos[2] = new Video("Kotlin", 0, 0, 0, false);

        Gafanhoto gafanhoto1 = new Gafanhoto("Fulano", "M", 20, "fulano123", 0);
        Gafanhoto gafanhoto2 = new Gafanhoto("Ciclano", "F", 29, "ciclano321", 0);

        //System.out.println(videos[0].toString());
        //System.out.println(gafanhoto1.toString());
        
        Visualizacao visualizacoes[] = new Visualizacao[3];

        visualizacoes[1] = new Visualizacao(gafanhoto1, videos[1]); // Assiste o video Python
        visualizacoes[1].avaliar();

        visualizacoes[2] = new Visualizacao(gafanhoto2, videos[2]); // Assiste o video Kotlin
        visualizacoes[2].avaliar(70f);

        System.out.println(visualizacoes[1].toString());
        System.out.println(visualizacoes[2].toString());
    }
}
