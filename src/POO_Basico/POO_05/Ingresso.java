package POO_Basico.POO_05;

public class Ingresso {

	private String artista;
	private String data;
	private String horario;
	private String local;
	private double preco;
	
	public Ingresso(String artista, String data, String horario, String assento, double preco) {
		this.artista = artista;
		this.data = data;
		this.horario = horario;
		this.local = assento;
		this.preco = preco;
	}

	//Get & Set
	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String assento) {
		this.local = assento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//End
	
	public void visualizar() {
		System.out.println(""+
	"        \nCONFIRMAÇÃO DE COMPRA:" +
	"        \nSHOW DO(A) " + artista +
	"        \nDIA " + data +
	"        \nÀS " + horario + " HORAS" +
	"        \nLOCAL: " + local +
	"        \nPREÇO: R$" + preco + 
	" " +
	"        \nESPERAMOS VOCÊ LÁ!!! :D");
	}
	
	
	
	
	
	
}
