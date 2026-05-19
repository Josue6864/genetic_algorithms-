/*
Josue David Garcia Mendez 26375
Ciencias de la computación y tecnologias de la información
*/

import greenfoot.*;

public class MyWorld extends World
{
    int timer = 0;
    int generation = 1;
    public MyWorld()
    {    
        super(800, 600, 1);

        for(int i = 0; i < 50; i++)
        {
            addObject(new Agent(), 150, 300);
        }
        addObject(new Goal(), 400, 300);
        prepare();
    }
    
    public void act()
    {
    timer++;

    if(timer > 300)
    {
        evolve();
        timer = 0;
    }
    showText("Generacion: " + generation, 120, 30);
    }
    
    private void prepare()
    {
    }
    
    public void evolve()
    {
    java.util.List<Agent> agents = getObjects(Agent.class);

    Agent bestAgent = agents.get(0);

    for(Agent a : agents)
    {
        a.calculateFitness();

        if(a.fitness > bestAgent.fitness)
        {
            bestAgent = a;
        }
    }
    showText("Mejor fitness: " + bestAgent.fitness, 620, 570);
    
    removeObjects(agents);

    for(int i = 0; i < 50; i++)
    {
        addObject(
        new Agent(bestAgent.genes),
        150 + Greenfoot.getRandomNumber(30),
        300 + Greenfoot.getRandomNumber(30)
        );
    }
    generation++;
    }
}
