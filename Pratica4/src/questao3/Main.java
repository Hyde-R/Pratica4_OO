package questao3;

public class Main {
    public static void main(String[] args) {

        Projeto p1 = new DistribuicaoAlimento("Yasuo", "Ativar a passiva secreta", "Newton Paiva", "01/09/2023", "Comida", 4);
        Projeto p2 = new TrabalhoVoluntario("Akali", "Obter a maestria 7", "Paiva Newton", "30/09/2023", "Escravo", 8);

        p1.validaProjeto();
        System.out.println(p1.imprimeProjeto());
        p2.validaProjeto();
        System.out.println(p2.imprimeProjeto());

    }
}
