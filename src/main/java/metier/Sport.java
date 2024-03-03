package metier;
import java.io.Serializable;

public class Sport implements Serializable {
    private Long idSport;
    private String nomSport;
    private String description;
    private String dateFondation;
    
    // Default constructor
    public Sport() {
    }
    
    // Parameterized constructor
    public Sport(String nomSport, String description, String dateFondation) {
        this.nomSport = nomSport;
        this.description = description;
        this.dateFondation = dateFondation;
    }
    
    // Getter for idSport
    public Long getIdSport() {
        return idSport;
    }
    
    // Setter for idSport
    public void setIdSport(Long idSport) {
        this.idSport = idSport;
    }
    
    // Getter for nomSport
    public String getNomSport() {
        return nomSport;
    }
    
    // Setter for nomSport
    public void setNomSport(String nomSport) {
        this.nomSport = nomSport;
    }
    
    // Getter for description
    public String getDescription() {
        return description;
    }
    
    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Getter for dateFondation
    public String getDateFondation() {
        return dateFondation;
    }
    
    // Setter for dateFondation
    public void setDateFondation(String dateFondation) {
        this.dateFondation = dateFondation;
    }
}
