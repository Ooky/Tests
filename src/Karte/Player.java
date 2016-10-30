package Karte;

public class Player {

    private String name;
    private int zone;
    private char position[][];

    public Player() 
    {
        this.name = "TestName";
        this.zone = 1;
        
    }
    
    public char[][] getNeuZone() 
    {
        KarteTest2DArr.zonenLoader(KarteTest2DArr.zone1());
        return position;
    }

    public void setNeuZone(char[][] neuZone) 
    {
        this.position = neuZone;
    }
    


    public String getName() 
    {
        return name;
    }

    public int getZone() {
        return zone;
    }

    public int setZone(int zone) 
    {
        this.zone = zone;
        return zone;
    }

}
