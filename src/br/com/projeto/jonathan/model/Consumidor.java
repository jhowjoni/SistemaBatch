package br.com.projeto.jonathan.model;

public class Consumidor {

	private int idConsumidor;
	private String cpfCnpj;
	private String nome;
	private boolean status;
	private double valorTotal;
	
	public int getIdConsumidor() {
		return idConsumidor;
	}
	public void setIdConsumidor(int idConsumidor) {
		this.idConsumidor = idConsumidor;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
