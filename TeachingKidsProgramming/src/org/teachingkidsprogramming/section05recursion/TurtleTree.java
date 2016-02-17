package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Browns;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#10
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    //    The current branch length = 60 --#1.2
    int branchLength = 60;
    //    drawBranch(recipe below) --#2.1
    //
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    //    ------------- Recipe for drawBranch --#2.2
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (branchLength > 0)
    {
      //        adjustColor (recipe below)--#15.1
      adjustColor(branchLength);
      //
      //        Move the tortoise the length of the current branch --#1.1 
      Tortoise.move(branchLength);
      //        drawLowerBranches (recipe below) --#6.1
      adjustColor(branchLength);
      //
      drawLowerBranches(branchLength);
      branchLength = branchLength + 10;
      adjustColor(branchLength);
      // 
    }
    //    ------------- End of drawBranch recipe --#2.3
  }
  private static void drawLowerBranches(int branchLength)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    //            Turn the Tortoise 30 degrees to the right --#3
    Tortoise.turn(30);
    //            drawShorterBranch (recipe below) --#8.1
    //
    drawShorterBranch(branchLength);
    //
    //            Turn the Tortoise 60 degrees to the left --#7
    Tortoise.turn(-60);
    //            drawShorterBranch --#9
    drawShorterBranch(branchLength);
    //            Turn the Tortoise 30 degrees to the right --#12
    Tortoise.turn(30);
    //            adjustColor --#16
    //            Move the tortoise backward the length of the current branch --#11
    Tortoise.move(-branchLength);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void adjustColor(int branchLength)
  {
    //        ------------- Recipe for adjustColor --#15.2
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //            A 10 pixel long branch is lime --#20
    colors.put(10, Greens.Lime);
    //            A 20 pixel long branch is forest green --#19
    colors.put(20, Greens.ForestGreen);
    //            A 30 pixel long branch is dark green --#18
    colors.put(30, Greens.DarkGreen);
    //            A 40 pixel long branch is olive --#17
    colors.put(40, Greens.Olive);
    //            A 50 pixel long branch is sienna --#14
    colors.put(50, Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
    colors.put(60, Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
    Tortoise.setPenColor(colors.get(branchLength));
    //        ------------- End of adjustColor --#15.3
  }
  private static void drawShorterBranch(int branchLength)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    //                drawBranch (10 pixels shorter) --#4
    drawBranch(branchLength - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}