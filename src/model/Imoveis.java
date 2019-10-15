package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Imoveis implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_imoveis")
	private Integer id_imoveis;
	
	private String nome;
	private String rua;
	private String cidade;
	private String uf;
	private String cep;
	private Double preço;
	private String comodos;
	
	public Imoveis() {
		super();
	}
	
	public Imoveis(Integer id_imoveis, String nome, String rua, String cidade, String uf, String cep, Double preço, String comodos) {
		super();
		this.id_imoveis = id_imoveis;
		this.nome = nome;
		this.rua = rua;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.preço = preço;
		this.comodos = comodos;
	}

	@Override
	public String toString() {
		return "Imoveis [id_imoveis=" + id_imoveis + ", nome=" + nome + ", rua=" + rua + ", cidade=" + cidade + ", uf="
				+ uf + ", cep=" + cep + ", preço=" + preço + ", comodos=" + comodos + "]";
	}
	
	public Integer getId_imoveis() {
		return id_imoveis;
	}

	public void setId_imoveis(Integer id_imoveis) {
		this.id_imoveis = id_imoveis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
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
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	public String getComodos() {
		return comodos;
	}
	public void setComodos(String comodos) {
		this.comodos = comodos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
