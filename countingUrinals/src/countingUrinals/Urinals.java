/*
 * @author - Ireish Purohit
 */

package countingUrinals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*

public class Urinals {
    public static void main(String[] args) {
    	Urinals object = new Urinals();        
    	
    	String inputFile = "D:\\Users\\Poppin220ug\\eclipse-workspace\\countingUrinals\\urinal.dat";
        try {
            // read file
            List<String> input = null;
            input = object.readFile(inputFile);

        }
    }
}