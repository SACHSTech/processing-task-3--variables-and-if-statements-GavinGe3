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
  int second = second();
  int minute = minute();
  int hour = hour();
  float pandaX = random(200, 400);
  float pandaY = random(200, 400);
  boolean nightTime = minute > 25;

  public void draw() {
    
    // If night time set background to dark, if not nighttime background 
    if (nightTime){
      background(0, 0, 0);
    }
    if (!nightTime){
      background(210, 255, 173);
    }
    
    // Set initial stroke weight  
    strokeWeight(4);

    // Draw background bamboo
    fill(8, 133, 68);
    rect(30, 0, 45, 600);
    rect(160, 0, 45, 600);
    rect(280, 0, 45, 600);
    rect(400, 0, 45, 600);
    rect(520, 0, 45, 600);
    
    // Draw Bamboo Horizontal Lines
    line(30, 100, 75, 110);
    line(30, 250, 75, 230);
    line(30, 400, 75, 420);
    line(30, 550, 75, 570);
    line(520, 100, 565, 90);
    line(520, 260, 565, 245);
    line(520, 410, 565, 425);
    line(520, 545, 565, 540);
    line(160, 50, 205, 65);
    line(280, 55, 325, 58);
    line(400, 44, 445, 28);
    line(160, 501, 205, 491);
    line(280, 550, 325, 557);
    line(400, 510, 445, 530);
    
    // Draw panda Ears
    if (pandaX > 300 && pandaY > 300){
      fill(140, 0, 0);
    }
    if (pandaX < 300 && pandaY > 300){
      fill(0, 80, 40);
    }
    if (pandaX > 300 && pandaY < 300){
      fill(227, 203, 0);
    }
    if (pandaX < 300 && pandaY < 300){
      fill(242, 90, 29);
    }
    arc(pandaX - 125, pandaY - 120, 200, 200, radians(135), radians(320), OPEN);
    arc(pandaX + 125, pandaY - 120, 200, 200, radians(220), radians(405), OPEN);

    // Draw Panda face
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

    // Draw Panda "Whiskers"
    strokeWeight(8);
    line(pandaX, pandaY + 75, pandaX, + pandaY + 105);
    noFill();
    arc(pandaX - 25, pandaY + 105, 50, 40, 0, radians(135));
    arc(pandaX + 25, pandaY + 105, 50, 40, radians(45), radians(180));

    // Draw panda nose 
    if (pandaX < 250 || pandaX > 350){
      fill(26,159,228);
    }
    if (pandaX > 250 && pandaX < 350){
      fill(247, 0, 0);
    }
    ellipse(pandaX, pandaY + 75, 75, 40);

    // Print time
    textSize(25);
    text(hour, pandaX - 20, pandaY - 100);
    text(":", pandaX - 7, pandaY - 100);
    text(minute, pandaX, pandaY - 100);
    text(":", pandaX + 25, pandaY - 100);
    text(second, pandaX + 35, pandaY - 100);
  }
}