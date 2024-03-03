package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Plante> getPlantesParMotCle(String mc);
public void addPlante(Plante p);
}