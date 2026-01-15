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
  public String roll(Animal other){
    int damage = (int)(Math.random()*6)+2;
    other.applyDamage(damage * this.mudLevel);
    int prevMud = this.mudLevel;
    this.setSpecial(prevMud + 1);
    return this + " the Pig attacked "+ other + " and dealt "+ damage +
    " points of damage. Their mud level increased.";
  }
  /*Deal 3-12 damage to opponent, only if caffeine is high enough.
    Reduces caffeine by 8.
  */
  public String specialAttack(Adventurer other){
    if(getSpecial() >= 8){
      setSpecial(getSpecial()-8);
      int damage = (int)(Math.random()*5+Math.random()*5)+3;
      other.applyDamage(damage);
      return this + " used their "+preferredLanguage+
      " skills to hack the matrix. "+
      " This glitched out "+other+" dealing "+ damage +" points of damage.";
    }else{
      return "Not enough caffeine to use the ultimate code. Instead "+attack(other);
    }
  }

  /*Restores 5 special to other*/
  public String support(Adventurer other){
    return "Gives a coffee to "+other+" and restores " 
    +other.restoreSpecial(5)+" "+other.getSpecialName();
  }
  /*Restores 6 special and 1 hp to self.*/
  public String support(){
    int hp = 1;
    setHP(getHP()+hp);
    return this+" drinks a coffee to restores "+restoreSpecial(6)+" "
    + getSpecialName()+ " and "+hp+" HP";
  }
}
