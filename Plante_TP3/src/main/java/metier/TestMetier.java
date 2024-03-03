package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Plante> plants = metier.getPlantesParMotCle("HP");
for (Plante p : plants)
System.out.println(p.getNomPlante());
}
}