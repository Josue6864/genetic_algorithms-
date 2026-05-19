/*
Josue David Garcia Mendez 26375
Ciencias de la computación y tecnologias de la información
*/

import greenfoot.*;

public class Goal extends Actor
{
    int messageTimer = 0;

    public void act()
    {
        Agent agent = (Agent)getOneIntersectingObject(Agent.class);

        if(agent != null)
        {
            getWorld().showText("Un agente llego a la meta", 400, 50);

            messageTimer = 120;
        }

        if(messageTimer > 0)
        {
            messageTimer--;
        }
        else
        {
            getWorld().showText("", 400, 50);
        }
    }
}
