package blackcode7.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Livro {

	public String nome;
	public LocalDate dataCadastro;
	public BigDecimal valorCompra;
	public Livro(String nome, LocalDate dataCadastro, BigDecimal valorCompra) {
		super();
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.valorCompra = valorCompra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public BigDecimal getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
