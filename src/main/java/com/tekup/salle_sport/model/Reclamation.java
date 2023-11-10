package com.tekup.salle_sport.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reclamation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reclamation_id")
    private Long id;

    @Column(name = "date_reclamation")
    private Date dateReclamation;

    @Column(name = "reclamation_type")
    private String typeReclamation;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "status")
    private String statut;

	public Reclamation(Long id, Date dateReclamation, String typeReclamation, String description, String statut) {
		super();
		this.id = id;
		this.dateReclamation = dateReclamation;
		this.typeReclamation = typeReclamation;
		this.description = description;
		this.statut = statut;
	}

	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateReclamation() {
		return dateReclamation;
	}

	public void setDateReclamation(Date dateReclamation) {
		this.dateReclamation = dateReclamation;
	}

	public String getTypeReclamation() {
		return typeReclamation;
	}

	public void setTypeReclamation(String typeReclamation) {
		this.typeReclamation = typeReclamation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", dateReclamation=" + dateReclamation + ", typeReclamation=" + typeReclamation
				+ ", description=" + description + ", statut=" + statut + "]";
	}
    
    
}