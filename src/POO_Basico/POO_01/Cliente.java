package POO_Basico.POO_01;

public class Cliente {

	
	private String nomeCliente;
	private int idade;
	private int numeroInscricao;
	private String email;
	private String telefone;
	
	public Cliente(String nomeCliente, int idade, int numeroInscricao, String email, String telefone) {
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.numeroInscricao = numeroInscricao;
		this.email = email;
		this.telefone = telefone;
	}
	
	//GET & SET

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getNumeroInscricao() {
		return numeroInscricao;
	}

	public void setNumeroInscricao(int numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// END
	
	public void visualizar() {
		System.out.println("" +
	"___________________________________\n" +
	"          Cliente nº " + numeroInscricao + "\n" +
	"___________________________________\n" +
	"    - Nome: " + nomeCliente +        "\n" +
	"    - Idade: " + idade +             "\n" +
	"    - Email: " + email +             "\n" +
	"    - Telefone de Contato: " + telefone + "\n" +
	"____________________________________\n");
				
	}
	
	
	
	
}
