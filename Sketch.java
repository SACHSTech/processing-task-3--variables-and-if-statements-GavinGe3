import processing.core.PApplet;
/**
 * @Author: Ge. G
 * Draws a panda at a random location, and depending on this location changes the color of the pands ears and nose. Additionally, the time of 
 * day is displayed and background changes depending on time. 
 */
public class Sketch extends PApplet {
	
  public void settings() {
    size(600, 600);
  }
   
  public void setup() {
    background(210, 255, 173);
  }

  // Declare time Variables 
  int intSecond = second();
  int intMinute = minute();
  int intHour = hour();

  // Declare random location Variables
  float fltPandaX = random(220, 380);
  float fltPandaY = random(215, 385);

  // Declare time boolean for background
  boolean boolNightTime = intMinute > 30;
  
  public void draw() {

    // Set initial stroke weight  
    strokeWeight(4);
    
    // If its half past the intHour set background to dark, if not set background to light
    if (boolNightTime) {
      background(0, 0, 0);
    }
    if (!boolNightTime) {
      background(210, 255, 173);
    }

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
    
    // Draw panda Ears and change color based on location
    if (fltPandaX >= 300 && fltPandaY >= 300){
      fill(140, 0, 0);
    }
    if (fltPandaX <= 300 && fltPandaY >= 300){
      fill(0, 80, 40);
    }
    if (fltPandaX >= 300 && fltPandaY <= 300){
      fill(227, 203, 0);
    }
    if (fltPandaX <= 300 && fltPandaY <= 300){
      fill(242, 90, 29);
    }
    arc(fltPandaX - 125, fltPandaY - 120, 200, 200, radians(135), radians(320), OPEN);
    arc(fltPandaX + 125, fltPandaY - 120, 200, 200, radians(220), radians(405), OPEN);

    // Draw Panda face
    fill(255, 255, 255);
    ellipse(fltPandaX, fltPandaY, 450, 375);


    // Draw Panda Eyes (Black Part)
    fill(0, 0, 0); 
    arc(fltPandaX - 100, fltPandaY - 15, 150, 150, radians(149), radians(301), OPEN);
    arc(fltPandaX -125, fltPandaY - 40, 150, 150, radians(-32), radians(122), OPEN);
    arc(fltPandaX + 100, fltPandaY - 15, 150, 150, radians(239), radians(391), OPEN);
    arc(fltPandaX + 125, fltPandaY - 40, 150, 150, radians(58), radians(212), OPEN);  

    // Draw Panda Eyes (WhitePupils)
    fill(255, 255, 255);
    ellipse(fltPandaX - 90, fltPandaY - 48, 30, 30);
    ellipse(fltPandaX + 90, fltPandaY - 48, 30, 30);

    // Draw Panda "Whiskers"
    strokeWeight(8);
    line(fltPandaX, fltPandaY + 75, fltPandaX, + fltPandaY + 105);
    noFill();
    arc(fltPandaX - 25, fltPandaY + 105, 50, 40, 0, radians(135));
    arc(fltPandaX + 25, fltPandaY + 105, 50, 40, radians(45), radians(180));

    // Draw panda nose and change color based on location
    if (fltPandaX < 250 || fltPandaX > 350){
      fill(26,159,228);
    }
    if (fltPandaX > 251 && fltPandaX < 351){
      fill(247, 0, 0);
    }
    ellipse(fltPandaX, fltPandaY + 75, 75, 40);

    // Print time
    textSize(25);
    if (intHour > 9) {
      text(intHour, fltPandaX - 34, fltPandaY - 100);
    }
    else {
      text("0" + intHour, fltPandaX - 34, fltPandaY - 100);
    }
    if (intMinute < 10){
      text("0" + intMinute, fltPandaX, fltPandaY - 100);
    }
    else {
      text(intMinute, fltPandaX , fltPandaY - 100);
    }
    if (intSecond < 10){
      text("0" + intSecond, fltPandaX + 35, fltPandaY - 100);
    }
    else{
      text(intSecond, fltPandaX + 35, fltPandaY - 100);
    }
    text(":", fltPandaX - 6, fltPandaY - 100);
    text(":", fltPandaX + 27, fltPandaY - 100);
  }
}