package POO_Basico.POO_01;

public class TestaCliente {

	public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Maethe",26,001,"mmaethe@gmail.com","(11)95764-9888");
        cliente01.visualizar();
        
        Cliente cliente02 = new Cliente("Lorena Orsi",21,002,"lore.orsi@gmail.com","(11)98999-9899");
        cliente02.visualizar();
	}

}
