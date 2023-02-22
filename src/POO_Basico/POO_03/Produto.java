package POO_Basico.POO_03;

public class Produto {
	
	private String nomeJogo;
	private String genero;
	private String modoJogo;
	private String perspectiva;
	private int anoLancamento;
	
	public Produto(String nomeJogo, String genero, String modoJogo, String perspectiva, int anoLancamento) {
		this.nomeJogo = nomeJogo;
		this.genero = genero;
		this.modoJogo = modoJogo;
		this.perspectiva = perspectiva;
		this.anoLancamento = anoLancamento;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getModoJogo() {
		return modoJogo;
	}

	public void setModoJogo(String modoJogo) {
		this.modoJogo = modoJogo;
	}

	public String getPerspectiva() {
		return perspectiva;
	}

	public void setPerspectiva(String perspectiva) {
		this.perspectiva = perspectiva;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public void visualizar() {
		System.out.println("" +
	"___________________________________\n" +
	"            Loja GameShow          \n" +
	"      Detalhes do Jogo: " + nomeJogo + "\n"+
	"___________________________________\n" +
	"    - Nome: " + nomeJogo + "\n" +
	"    - Gênero: " + genero                    + "\n" +
	"    - Modo de Jogo: " + modoJogo                    + "\n" +
	"    - Perspectiva: " + perspectiva                + "\n" +
	"    - Ano de Lançamento: " + anoLancamento    + "\n" +
	"____________________________________\n");
				
	}
	
	

}
