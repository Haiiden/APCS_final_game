public class Chicken extends Animal{
  public Chicken(String name){
    super(name);
    sethp(5);
    setSpeed(20);
    setAttack(1);
  }

  public Chicken() {
    this("Chicken");
  }

  /*peck*/
  @Override
  public String moveOne(Animal other){
    int damage = Animal.randomRoll(0,5);
    other.applyDamage(damage * getAttack());
    return this + " pecked " + other + " and dealt " + damage + " points of damage.";
  }


  /*shoot egg*/
  @Override
  public String moveTwo(Animal other){
      int damage = Animal.randomRoll(0,10) + 3;
      other.applyDamage(damage * getAttack());
      if(Math.random() < 0.500){
        return this + " shot an egg at " + other + " dealing " + damage + " points of damage.";
      }else{
        other.applyDamage(2);
        return this + "'s egg broke on " + other + "'s face, dealing " + damage + " and 2 extra points of damage.";
      }
  }
  
  /*eat*/
  @Override
  public String moveThree(Animal opp){
    sethp(gethp() + 5);
    flight();
    return this + " takes flight and restores 5 hp";
  }

}
