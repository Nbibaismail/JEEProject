package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.SingletonConnection;
import metier.entities.Stage;

public class StageDaoImp implements IStageDao{


	@Override
	public Stage save(Stage s) {
		Connection con =SingletonConnection.getConnection();
		try {
			// SQL Query here
			PreparedStatement ps = con.prepareStatement("INSERT INTO Stage (idEtudiant,description,dateDebut,periode) VALUES (?,?,?,?) ");
			ps.setInt(1, s.getIdEtudiant());
			ps.setString(2, s.getDescription());
			ps.setString(3, s.getDateDebut());
			ps.setInt(4, s.getPeriode());
			ps.executeUpdate();
			
		}catch(SQLException x) {
			x.printStackTrace();
			
		}
		
		return s;
	}

	@Override
	public List<Stage> Stages() {
		List<Stage> Stages=new ArrayList<Stage>();
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from stage");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Stage s = new Stage();
				s.setId(rs.getInt(("id")));
				s.setIdEtudiant(rs.getInt("idEtudiant"));
				s.setDescription(rs.getString("description"));
				s.setDateDebut(rs.getString("dateDebut"));
				s.setPeriode(rs.getInt("periode"));

				Stages.add(s);}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
		return Stages;
	}

	@Override
	public List<Stage> stageIds(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stage getEtudiant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stage updateEtudiant(Stage s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEtudiant(int id) {
		// TODO Auto-generated method stub
		
	}

}
