package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.EtudiantDaoImp;
import dao.IEtudiantDao;
import dao.IStageDao;
import dao.StageDaoImp;
import metier.entities.Etudiant;
import metier.entities.Stage;
@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControllerServlet extends HttpServlet {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IEtudiantDao metier;
	IStageDao metier2;
	 @Override
	public void init() throws ServletException {
		metier = new EtudiantDaoImp();
		metier2 = new StageDaoImp();
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			             HttpServletResponse response) 
			            throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/index.do"))
		{
			request.getRequestDispatcher("etudiants.jsp").forward(request,response);
		}
		else if (path.equals("/chercher.do"))
		{
			String rechercheDpt=request.getParameter("motCle").trim();
			EtudiantModele model= new EtudiantModele();
			model.setRechercheDpt(rechercheDpt);
			List<Etudiant> students = metier.etudiantsdpt(rechercheDpt);
			//TO-DO Find bug
			model.setEts(students);
			request.setAttribute("model", model);
			request.getRequestDispatcher("etudiants.jsp").forward(request,response);
		}
		
		else if (path.equals("/saisie.do")  )
		{
			request.getRequestDispatcher("saisieEtudiant.jsp").forward(request,response);
		}
		else if (path.equals("/save.do")  && request.getMethod().equals("POST"))
		{	String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String departement=request.getParameter("departement");
			Etudiant p = metier.save(new Etudiant(nom,prenom,departement));
			request.setAttribute("etudiant",p);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
			
			
		
			
		}
		
		else if (path.equals("/supprimer.do"))
		{
		    int id= Integer.parseInt(request.getParameter("id"));
		    metier.deleteEtudiant(id);
		    response.sendRedirect("chercher.do?motCle=");
					
			//request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		
		else if (path.equals("/editer.do")  )
		{
			int id= Integer.parseInt(request.getParameter("id"));
			Etudiant p = metier.getEtudiant(id);
			System.out.print(p);
			request.setAttribute("p", p);
			request.getRequestDispatcher("editerEtudiant.jsp").forward(request,response);
			
		}
		else if (path.equals("/update.do")  )
		{	int id= Integer.parseInt(request.getParameter("id"));
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String departement=request.getParameter("departement");
			Etudiant p = new Etudiant();
			p.setId(id);
			p.setNom(nom);
			p.setPrenom(prenom);
			p.setDepartement(departement);
			System.out.print("-------------------------------");
			System.out.print(p);
			metier.updateEtudiant(p);
			request.setAttribute("etudiant", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
			
		else if  (path.equals("/index2.do")) {
			request.getRequestDispatcher("stages.jsp").forward(request,response);
		}
		else if (path.equals("/chercher2.do")) {
			String rechercheDpt=request.getParameter("motCle").trim();
			int id = Integer.parseInt(rechercheDpt);
			
			StageModele model2= new StageModele();
			model2.setId(id);
			List<Stage> stages = metier2.stageIds(id);
			//TO-DO Find bug
			model2.setEts(stages);
			//tests
			request.setAttribute("model", model2);
			request.getRequestDispatcher("stages.jsp").forward(request,response);
		}else if (path.equals("/saisie2.do")  )
		{
			request.getRequestDispatcher("saisieStage.jsp").forward(request,response);
		}else if (path.equals("/save2.do")  && request.getMethod().equals("POST")) {
			String description=request.getParameter("description");
			String dateDebut=request.getParameter("dateDebut");
			int IdEtudiant =Integer.parseInt(request.getParameter("idEtudiant"));
			int periode =Integer.parseInt(request.getParameter("periode"));
			Stage s = metier2.save(new Stage(IdEtudiant,description,dateDebut,periode));
			System.out.println(s);
			request.setAttribute("s",s);
			request.getRequestDispatcher("confirmation2.jsp").forward(request, response);
		}
		else if (path.equals("/supprimer2.do"))
		{
		    int id= Integer.parseInt(request.getParameter("id"));
		    metier2.deleteStage(id);
		    response.sendRedirect("chercher.do?motCle="+id);
					
			//request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		
		else if (path.equals("/editer2.do")  )
		{
			int id= Integer.parseInt(request.getParameter("id"));
			Stage s = metier2.getStage(id);
			System.out.print(s);
			request.setAttribute("s", s);
			request.getRequestDispatcher("editerStage.jsp").forward(request,response);
			
		}
		else if (path.equals("/update2.do")  )
		{	
		int id= Integer.parseInt(request.getParameter("id"));
		int idEtudiant= Integer.parseInt(request.getParameter("idEtudiant"));
		String description=request.getParameter("description");
		String dateDebut=request.getParameter("dateDebut");
		int periode= Integer.parseInt(request.getParameter("periode"));
		Stage s = new Stage();
		s.setId(id);
		s.setIdEtudiant(idEtudiant);
		s.setDescription(description);
		s.setDateDebut(dateDebut);
		s.setPeriode(periode);
		
		System.out.print("-------------------------------");
		System.out.print(s);
		metier2.updateStage(s);
		request.setAttribute("s", s);
		request.getRequestDispatcher("confirmation2.jsp").forward(request,response);
	}
		else 
		{	
			response.sendError(Response.SC_NOT_FOUND);		
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}