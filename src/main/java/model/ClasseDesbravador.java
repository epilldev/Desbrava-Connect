package model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class ClasseDesbravador {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "desbravador_id", nullable = false)
	    private Desbravador desbravador;

	    @ManyToOne
	    @JoinColumn(name = "classe_desbravador_id", nullable = false)
	    private ClasseDesbravador classeDesbravador;

	    @Column(name = "data_atribuicao", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date dataAtribuicao; // Data em que o cargo foi atribuído

	    // Construtores
	    public ClasseDesbravador() {}

	    public ClasseDesbravador(Desbravador desbravador, ClasseDesbravador classeDesbravador, Date dataAtribuicao) {
	        this.desbravador = desbravador;
	        this.classeDesbravador = classeDesbravador;
	        this.dataAtribuicao = dataAtribuicao;
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

	    public ClasseDesbravador getClasseDesbravador() {
	        return classeDesbravador;
	    }

	    public void setClasseDesbravador(ClasseDesbravador classeDesbravador) {
	        this.classeDesbravador = classeDesbravador;
	    }

	    public Date getDataAtribuicao() {
	        return dataAtribuicao;
	    }

	    public void setDataAtribuicao(Date dataAtribuicao) {
	        this.dataAtribuicao = dataAtribuicao;
	    }
}
