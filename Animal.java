public abstract class Animal{
  private String name;
  private int hp;
  private int speed;
  private int attack;
  private boolean inFlight;


  public Animal(String name){
    this.name = name;
    this.inFlight = false;
  }

  public Animal(String name, int hp, int speed, int attack){
    this.name = name;
    this.hp = hp;
    this.speed = speed;
    this.attack = attack;
  }

  public String toString(){
    return this.name + "[" + this.hp + "]";
  }

  public int gethp(){
    return hp;
  }
  public void sethp(int newHP){
    this.hp = newHP;
  }

  public double getSpeed(){
    return speed;
  }
  public void setSpeed(int newSpeed){
    this.speed = newSpeed;
  }

  public int getAttack(){
    return attack;
  }
  public void setAttack(int newAttack){
    this.attack = newAttack;
  }

  public void flight(){
    this.inFlight = true;
  }
  public void applyDamage(int amount){
    if (inFlight == true) {
      System.out.println("Unsuccessful attack, opponent is in flight");
      this.inFlight = false;
    }
    else {
      this.hp -= amount;
    }
  }

  public static int randomRoll(int min, int max){
    return (int)(Math.random() * (max - min + 1) );
  }


  public abstract String moveOne(Animal other);
  public abstract String moveTwo(Animal other);
  public abstract String moveThree(Animal other);
}
