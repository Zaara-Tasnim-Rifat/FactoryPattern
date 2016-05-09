/**
 * Created by Zaara Tasnim Rifat on 5/9/2016.
 */
public abstract class EnemyShip {
    private  String name;
    private double amtdamage;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public double getDamage(){
        return amtdamage;
    }
    public void setDamage(double newDamage){
        amtdamage = newDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does "+ getDamage());
    }

}
