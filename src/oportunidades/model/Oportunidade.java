package oportunidades.model;

public class Oportunidade {
	
	private int id;
	private String nome;
	private float remuneracao;
	private int carga_horaria;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getRemuneracao() {
		return remuneracao;
	}
	public void setRemuneracao(float remuneracao) {
		this.remuneracao = remuneracao;
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
