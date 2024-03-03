package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
    @Override
    public List<Sport> getProduitsParMotCle(String mc) {
        List<Sport> prods = new ArrayList<>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM sport WHERE NOM_SPORT LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sport p = new Sport();
                p.setIdSport(rs.getLong("ID_SPORT"));
                p.setNomSport(rs.getString("NOM_SPORT"));
                p.setDescription(rs.getString("DESCRIPTION"));
                p.setDateFondation(rs.getString("DATE_FONDATION"));
                prods.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prods;
    }

    @Override
    public void addProduit(Sport p) {
        // TODO Auto-generated method stub
    }
}
