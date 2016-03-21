package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;

public class WheelKata
{
  public static void main(String[] args)
  {
    //    Draw a wheel
    //    Write the steps to code your wheel out in English
    // Show the tortoise #1
    Tortoise.show();
    // set the tortoise speed to full #2
    Tortoise.setSpeed(10);
    // Do the following 100 times #3.1
    for (int i = 0; i < 100; i++)
    {
      // move tortoise 15 pixels #4
      Tortoise.move(15);
      // turn tortoise 90 degrees to the right #5
      Tortoise.turn(90);
      // move the tortoise 90 pixels #6
      Tortoise.move(90);
      // turn the tortoise 105 degrees #7
      Tortoise.turn(105);
      // Repeat #3.2
    }
    //    Translate from English to Java one line at a time
    //    Run your code after each line of Java to make sure it works as expected
  }
}