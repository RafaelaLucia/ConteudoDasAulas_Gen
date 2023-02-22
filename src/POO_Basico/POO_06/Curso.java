package POO_Basico.POO_06;

public class Curso {

	private String nome;
	private int cargaHoraria;
	private String nivel;
	private double preco;
	private String instituicao;
	
	public Curso(String nome, int cargaHoraria, String nivel, double preco, String instituicao) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.nivel = nivel;
		this.preco = preco;
		this.instituicao = instituicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public void visualizar() {
		System.out.println("" +
	"\nNome: " + nome +
	"\nCarga Horária: " + cargaHoraria + "h " +
	"\nNível: " + nivel +
	"\nPreço: R$" + preco +
	"\nInstituicao: " + instituicao);
	}
}
