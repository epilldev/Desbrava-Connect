package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false)
    private Integer idade;
    
    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    
    @ManyToOne
    @JoinColumn(name = "pai_id")
    private Pessoa pai;
    
    @ManyToOne
    @JoinColumn(name = "mae_id")
    private Pessoa mae;
    
    // Construtor
    public Pessoa() {}
    
    public Pessoa(String nome, Integer idade, Date dataNascimento, String cpf, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.pai = pai;
        this.mae = mae;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
}

