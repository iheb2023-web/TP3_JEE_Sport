package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Sport> getProduitsParMotCle(String mc); 
	public void addProduit(Sport p);

}
