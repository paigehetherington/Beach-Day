import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vajrayogini on 2/10/16.
 */
public class BeachDay {
    public static Answers answers = new Answers(); //created new answers object, don't know why outside main method

    public static void main(String[] args) throws IOException {

        answers = loadBeachDay();  //calling load method , reads file and displays contents
        if (answers == null) { //if no info asks list of questions
            answers.askQuestions();
        } else { //otherwise asks to update
            System.out.printf("%s %s %s %d %d\n", answers.weather, answers.bikiniColor, answers.surfboardType, answers.wavesCaught, answers.waterTemp);
            System.out.println("Would you like to update any answers?");
            Scanner s = new Scanner(System.in); //receives input (answer)
            String answerUpd = s.nextLine(); //creates string for answer
            if (answerUpd.equalsIgnoreCase("yes")) {
                answers.askQuestions();
            } else {
                System.out.println("Okay, thank you.");
            }
        }

        saveBeachDay(); //calling save method, saves new or updated answers to questions

    }



    public static void saveBeachDay() throws IOException { // details of save method. void doesn't return anything
        JsonSerializer s = new JsonSerializer(); //new object
        String json = s.serialize(answers); //serialize into string -- (include("*") includes array list)
        File f = new File("beachDay.json");
       try {
           FileWriter fw = new FileWriter(f);
           fw.write(json);
           fw.close(); //save file
       } catch (Exception e){ //in case there is a problem and doesn't save, won't crash program
           System.out.println("Something went wrong");
       }
    }

    public static Answers loadBeachDay() throws FileNotFoundException { // details of load method. why answers?
        try {
            File f = new File("beachDay.json");
            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();

            JsonParser p = new JsonParser();
            System.out.println(contents);
            return p.parse(contents, Answers.class); //method returns player object
        } catch (Exception e){
            System.out.println("Something went wrong with loadBeachDay");
            return null;
        }
    }
}