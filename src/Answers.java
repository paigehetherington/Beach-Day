import java.util.Scanner;

/**
 * Created by vajrayogini on 2/10/16.
 */
public class Answers {
    String weather;
    String bikiniColor;
    String surfboardType;
    int wavesCaught;
    int waterTemp;


    public void askQuestions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How was the weather?");
        weather = scanner.nextLine();
        System.out.printf("What color was your bikini?");
        bikiniColor = scanner.nextLine();
        System.out.println("What type of surfboard did you use?");
        surfboardType = scanner.nextLine();
        System.out.println("How many waves did you catch?");
        wavesCaught = Integer.valueOf(scanner.nextLine());
        System.out.println("What was the water temperature?");
        waterTemp = Integer.valueOf(scanner.nextLine());
    }

    public String getWeather() {
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
