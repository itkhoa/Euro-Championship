package gdp.cmc.action;

import gdp.cmc.bus.TeamBus;
import gdp.cmc.model.Team;

import java.sql.SQLException;
import java.util.List;

public class TeamAction {
  private Team team;
  private List<Team> list;
  private int teamId;
  
  public Team getTeam() {
    return team;
  }
  
  public void setTeam(Team team) {
    this.team = team;
  }

  public List<Team> getList() {
    return list;
  }

  public void setList(List<Team> list) {
    this.list = list;
  }
  
  
  public int getTeamId() {
    return teamId;
  }

  public void setTeamId(int teamId) {
    this.teamId = teamId;
  }

  /**
   * 
   * @return
   * String.
   */
  
  public String execute() {
    TeamBus teamBus = new TeamBus();
    try {
      list = teamBus.getAllTeam();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return "ereor";
    }
    return "success";
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
  
  public String insert() throws ClassNotFoundException, SQLException {
    System.out.println(team.getName());
    TeamBus teamBus = new TeamBus();
    if (teamBus.insert(team)) {
      return "success";
    } else {
      return "error";
    }
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
  
  public String delete() throws ClassNotFoundException, SQLException {
    System.out.println(team.getName());
    TeamBus teamBus = new TeamBus();
    if (teamBus.delete(teamId)) {
      return "success";
    } else {
      return "error";
    }
  }
}
