package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String cpf;
	private String comida;
	
	public JavaBeans() {
		super();
		
		
	}
	public JavaBeans(String idcon, String nome, String cpf, String comida) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.cpf = cpf;
		this.comida = comida;
	}
	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
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
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
}
