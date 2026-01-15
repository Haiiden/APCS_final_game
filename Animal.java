public abstract class Animal{
  private String name;
  private int hp;
  private int speed;
  private int attack;

  public Animal(String name){
    this.name = name;
  }

  public Adventurer(String name, int hp, int speed, int attack){
    this.name = name;
    this.hp = hp;
    this.speed = speed;
    this.attack = attack;
  }

  public String toString(){
    return this.name + this.hp;
  }

  public int gethp(){
    return hp;
  }
  public void sethp(int newHP){
    this.hp = newHP;
  }

  public abstract String moveOne(Animal opp);
  public abstract String moveTwo(Animal opp);
  public abstract String moveThree(Animal opp);


}
