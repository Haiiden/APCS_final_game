public class Chicken extends Animal{
  public Chicken (name){
    super(name);
    sethp(5);
    setSpeed(20);
    setAttack(1.1);
  }

  public Chicken() {
    this("Chicken");
  ]

  /*peck*/
  public String moveOne(Animal other){
    int damage = (int)(Math.random()*6)+2;
    other.applyDamage((damage * this.attack);
    return this + " pecked "+ other + " and dealt "+ damage +
    " points of damage.";
  }
  /*shoot egg
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
