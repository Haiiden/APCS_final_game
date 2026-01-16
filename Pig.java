public class Pig extends Animal{
  int mudLevel;

  /*the other constructors ultimately call the constructor
    with all parameters.*/
  public Pig(String name, int hp){
    super(name,hp);
    mudLevel = 1;
  }

  public Pig(String name){
    this(name,15);
  }

  public Pig(){
    this("Pig");
  }
  
  public String getSpecialName(){
    return "Mud Level";
  }

  public int getSpecial(){
    return mudLevel;
  }
  
  public void setSpecial(int n){
    mudLevel = n;
  }

  /*Deal 2-7 damage to opponent, increases mud level*/
  public String moveOne(Animal other){
    int damage = (int)(Math.random()*6)+2;
    other.applyDamage(damage + (damage * mudLevel * 0.2));
    int prevMud = this.mudLevel;
    this.setSpecial(prevMud + 1);
    return this + " the Pig rolled on "+ other + " and dealt "+ damage +
    " points of damage.";
  }
  /*Deal 3-12 damage to opponent
  */
  public String moveTwo(Animal other){
      setSpecial(getSpecial()-8);
      int damage = (int)(Math.random()*5+Math.random()*5)+3;
      other.applyDamage(damage + (damage * mudLevel * 0.2);
      int prevMud = this.mudLevel;
      this.setSpecial(prevMud + 1);
      return this + " bit "+other+" dealing "+ damage +" points of damage.";
  }
  
  /*Restores 6 special and 1 hp to self.*/
  public String moveThree(){
    int hp = 5;
    setHP(getHP()+hp);
    return this+" eats to restore "+ hp +" but mud level reset";
  }
}
