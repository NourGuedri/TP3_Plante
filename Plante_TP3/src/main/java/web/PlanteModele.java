package web;
import java.util.ArrayList;
import java.util.List;

import metier.Plante;
public class PlanteModele {
private String motCle;
List<Plante> plants = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Plante> getPlantes() {
return plants;
}
public void setPlantes(List<Plante> plants) {
this.plants = plants;
}

}