package dao;

import java.util.List;

import metier.entities.Stage;



public interface IStageDao {
	public Stage save(Stage s);
	public List<Stage> Stages();
	public List<Stage> stageIds(int Id);
	public Stage getEtudiant(int id);
	public Stage updateEtudiant(Stage s);
	public void deleteEtudiant(int id);
}
