package POO_Basico.POO_04;

public class TesteFarmacia {

	public static void main(String[] args) {
	
		Farmacia remedio01 = new Farmacia("Neosaldina","Nycomed","04/2024","300mg",36.88);
        remedio01.visualizar();
        
        Farmacia remedio02 = new Farmacia("Losartana","Medley","03/2022","50mg",34.90);
        remedio02.visualizar();
	}

}
