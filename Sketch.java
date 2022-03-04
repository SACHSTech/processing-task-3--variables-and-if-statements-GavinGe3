import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  float pandaX = random(160, 440);
  float pandaY = random(150, 450);
  public void draw() {

    fill(0, 0, 0);
    arc(pandaX - 125, pandaY - 120, 200, 200, radians(135), radians(320), OPEN);
    arc(pandaX + 125, pandaY - 120, 200, 200, radians(220), radians(405), OPEN);


    

    fill(255, 255, 255);
    ellipse(pandaX, pandaY, 450, 375);

    // Draw Panda Eyes (Black Part)
    fill(0, 0, 0);
    arc(pandaX - 100, pandaY - 15, 150, 150, radians(149), radians(301), OPEN);
    arc(pandaX -125, pandaY - 40, 150, 150, radians(-32), radians(122), OPEN);
    arc(pandaX + 100, pandaY - 15, 150, 150, radians(239), radians(391), OPEN);
    arc(pandaX + 125, pandaY - 40, 150, 150, radians(58), radians(212), OPEN);  


    // Draw Panda Eyes (WhitePupils)
    fill(255, 255, 255);
    ellipse(pandaX - 90, pandaY - 48, 30, 30);
    ellipse(pandaX + 90, pandaY - 48, 30, 30);

    // Draw panda nose 
    fill(0, 0, 0);
    ellipse(pandaX, pandaY + 75, 75, 40);

    // Draw Panda "Whiskers"
    strokeWeight(8);
    line(pandaX, pandaY + 75, pandaX, + pandaY + 105);
    noFill();
    arc(pandaX - 25, pandaY + 105, 50, 40, 0, radians(135));
    arc(pandaX + 25, pandaY + 105, 50, 40, radians(45), radians(180));


    



	  
	
  }
  
  // define other methods down here.
}