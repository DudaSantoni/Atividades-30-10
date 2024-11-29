package construtorPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		Medico m1 = new Medico ("André", "Pediatra", 100, "ABCDE");
		Dentista d1 = new Dentista ("Sofia", "Geral", 200, "OPXCGF");
		Fisioterapeuta f1 = new Fisioterapeuta ("Sonoda", "Esporte", 150, "EUFSDG");
		
		m1.agendarConsulta();
		System.out.println();
		d1.agendarConsulta();
		System.out.println();
		f1.agendarConsulta();
		

	}

}
