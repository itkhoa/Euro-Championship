package gdp.cmc.dao;

import gdp.cmc.model.Team;
import gdp.cmc.utility.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TeamDao {
  /**
   * 
   * @param team
   * 
   * @return
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException
   * .
   */
  public boolean insert(Team team) throws ClassNotFoundException, SQLException {
    Connection connect = ConnectDb.connect();
    String sql = "Insert into Team values(?,?,?)";
    PreparedStatement prepare = connect.prepareStatement(sql);
    connect.setAutoCommit(false);
    prepare.setString(1, team.getName());
    prepare.setString(2, team.getCoach());
    prepare.setString(3, team.getNational());
    connect.setAutoCommit(true);
    try {
      prepare.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
  /**
   * 
   * @param team
   * 
   * @return
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException
   * .
   */
  
  public boolean edit(Team team) throws ClassNotFoundException, SQLException {
    Connection connect = ConnectDb.connect();
    String sql = "Update Team set Name=?,Coach=?,National=? where id=?";
    PreparedStatement prepare = connect.prepareStatement(sql);
    connect.setAutoCommit(false);
    prepare.setString(1, team.getName());
    prepare.setString(2, team.getCoach());
    prepare.setString(3, team.getNational());
    prepare.setInt(4, team.getId());
    connect.setAutoCommit(true);
    try {
      prepare.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
  /**
   * 
   * @param id
   * 
   * @return
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException
   * .
   */
  
  public boolean delete(int id) throws ClassNotFoundException, SQLException {
    Connection connect = ConnectDb.connect();
    String sql = "delete from Team where ID = ?";
    PreparedStatement prepare = connect.prepareStatement(sql);
    connect.setAutoCommit(false);
    prepare.setInt(1, id);
    connect.setAutoCommit(true);
    try {
      prepare.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
  /**
   * 
   * @param sql
   * 
   * @return
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException
   * .
   */
  
  public List<Team> getAllTeam(String sql) throws ClassNotFoundException, SQLException {
    Connection connect = ConnectDb.connect();
    List<Team> list = new ArrayList<Team>();
    Statement statement = connect.createStatement();
    try {
      ResultSet rs = statement.executeQuery(sql);
      while (rs.next()) {
        Team team = new Team();
        team.setId(rs.getInt(1));
        team.setName(rs.getString(2));
        team.setCoach(rs.getString(3));
        team.setNational(rs.getString(4));
        list.add(team);
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      connect.close();
    }
    return list;
  }
}
