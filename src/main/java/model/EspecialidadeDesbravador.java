package model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "desbravador_especialidade")
public class EspecialidadeDesbravador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "desbravador_id", nullable = false)
    private Desbravador desbravador;

    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @Column(nullable = false, length = 20)
    private String status; // Exemplo: "Em andamento", "Concluído", "Cancelado"

    @Temporal(TemporalType.DATE)
    private Date dataConclusao; // Pode ser nula caso a especialidade ainda esteja em andamento

    // Construtores
    public EspecialidadeDesbravador() {}

    public EspecialidadeDesbravador(Desbravador desbravador, Especialidade especialidade, String status, Date dataConclusao) {
        this.desbravador = desbravador;
        this.especialidade = especialidade;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Desbravador getDesbravador() {
        return desbravador;
    }

    public void setDesbravador(Desbravador desbravador) {
        this.desbravador = desbravador;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}