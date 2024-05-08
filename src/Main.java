import javax.print.attribute.standard.Media;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Disciplina eng3 = new Disciplina(new Aritmetica());

        eng3.setNome("Noemi Ribeiro");
        eng3.setP1(8);
        eng3.setP2(6);

        System.out.println("Média Aritmética: " + eng3.getMedia());

        Disciplina eng = new Disciplina(new Geometrica());

        eng.setNome("Noemi Ribeiro");
        eng.setP1(8);
        eng.setP2(6);

        System.out.println("Média Aritmética: " + eng.getMedia());

    }
}