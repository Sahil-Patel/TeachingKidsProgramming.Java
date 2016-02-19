package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    //    The current zoom is 1.1 --#8.2
    double currentZoom = 1.1;
    //    The current length of a line is 10.5 pixels --#1.2 
    Double currentLength = 10.5;
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setAnimal(Animals.Spider);
    //    Change the pen color of the line the tortoise draws to red --#13.1
    Tortoise.setPenColor(Reds.Red);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    //    Do the following 10 times --#10.1
    for (int k = 0; k < 10; k++)
    {
      //        weaveOneLayer (recipe below) --#9.1
      //
      currentLength = weaveOneLayer(currentZoom, currentLength);
      //
      //        Change the current zoom so it is multiplied by 1.3 --#11
      currentZoom = currentZoom * 1.3;
      //    Repeat --#10.2
    }
  }
  private static Double weaveOneLayer(double currentZoom, Double currentLength)
  {
    //        ------------- Recipe for weaveOneLayer --#9.2
    //        Do the following 6 times --#5.1
    for (int i = 0; i < 6; i++)
    {
      //            drawTriangle (recipe below) --#4.1
      //
      drawTriangle(currentLength);
      //
      //            Turn the tortoise 1/6th of 360 degrees to the right --#7
      Tortoise.turn(360 / 6);
      //            Increase the current length (of the line) by the current zoom --#8.1
      currentLength = currentLength + currentZoom;
      //        Repeat --#5.2
    }
    //        ------------- End of weaveOneLayer recipe --#9.3
    return currentLength;
  }
  private static void drawTriangle(Double currentLength)
  {
    //            ------------- Recipe for drawTriangle --#4.2
    //            Do the following 3 times --#3.1
    for (int j = 0; j < 3; j++)
    {
      //                Move the tortoise the current length (of the line) --#1.1
      Tortoise.move(currentLength);
      //                Turn the tortoise 1/3rd of 360 degrees --#2
      Tortoise.turn(360 / 3);
    }
    //            Repeat --#3.2
    //            ------------- End of drawTriangle recipe --#4.3
  }
}
