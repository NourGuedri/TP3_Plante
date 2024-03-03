package metier;
import java.io.Serializable;
public class Plante implements Serializable{
private Long idPlante;
private String nomPlante;
private String couleur;
public Plante() {
super();
}
public Plante(String nomPlante, String couleur) {
super();
this.nomPlante = nomPlante;
this.couleur = couleur;
}
public Long getIdPlante() {
return idPlante;
}
public void setIdPlante(Long idPlante) {
this.idPlante = idPlante;
}
public String getNomPlante() {
return nomPlante;
}
public void setNomPlante(String nomPlante) {
this.nomPlante = nomPlante;
}
public String getCouleur() {
return couleur;
}
public void setCouleur(String couleur) {
this.couleur = couleur;
}
}