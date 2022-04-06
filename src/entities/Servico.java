package entities;

public class Servico {

	private Integer idServico;
	private String nome;
	private Double preco;
	private Integer tempoEmMinutos;
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public Servico(Integer idServico, String nome, Double preco, Integer tempoEmMinutos) {
		super();
		this.idServico = idServico;
		this.nome = nome;
		this.preco = preco;
		this.tempoEmMinutos = tempoEmMinutos;
	}

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getTempoEmMinutos() {
		return tempoEmMinutos;
	}

	public void setTempoEmMinutos(Integer tempoEmMinutos) {
		this.tempoEmMinutos = tempoEmMinutos;
	}

	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", nome=" + nome + ", preco=" + preco + ", tempoEmMinutos="
				+ tempoEmMinutos + "]";
	}
	
		
}
