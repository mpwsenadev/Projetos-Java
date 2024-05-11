package basico;

public class Foreach {

	public static void main(String[] args) {
		String[] nomes = {"Carlos", "Marcelo", "Gabriela"};
		for(String nome : nomes){
			System.out.println(nome);
		}
		// Outro exemplo
		
		System.out.println("===========");
		int[] numero = {1,2,3};
		int soma=0;
		for(int n:numero){
			soma +=n;
		}
		
		System.out.println(soma);
	}
}
