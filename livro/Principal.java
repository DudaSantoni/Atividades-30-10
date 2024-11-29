package livro;

public class Principal {

	public static void main(String[] args) {

		Livro livro = new Livro("Por lugares incríveis", "Jennifer Niven");

		System.out.println("Livro: " + livro.getNome() + ". Escrito por: " + livro.getAutor());
	}

}
