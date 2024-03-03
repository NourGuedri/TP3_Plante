package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Plante> getPlantesParMotCle(String mc) {
List<Plante> plants= new ArrayList<Plante>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from PLANTES where NOM_PLANTE LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Plante p = new Plante();
p.setIdPlante(rs.getLong("ID_PLANTE"));
p.setNomPlante(rs.getString("NOM_PLANTE"));
p.setCouleur(rs.getString("COULEUR"));
plants.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return plants;
}
@Override
public void addPlante(Plante p) {
// TODO Auto-generated method stub
}
}