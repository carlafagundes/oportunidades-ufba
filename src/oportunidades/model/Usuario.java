package oportunidades.model;

import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String nome;
	private String senha;
	private String matricula;
	private ArrayList<Contato> contato;
	private String descricao_perfil;
	
	public String getDescricao_perfil() {
		return descricao_perfil;
	}
	public void setDescricao_perfil(String descricao_perfil) {
		this.descricao_perfil = descricao_perfil;
	}
	public ArrayList<Contato> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
