package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Plante;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private ImetierCatalogue metier;
@Override
public void init() throws ServletException {
metier=new MetierImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {String mc=request.getParameter("motCle");
PlanteModele mod = new PlanteModele();
mod.setMotCle(mc);
List<Plante> plants = metier.getPlantesParMotCle(mc);
mod.setPlantes(plants);
request.setAttribute("modele", mod);
request.getRequestDispatcher("PlantesView.jsp").forward(request,response);
}
}