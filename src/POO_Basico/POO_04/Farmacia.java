package POO_Basico.POO_04;

public class Farmacia {

	private String nomeRemedio;
	private String fabricante;
	private String dataValidade;
    private String dosagem;
    private double preco;
    
	public Farmacia(String nomeRemedio, String fabricante, String dataValidade, String dosagem, double preco) {
		this.nomeRemedio = nomeRemedio;
		this.fabricante = fabricante;
		this.dataValidade = dataValidade;
		this.dosagem = dosagem;
		this.preco = preco;
	}

	//GET & SET
	
	public String getNomeRemedio() {
		return nomeRemedio;
	}

	public void setNomeRemedio(String nomeRemedio) {
		this.nomeRemedio = nomeRemedio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//END
	
	public void visualizar() {
		System.out.println(""+
	"|------------------------------------|\n" +
	"|          Farmácia Nishimura        |\n" +
	"|------------------------------------|\n" +
    "| Nome do Medicamento: " + nomeRemedio + "\n" +
    "| Fabricante: " + fabricante + "\n" +
    "| Data de Validade: " + dataValidade + "\n" + 
    "| Dosagem: " + dosagem + "\n" +
    "| Preço: " + preco + "\n" +
    "-------------------------------------"
    );
	}
    
    
}
