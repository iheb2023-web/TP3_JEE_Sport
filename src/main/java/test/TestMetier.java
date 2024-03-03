package test;

import java.util.List;

import metier.MetierImpl;
import metier.Sport;

public class TestMetier {
	public static void main(String[] args) { 
		MetierImpl metier= new MetierImpl(); 
		List<Sport> prods = metier.getProduitsParMotCle("football"); 
		for (Sport p : prods) 
		System.out.println(p.getNomSport()); 

}
}