package gdp.cmc.bus;

import gdp.cmc.dao.TeamDao;
import gdp.cmc.model.Team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamBus {
  public boolean insert(Team team) throws ClassNotFoundException, SQLException {
    TeamDao teamDao = new TeamDao();
    return teamDao.insert(team);
  }
  
  public boolean edit(Team team) throws ClassNotFoundException, SQLException {
    TeamDao teamDao = new TeamDao();
    return teamDao.edit(team);
  }
  
  public boolean delete(int id) throws ClassNotFoundException, SQLException {
    TeamDao teamDao = new TeamDao();
    return teamDao.delete(id);
  }
  /**
   * 
   * @return
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException
   * .
   */
  
  public List<Team> getAllTeam() throws ClassNotFoundException, SQLException {
    TeamDao teamDao = new TeamDao();
    String sql = "select * from Team";
    List<Team> list = new ArrayList<Team>();
    list = teamDao.getAllTeam(sql);
    return list;
  }
}
