package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.Tortoise;
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
    String sentence = MessageBox.askForTextInput("Write a sentence that starts with 'I' ");
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
    // Write end with Tortoise
    Tortoise.show();
    Tortoise.setSpeed(3);
    Tortoise.move(150);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.move(-50);
    Tortoise.turn(90);
    Tortoise.move(75);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.move(-50);
  }
}