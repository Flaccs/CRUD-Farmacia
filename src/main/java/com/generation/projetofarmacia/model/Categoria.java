package com.generation.projetofarmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(unique = true)
    @NotBlank(message = "O nome é um campo obrigatório")
    @Size(min = 2, max = 100, message = "O campo nome deve conter entre 2 e 100 caracteres")
    private String nome;

    @Size(max = 1000, message = "O campo descriçao deve conter no máximo 1000 caracteres")
    private String descricao;
    
    @Size(max = 1000, message = "O campo tipo deve conter no máximo 1000 caracteres")
    private String tipo;

    @Size(max = 1000, message = "O campo descriçao deve conter no máximo 1000 caracteres")
    private String manipulados;
    
    @Size(max = 1000, message = "O campo descriçao deve conter no máximo 1000 caracteres")
    private String genericos;
    
    @Size(max = 1000, message = "O campo descriçao deve conter no máximo 1000 caracteres")
    private String higiene;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getManipulados() {
		return manipulados;
	}

	public void setManipulados(String manipulados) {
		this.manipulados = manipulados;
	}

	public String getGenericos() {
		return genericos;
	}

	public void setGenericos(String genericos) {
		this.genericos = genericos;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}
    
    
}
