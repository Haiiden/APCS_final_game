public class Pig extends Animal{
  int mudLevel;

  public Pig(String name){
    super(name);
    sethp(15);
    setSpeed(5);
    setAttack(1.2);
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
    int damage = (int)(Math.random()*6)+2;
    other.applyDamage((damage + (damage * mudLevel * 0.2)) * this.attack);
    int prevMud = this.mudLevel;
    this.setSpecial(prevMud + 1);
    return this + " the Pig rolled on "+ other + " and dealt "+ damage +
    " points of damage.";
  }
  /*bite
  */
  public String moveTwo(Animal other){
      int damage = (int)(Math.random()*5+Math.random()*5)+3;
      other.applyDamage((damage + (damage * mudLevel * 0.2)) * this.attack);
      int prevMud = this.mudLevel;
      this.setSpecial(prevMud + 1);
      return this + " bit "+other+" dealing "+ damage +" points of damage.";
  }
  
  /*eat*/
  public String moveThree(){
    int hp = 5;
    sethp(gethp()+hp);
    return this+" eats to restore "+ hp +" but mud level reset";
  }
}
