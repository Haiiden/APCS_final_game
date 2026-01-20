public class Chicken extends Animal{
  public Chicken(String name){
    super(name);
    sethp(5);
    setSpeed(10);
    setAttack(1);
  }

  public Chicken() {
    this("Chicken");
  }

  /*peck*/
  @Override
  public String moveOne(Animal other){
    int damage = randomRoll(0,5);
    damage *= getAttack();
    other.applyDamage(damage, this);
    return this + " pecked " + other + " and dealt " + damage + " points of damage.";
  }


  /*shoot egg*/
  @Override
  public String moveTwo(Animal other){
      int damage = randomRoll(0,10) + 3;
      damage *= getAttack();
      other.applyDamage(damage, this);


      if(Math.random() < 0.500){
        return this + " shot an egg at " + other + " dealing " + damage + " points of damage.";
      }else{
        other.applyDamage(2, this);
        return this + "'s egg broke on " + other + "'s face, dealing " + damage + " and 2 extra points of damage.";
      }
  }
  
  /*eat*/
  @Override
  public String moveThree(Animal opp){
    sethp(gethp() + 5);
    setflight(true);
    return this + " takes flight and restores 5 hp";
  }

  @Override
  public String moveList(){
    return "1. peck / 2. egg / 3. eat";
  }

}
