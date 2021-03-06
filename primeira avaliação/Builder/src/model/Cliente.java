package model;

public class Cliente {
	private String nome;
	private String endereco;
	private String profissao;
	private String estadoCivil;
	
	private Cliente() {}
	
	public static Cliente builder() {
		return new Cliente();
	}
	public Cliente nome(String nome) {
		this.nome = nome;
		return this;
	}
	public Cliente endereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	public Cliente profissao(String profissao) {
		this.profissao = profissao;
		return this;
	}
	public Cliente estadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", profissao=" + profissao + ", estadoCivil="
				+ estadoCivil + "]";
	}
	
	
}
