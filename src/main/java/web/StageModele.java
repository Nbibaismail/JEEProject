package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Stage;

public class StageModele {
	private int id;
	List<Stage> ets = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Stage> getEts() {
		return ets;
	}
	public void setEts(List<Stage> ets) {
		this.ets = ets;
	}
	

}
