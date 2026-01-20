public class Pig extends Animal{
  int mudLevel;

  public Pig(String name){
    super(name);
    sethp(15);
    setSpeed(8);
    setAttack(2);
    this.mudLevel = 1;
  }

  public Pig(){
    this("Pig");
  }

  public int getMud(){
    return mudLevel;
  }
  
  private void setMud(int n){
    mudLevel = n;
  }

  /*roll*/
  public String moveOne(Animal other){
    int damage = 1;
    damage *= getAttack() * getMud();
    other.applyDamage(damage, this);
    return this + " rolled on " + other + " and dealt " + damage + " points of damage.";
  }

  /*bite*/
  public String moveTwo(Animal other){
      int damage = randomRoll(0, mudLevel);
      damage *= getAttack();
      other.applyDamage(damage, this);
      return this + " bit " + other + " dealing " + damage + " points of damage.";
  }
  
  /*eat*/
  public String moveThree(Animal other){
    sethp(gethp()+3);
    setMud(3);
    return this + " rolls around in mud and gains 3 mud and 3 hp";
  }

  @Override
  public String moveList(){
    return "1. roll / 2. bite / 3.  eat";
  }
}
