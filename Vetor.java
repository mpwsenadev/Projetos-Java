package basico;

public class Vetor {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Carlos";
		nomes[1] = "Marcelo";
		nomes[2] = "Gabriela";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println("============");
		// Segunda forma
		String[] nomes1 = {"Carlos", "Marcelo", "Gabriela"};
		nomes1[0] = "Eu";
		System.out.println(nomes1[0]);
	}
}
