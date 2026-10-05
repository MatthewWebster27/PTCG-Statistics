package Java;


/**
 * The TFController Class (TF = Text File) handles all usage of text files, more specifically 
 * the decklists text file.
 */

public class TFController {

    String FILEPATH;

    public TFController(){

        // CONSTANTS

        this.FILEPATH = "decklists.txt";
    }

    /**
     * The method 'getDecklists' reads the text file and produces a list of decklists 
     * (2D array), where each array contains four elements:
    - Name
    - Pokémon
    - Trainers
    - Energy
     * @return decklists (2D array of Strings)
     */

    public void getDecklists(){
        System.out.println(this.FILEPATH); // test
    }
}
