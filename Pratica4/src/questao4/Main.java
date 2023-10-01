package questao4;

public class Main {

	public static void main(String[] args) {
		
		CelularFabricanteA a = new CelularFabricanteA(6800, true);
		CelularFabricanteB b = new CelularFabricanteB(5200, true);
		
		System.out.println(a.atributosFabA());
		System.out.println();
		System.out.println(b.atributosFabB());

	}

}
