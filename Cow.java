import java.util.Random;

public class Cow extends Animal{
    public Cow(String name){
        super(name);
        sethp(20);
        setSpeed(5);
        setAttack(2);
    }
    public Cow(){
        this("Cow");
    }


    //fart
    @Override
    public String moveOne(Animal other){
        int damage = (15 - other.getSpeed());
        other.applyDamage(damage, other);
        return this + " stinked up the field, dealing " + damage + " damage to " + other;
    }

    //horn
    @Override
    public String moveTwo(Animal other){
        int damage = (getSpeed() * randomRoll(2, getSpeed()));
        damage *= getAttack();
        other.applyDamage(damage, this);
        return this + " rammed into " + other + " with their horns dealing " + damage + " damage.";
    }

    //moo
    @Override
    public String moveThree(Animal other){
        sethp(gethp() + 2);
        return this + " moo'd and ate some grass. gained 2 hp";
    }

    @Override
    public String moveList(){
      return "1. fart / 2. horn / 3. moo";
    }
}