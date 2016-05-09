/**
 * Created by Zaara Tasnim Rifat on 5/9/2016.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String enemyShipType ) {
        EnemyShip newShip = null;

        if (enemyShipType.equals("U"))
        {
            return new UFOEnemyShip();
        }
        else if(enemyShipType.equals("R"))
        {
            return new RocketEnemyShip();
        }
        else if(enemyShipType.equals("B"))
        {
            return new BigUFOEnemyShip();
        }

        return null;
    }

}
