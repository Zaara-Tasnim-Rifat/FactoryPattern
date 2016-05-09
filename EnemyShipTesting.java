/**
 * Created by Zaara Tasnim Rifat on 5/10/2016.
 */

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String [] args)
    {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of Ship?(U/R/B)");
        if(userInput.hasNextLine())
        {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

        }

        if(theEnemy != null)
        {
            doStuffEnemy(theEnemy);
        }
        else
        {
            System.out.println("Enter U, R or B next time :/");
        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}