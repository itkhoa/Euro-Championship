package gdp.cmc.action;

import gdp.cmc.bus.TeamBus;
import gdp.cmc.model.Team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupAction {
  private List<Team> list;
  
  public List<Team> getList() {
    return list;
  }

  public void setList(List<Team> list) {
    this.list = list;
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
  
  public String execute() throws ClassNotFoundException, SQLException {
    TeamBus teamBus = new TeamBus();
    list = teamBus.getAllTeam();
    return "success";
  }
}
