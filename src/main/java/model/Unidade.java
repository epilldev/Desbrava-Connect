package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "unidade")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @OneToOne
    @JoinColumn(name = "conselheiro_id", nullable = false, unique = true)
    private Desbravador conselheiro;
    
    @OneToOne
    @JoinColumn(name = "conselheiro_associado_id", unique = true)
    private Desbravador conselheiroAssociado;
    
    @OneToMany(mappedBy = "unidade")
    private List<Desbravador> desbravadores;
    
    // Construtores
    public Unidade() {}
    
    public Unidade(String nome, Desbravador conselheiro, Desbravador conselheiroAssociado) {
        this.nome = nome;
        this.conselheiro = conselheiro;
        this.conselheiroAssociado = conselheiroAssociado;
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

    public Desbravador getConselheiro() {
        return conselheiro;
    }

    public void setConselheiro(Desbravador conselheiro) {
        this.conselheiro = conselheiro;
    }

    public Desbravador getConselheiroAssociado() {
        return conselheiroAssociado;
    }

    public void setConselheiroAssociado(Desbravador conselheiroAssociado) {
        this.conselheiroAssociado = conselheiroAssociado;
    }

    public List<Desbravador> getDesbravadores() {
        return desbravadores;
    }

    public void setDesbravadores(List<Desbravador> desbravadores) {
        this.desbravadores = desbravadores;
    }
}

