package Jump;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Jump extends JFrame{
  private double height=0, speed=10.0;
  public static final double gravity = 9.81;
 
  public Jump(){
      super("jump");
      setSize(100, 600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);  
  } 

  @Override
  public void paint(Graphics g) {    
    super.paint(g);
    g.setColor(Color.GREEN);
    g.fillRect(0, 550, 100, 2);
    g.setColor(Color.BLUE);
    g.fillOval(25, (int) (500-(height*100)), 50, 50);
  }   

  
  public void jump()
  { 
    long previous= 0, start=0;
  
    while(true){
      start= System.nanoTime();  
      if(previous != 0){
        double delta = start-previous;
        height += (delta/1000000000) *speed;        
        speed -= (delta/1000000000)  * gravity;  

        paint(this.getGraphics());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      }  
      if(height < 0){
          height=0;
          speed=10.0; 
      }      
      previous= start;
    }
    
  }
}