package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Whites;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("enter an adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("enter a verb ending in '-ed'");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("enter a body part");
    //  Ask the user for a sentence
    String sentence = MessageBox.askForTextInput("Write a sentence that starts with 'I' and has an action");
    //  Set the value of the currentStory to the word "Today " --#1.2
    String currentStory = "Today ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory += "I woke " + currentAdverb + ". ";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory += "Then I " + currentEdVerb + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory += "my " + currentBodyPart + ". ";
    //  Add the words 'After that, ' + sentence
    currentStory += "After that, " + sentence;
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory);
    //    Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb2 = MessageBox.askForTextInput("enter a noun");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb2 = MessageBox.askForTextInput("enter a verb");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart2 = MessageBox.askForTextInput("enter adverb");
    //  Ask the user for a sentence
    String sentence2 = MessageBox
        .askForTextInput("Write a sentence that starts with a lowercase 'you' and has an action");
    //  Set the value of the currentStory to the word "Today " --#1.2
    String currentStory2 = "Today ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory2 += "I hit my " + currentAdverb2 + ". ";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory2 += "Then I " + currentEdVerb2 + " and ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory2 += "jumped " + currentBodyPart2 + ". ";
    //  Add the words 'After that, ' + sentence
    currentStory2 += "After that, " + sentence2;
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory2);
    // Write end with Tortoise
    theEnd();
  }
  private static void theEnd()
  {
    Tortoise.show();
    Tortoise.setX(270);
    Tortoise.setY(400);
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(3);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(150);
    Tortoise.turn(155);
    Tortoise.move(166.5);
    Tortoise.turn(-155);
    Tortoise.move(150);
    Tortoise.move(-150);
    Tortoise.turn(90);
    Tortoise.move(25);
    Tortoise.turn(-90);
    Tortoise.move(150);
    Tortoise.move(-150);
    Tortoise.turn(75);
    for (int j = 0; j < 23; j++)
    {
      Tortoise.move(j);
      Tortoise.turn(-j / 1.5);
    }
    Tortoise.setAngle(270);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(90);
    Tortoise.move(25);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.move(-75);
    Tortoise.turn(-90);
    Tortoise.move(62);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.move(-150);
    Tortoise.turn(-90);
    Tortoise.move(65);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(35);
    Tortoise.move(-70);
    Tortoise.show();
    Tortoise.setX(270);
    Tortoise.setY(400);
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(2);
    Tortoise.setPenColor(Whites.White);
    Tortoise.setAngle(0);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(150);
    Tortoise.turn(155);
    Tortoise.move(166.5);
    Tortoise.turn(-155);
    Tortoise.move(150);
    Tortoise.move(-150);
    Tortoise.turn(90);
    Tortoise.move(25);
    Tortoise.turn(-90);
    Tortoise.move(150);
    Tortoise.move(-150);
    Tortoise.turn(75);
    for (int j = 0; j < 23; j++)
    {
      Tortoise.move(j);
      Tortoise.turn(-j / 1.5);
    }
    Tortoise.setAngle(270);;
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(90);
    Tortoise.move(25);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.move(-75);
    Tortoise.turn(-90);
    Tortoise.move(62);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.move(-150);
    Tortoise.turn(-90);
    Tortoise.move(65);
    Tortoise.turn(90);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(35);
    Tortoise.move(-70);
    Tortoise.hide();
  }
}