import java.util.Scanner;

/**
 * Created by vajrayogini on 2/10/16.
 */
public class Answers {
    String weather; //created variables in Answers class
    String bikiniColor;
    String surfboardType;
    int wavesCaught;
    int waterTemp;


    public void askQuestions(){ // the details of askQuestions method
        Scanner scanner = new Scanner(System.in); //initialized scanner to receive input
        System.out.println("How was the weather?");
        weather = scanner.nextLine(); //takes answer and makes it weather
        System.out.printf("What color was your bikini?");
        bikiniColor = scanner.nextLine();
        System.out.println("What type of surfboard did you use?");
        surfboardType = scanner.nextLine();
        System.out.println("How many waves did you catch?");
        wavesCaught = Integer.valueOf(scanner.nextLine());
        System.out.println("What was the water temperature?");
        waterTemp = Integer.valueOf(scanner.nextLine());
    }

    public String getWeather() { //created getters so can save code in json
        return weather;
    }

    public String getBikiniColor() {
        return bikiniColor;
    }

    public String getSurfboardType() {
        return surfboardType;
    }

    public int getWavesCaught() {
        return wavesCaught;
    }

    public int getWaterTemp() {
        return waterTemp;
    }
}
