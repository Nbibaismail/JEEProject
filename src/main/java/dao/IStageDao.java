package dao;

import java.util.List;

import metier.entities.Stage;



public interface IStageDao {
	public Stage save(Stage s);
	public List<Stage> Stages();
	public List<Stage> stageIds(int Id);
	public Stage getStage(int id);
	public Stage updateStage(Stage s);
	public void deleteStage(int id);
}
