package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false)
	private String codigo; // Um código único para a classe

	@Column(nullable = true)
	private String descricao; // Descrição sobre a função ou cargo

	// Construtores
	public Classe() {}

	public Classe(String nome, String codigo, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
    }

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
