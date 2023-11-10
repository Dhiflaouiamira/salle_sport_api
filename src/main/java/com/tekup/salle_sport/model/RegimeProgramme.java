package com.tekup.salle_sport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegimeProgramme {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private String nom;

@Column
private String description;

@Column
private String type;

@Column(name = "duree_en_jours")
private int dureeEnJours;

@Column
private double prix;

@Column(nullable = false)
private boolean actif;

@Column
private String objectif;

@Column
private String niveau;

@Column(name = "image_url")
private String imageUrl;

@Column
private String details;

public RegimeProgramme(Long id, String nom, String description, String type, int dureeEnJours, double prix,
		boolean actif, String objectif, String niveau, String imageUrl, String details) {
	super();
	this.id = id;
	this.nom = nom;
	this.description = description;
	this.type = type;
	this.dureeEnJours = dureeEnJours;
	this.prix = prix;
	this.actif = actif;
	this.objectif = objectif;
	this.niveau = niveau;
	this.imageUrl = imageUrl;
	this.details = details;
}

public RegimeProgramme() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getDureeEnJours() {
	return dureeEnJours;
}

public void setDureeEnJours(int dureeEnJours) {
	this.dureeEnJours = dureeEnJours;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public boolean isActif() {
	return actif;
}

public void setActif(boolean actif) {
	this.actif = actif;
}

public String getObjectif() {
	return objectif;
}

public void setObjectif(String objectif) {
	this.objectif = objectif;
}

public String getNiveau() {
	return niveau;
}

public void setNiveau(String niveau) {
	this.niveau = niveau;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}





}