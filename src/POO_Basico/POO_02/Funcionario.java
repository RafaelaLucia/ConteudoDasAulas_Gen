package POO_Basico.POO_02;

public class Funcionario {

	private String nomeFuncionario;
	private int idade;
	private String cargo;
	private double salario;
	private int anoAdmissao;
	
	public Funcionario(String nomeFuncionario, int idade, String cargo, double salario, int anoAdmissao) {
		this.nomeFuncionario = nomeFuncionario;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.anoAdmissao = anoAdmissao;
	}
	
	//GET & SET

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	//END
	
	public void visualizar() {
		System.out.println("" +
	"___________________________________\n" +
	"         Banco de Funcionários     \n" +
	"             N&Q Segurança         \n" +
	"___________________________________\n" +
	"    - Funcionário(a): " + nomeFuncionario + "\n" +
	"    - Idade: " + idade                    + "\n" +
	"    - Cargo: " + cargo                    + "\n" +
	"    - Salário: R$" + salario                + "\n" +
	"    - Ano de Admissão: " + anoAdmissao    + "\n" +
	"____________________________________\n");
				
	}
	
	
	
	
	
}
