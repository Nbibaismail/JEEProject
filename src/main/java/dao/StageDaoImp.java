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
		List<Stage> stages=new ArrayList<Stage>();
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from stage where idEtudiant=?");
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Stage s = new Stage();
				s.setId(rs.getInt("stage"));
				s.setIdEtudiant(rs.getInt("idDepartement"));
				s.setDescription(rs.getString("description"));
				s.setDateDebut(rs.getString("dateDebut"));
				s.setPeriode(rs.getInt("periode"));
				
				stages.add(s);
		}
		
		
		
		

	
	}catch(SQLException x) {
		x.printStackTrace();
	}

		return stages;
	}

	@Override
	public Stage getStage(int id) {
		Connection conn=SingletonConnection.getConnection();
		Stage s = new Stage();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from stage where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setIdEtudiant(rs.getInt("idEtudiant"));
				s.setDateDebut(rs.getString("dateDebut"));
				s.setDescription(rs.getString("description"));
				s.setPeriode(rs.getInt("periode"));
			}
		}catch(SQLException x) {
			x.printStackTrace();
		}
		
		
		
		//return 
		return s;

	}

	@Override
	public Stage updateStage(Stage s) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE stage SET idEtudiant=?, description=?, dateDebut=?, periode=? WHERE id=?");
			ps.setInt(1,s.getIdEtudiant());
			ps.setString(2, s.getDescription());
			ps.setString(3, s.getDateDebut());
			ps.setInt(4, s.getPeriode());
			ps.setInt(5, s.getId());
			ps.executeUpdate();
			ps.close();
		} catch(SQLException x) {
			x.printStackTrace();
		}
		return s;
	}

	@Override
	public void deleteStage(int id) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM STAGE WHERE ID=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
