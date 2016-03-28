package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    //    Show the tortoise --#1
    Tortoise.show();
    for (int i = 0; i < 1000; i++)
    {
      //    Make the tortoise go as fast as possible --#4
      Tortoise.setSpeed(10);
      //    Add Blue Violet to the Color Wheel --#7
      ColorWheel.addColor(Purples.BlueViolet);
      //    Add Violet to the Color Wheel --#8
      ColorWheel.addColor(Purples.Violet);
      //    Add Purple to the Color Wheel --#9
      ColorWheel.addColor(Purples.Purple);
      //    Do the following 75 times --#3.1
      try
      {
        //         Change the pen color of the line the tortoise draws the next color on the Color Wheel --#6
        Tortoise.setPenColor(ColorWheel.getNextColor());
        //         Move the tortoise 5 times the current line number you are drawing --#5
        Tortoise.move(i * 1);
        //         Turn the tortoise 1/3 of 360 degrees to the right --#2
        Tortoise.turn(79);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
      //    Repeat --#3.2
    }
  }
}
