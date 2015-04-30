package ecs.coursework;

public interface PowerStation
{
    private int startupTime;
    private int shutdownTime;
    private int powerOutput;
    private int health;

    public int startUp();
    public boolean isRunning();
    public int shutDown();


    /*
    Get member var values.
     */
    public int getPowerOutput();
    public int getShutdownTime();
    public int getStartupTime();
    public int getHealth();



}