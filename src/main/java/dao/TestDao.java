package dao;

import java.util.List;

import metier.entities.Etudiant;
import metier.entities.Stage;

public class TestDao {

	public static void main(String[] args) {
	/*	
		// Insert Test
		EtudiantDaoImp edao= new EtudiantDaoImp();
		Etudiant et= edao.save(new Etudiant("ali","mustapha","departement"));
		System.out.println(et);
		//Get List Test
		List<Etudiant> ets = edao.etudiantsdpt("electronique");
		for (Etudiant e : ets) {
			System.out.println(e);
		}
		*/
		
		//Insert Stage Test
		StageDaoImp sdao = new StageDaoImp();
		Stage st = sdao.save(new Stage(5,"a","a",300));
		System.out.print(st);
		//Get Stage List Test
		List<Stage> stgs = sdao.Stages();
		for(Stage s : stgs) {
			System.out.println(s);
		}
	}

}
