package web;

import java.util.ArrayList;
import java.util.List;

import metier.Sport;

public class ProduitModele {
	private String motCle;
	List<Sport> produits = new ArrayList<>();
	public String getMotCle() {
	return motCle;
	}
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	public List<Sport> getProduits() {
	return produits;
	}
	public void setProduits(List<Sport> produits) {
	this.produits = produits;
	}

}
