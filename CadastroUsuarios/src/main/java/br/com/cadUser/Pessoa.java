package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa {
	private String nome;
	private List<String> nomes = new ArrayList<>();

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	// Método para cadastrar nome
	public void cadastrar() {
		if (nome != null && !nome.trim().isEmpty()) {
			nomes.add(nome);
			nome = "";
		}
	}
}