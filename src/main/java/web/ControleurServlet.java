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
import metier.Sport;

@WebServlet(name = "ControleurServlet", urlPatterns = { "/controleur" })
public class ControleurServlet extends HttpServlet {
    private ImetierCatalogue metier;

    @Override
    public void init() throws ServletException {
        metier = new MetierImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String motCle = request.getParameter("motCle");
        ProduitModele modele = new ProduitModele();
        modele.setMotCle(motCle);
        List<Sport> produits = metier.getProduitsParMotCle(motCle);
        modele.setProduits(produits);
        request.setAttribute("modele", modele);
        request.getRequestDispatcher("SportView.jsp").forward(request, response);
    }
}
