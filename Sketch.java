import processing.core.PApplet;

public class Sketch extends PApplet {
  
  float fltRandomX = 0;
  float fltRandomY = 0;

  int intHouseColourR = 0;
  int intHouseColourG = 0;
  int intHouseColourB = 0;

  int intBackgroundColourR = 0;
  int intBackgroundColourG = 0;
  int intBackgroundColourB = 0;

  public void settings() {
    size(900, 800);
  }

  public void setup() {
    fltRandomX = random(0, 700);
    fltRandomY = random(0, 510);
    
    // Random house color
    intHouseColourR = (int) random(256);
    intHouseColourG = (int) random(256);
    intHouseColourB = (int) random(256);

    // Random background color
    intBackgroundColourR = (int) random(256);
    intBackgroundColourG = (int) random(256);
    intBackgroundColourB = (int) random(256);

    background(intBackgroundColourR, intBackgroundColourG, intBackgroundColourB);
    
    if ((fltRandomX <= 850 / 3) && (fltRandomY <= 750 / 2)) {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    } 
    else if ((fltRandomX >= (850 / 3) * 2) && (fltRandomY <= 750 / 2)) {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    } 
    else if ((fltRandomX <= (850 / 3) * 2) && (fltRandomX >= 850 / 3) && (fltRandomY <= 750 / 2)) {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    }
    else if ((fltRandomX >= (850 / 3) * 2) && (fltRandomY >= 750 / 2)) {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    }
    else if ((fltRandomX <= 850 / 3) && (fltRandomY >= 750 / 2)) {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    }   
    else {
      intHouseColourR = (int) random(256);
      intHouseColourG = (int) random(256);
      intHouseColourB = (int) random(256);
    } 
    
    // house
    // base and ceiling
    stroke(intHouseColourR, intHouseColourG, intBackgroundColourB);
    line(25 + fltRandomX, 115 + fltRandomY, 175 + fltRandomX, 115 + fltRandomY);
    line(25 + fltRandomX, 265 + fltRandomY, 175 + fltRandomX, 265 + fltRandomY);
    // walls
    line(25 + fltRandomX, 115 + fltRandomY, 25 + fltRandomX, 265 + fltRandomY);
    line(175 + fltRandomX, 115 + fltRandomY, 175 + fltRandomX, 265 + fltRandomY);
    // roof
    line(25 + fltRandomX, 115 + fltRandomY, 100 + fltRandomX, 25 + fltRandomY);
    line(175 + fltRandomX, 115 + fltRandomY, 100 + fltRandomX, 25 + fltRandomY);
    // door
    line(75 + fltRandomX, 265 + fltRandomY, 75 + fltRandomX, 190 + fltRandomY);
    line(125 + fltRandomX, 265 + fltRandomY, 125 + fltRandomX, 190 + fltRandomY);
    line(75 + fltRandomX, 190 + fltRandomY, 125 + fltRandomX, 190 + fltRandomY);
    // doorknob
    line(107 + fltRandomX, 225 + fltRandomY, 117 + fltRandomX, 225 + fltRandomY);
    line(107 + fltRandomX, 235 + fltRandomY, 117 + fltRandomX, 235 + fltRandomY);
    line(107 + fltRandomX, 225 + fltRandomY, 107 + fltRandomX, 235 + fltRandomY);
    line(117 + fltRandomX, 225 + fltRandomY, 117 + fltRandomX, 235 + fltRandomY);

    // Display time
    textSize(32);
    fill(255);
    text("Time: " + hour() + ":" + minute() + ":" + second(), 20, 50);
  }
}