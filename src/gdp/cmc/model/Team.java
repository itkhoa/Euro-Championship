package gdp.cmc.model;

public class Team {
  private int id;
  private String name;
  private String coach;
  private String national;
  
  public Team() {
    super();
  }
  /**
   * 
   * @param id
   * 
   * @param name
   * 
   * @param coach
   * 
   * @param national
   * .
   */
  
  public Team(int id, String name, String coach, String national) {
    super();
    this.id = id;
    this.name = name;
    this.coach = coach;
    this.national = national;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getCoach() {
    return coach;
  }
  
  public void setCoach(String coach) {
    this.coach = coach;
  }
  
  public String getNational() {
    return national;
  }
  
  public void setNational(String national) {
    this.national = national;
  }
  
  
}
