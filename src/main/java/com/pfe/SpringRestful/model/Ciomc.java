package com.pfe.SpringRestful.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciomc")
public class Ciomc implements Serializable{
      
	private static final long serialVersionUID= 1L;
	@Id
	private int id;
	private String etab_declarant;
	private String date_nego;
	private String date_valeur;
	private String date_echeance;
	private String preteur;
	private String emprunteur;
	private double montant_neg;
	private double taux;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtab_declarant() {
		return etab_declarant;
	}
	public void setEtab_declarant(String etab_declarant) {
		this.etab_declarant = etab_declarant;
	}
	public String getDate_nego() {
		return date_nego;
	}
	public void setDate_nego(String date_nego) {
		this.date_nego = date_nego;
	}
	public String getDate_valeur() {
		return date_valeur;
	}
	public void setDate_valeur(String date_valeur) {
		this.date_valeur = date_valeur;
	}
	public String getDate_echeance() {
		return date_echeance;
	}
	public void setDate_echeance(String date_echeance) {
		this.date_echeance = date_echeance;
	}
	public String getPreteur() {
		return preteur;
	}
	public void setPreteur(String preteur) {
		this.preteur = preteur;
	}
	public String getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(String emprunteur) {
		this.emprunteur = emprunteur;
	}
	public double getMontant_neg() {
		return montant_neg;
	}
	public void setMontant_neg(double montant_neg) {
		this.montant_neg = montant_neg;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
	
}

