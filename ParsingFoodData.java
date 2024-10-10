import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ParsingFoodData {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);


      System.out.println("Enter file name: ");
      String fileName = scnr.nextLine();

      FileInputStream fileStream = new FileInputStream(fileName);
      Scanner fileScanner = new Scanner(fileStream);

      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        String[] itemsArray = line.split("\t");  
        
        String category = itemsArray[0];
        String name = itemsArray[1];
        String description = itemsArray[2];
        String availability = itemsArray[3];  
        
        if (availability.equals("Available") || availability.equals("Not Available")) {
           System.out.println(name + " (" + category + ") -- " + description);
        }
     }
     fileScanner.close();
         }
      }

