package metier.entities;

public class Stage {
	int id;
	int idEtudiant;
	String description;
	String dateDebut;
	int periode;
	public Stage() {
		super();
	}
	
	public Stage(int idEtudiant, String description, String dateDebut, int periode) {
		super();
		this.idEtudiant = idEtudiant;
		this.description = description;
		this.dateDebut = dateDebut;
		this.periode = periode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getPeriode() {
		return periode;
	}
	public void setPeriode(int periode) {
		this.periode = periode;
	}

	@Override
	public String toString() {
		return "Stage [id=" + id + ", idEtudiant=" + idEtudiant + ", description=" + description + ", dateDebut="
				+ dateDebut + ", periode=" + periode + "]";
	}
	
	
	
}
