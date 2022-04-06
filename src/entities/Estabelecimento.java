package entities;

public class Estabelecimento {
	
	private Integer idEstabelecimento;
	private String nome;
	private String cnpj;
	
	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}

	public Estabelecimento(Integer idEstabelecimento, String nome, String cnpj) {
		super();
		this.idEstabelecimento = idEstabelecimento;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(Integer idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Estabelecimento [idEstabelecimento=" + idEstabelecimento + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	
}
