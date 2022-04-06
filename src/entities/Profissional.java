package entities;

import java.util.List;

public class Profissional {

	private Integer idProfissional;
	private String nome;
	private String telefone;
	private Estabelecimento estabelecimento; // TER-1 (Associação)
	private List<Servico> servicos;

	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer idProfissional, String nome, String telefone, Estabelecimento estabelecimento,
			List<Servico> servicos) {
		super();
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.telefone = telefone;
		this.estabelecimento = estabelecimento;
		this.servicos = servicos;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public String toString() {
		return "Profissional [idProfissional=" + idProfissional + ", nome=" + nome + ", telefone=" + telefone
				+ ", estabelecimento=" + estabelecimento + ", servicos=" + servicos + "]";
	}

}
