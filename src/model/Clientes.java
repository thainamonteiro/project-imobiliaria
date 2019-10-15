package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Clientes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clientes")
	private Integer id_clientes;
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String telefone;
	private String bairro;
	private String logradouro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Clientes() {
		super();
	}
	
	public Clientes(Integer id, String nome, String cpf, String rg, String sexo, String telefone, String bairro,
			String logradouro, String cidade, String uf, String cep) {
		super();
		this.id_clientes = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.telefone = telefone;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id_clientes + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo
				+ ", telefone=" + telefone + ", bairro=" + bairro + ", logradouro=" + logradouro + ", cidade=" + cidade
				+ ", uf=" + uf + ", cep=" + cep + "]";
	}

	public Integer getId() {
		return id_clientes;
	}
	public void setId(Integer id) {
		this.id_clientes = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
