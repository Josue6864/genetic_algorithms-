/*
Josue David Garcia Mendez 26375
Ciencias de la computación y tecnologias de la información
   */

import greenfoot.*;

public class Agent extends Actor
{
    int[] genes = new int[2500];
    int step = 0;
    double fitness;

    public Agent()
    {
        for(int i = 0; i < genes.length; i++)
        {
            genes[i] = Greenfoot.getRandomNumber(4);
        }
    }
    
    public Agent(int[] parentGenes)
    {
    genes = new int[parentGenes.length];

    for(int i = 0; i < parentGenes.length; i++)
    {
        genes[i] = parentGenes[i];

        if(Greenfoot.getRandomNumber(100) < 15)
        {
            genes[i] = Greenfoot.getRandomNumber(4);
        }
    }
    }

    public void act()
    {
        if(step < genes.length)
        {
            moveAccordingToGene(genes[step]);
            step++;
        }

    }

    public void moveAccordingToGene(int gene)
    {
        if(gene == 0)
        {
            setLocation(getX()+2, getY());
        }

        if(gene == 1)
        {
            setLocation(getX()-2, getY());
        }

        if(gene == 2)
        {
            setLocation(getX(), getY()+2);
        }

        if(gene == 3)
        {
            setLocation(getX(), getY()-2);
        }
    }
    
    public void calculateFitness()
    {   
    Goal goal = (Goal)getWorld().getObjects(Goal.class).get(0);

    double dx = getX() - goal.getX();
    double dy = getY() - goal.getY();

    double distance = Math.sqrt(dx*dx + dy*dy);

    fitness = 1 / distance;
    }
}
