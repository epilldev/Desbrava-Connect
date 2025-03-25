package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.FuncaoDesbravador;

@Entity
@Table(name = "desbravador")
public class Desbravador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "pessoa_id", nullable = false, unique = true)
    private Pessoa pessoa;
    
    @ManyToOne
    @JoinColumn(name = "unidade_id", nullable = false)
    private Unidade unidade;
    
    @ManyToMany
    @JoinTable(
        name = "desbravador_classe", // Tabela intermediária
        joinColumns = @JoinColumn(name = "desbravador_id"), // Referência para a tabela Desbravador
        inverseJoinColumns = @JoinColumn(name = "classe_id") // Referência para a tabela Classe
    )
    private List<ClasseDesbravador> classes;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "funcao", nullable = false)
    private FuncaoDesbravador funcao;

    @ManyToMany
    @JoinTable(
        name = "desbravador_especialidade",
        joinColumns = @JoinColumn(name = "desbravador_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidade_id")
    )
    private List<Especialidade> especialidades = new ArrayList<>();

    
    @Column(name = "data_ingresso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataIngresso;
    
    // Construtores
    public Desbravador() {}
    
    public Desbravador(Pessoa pessoa, Unidade unidade, String classeAtual, Date dataIngresso) {
        this.pessoa = pessoa;
        this.unidade = unidade;
        this.classeAtual = classeAtual;
        this.dataIngresso = dataIngresso;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String getClasseAtual() {
        return classeAtual;
    }

    public void setClasseAtual(String classeAtual) {
        this.classeAtual = classeAtual;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    } 

}

