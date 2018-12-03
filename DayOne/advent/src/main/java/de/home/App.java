package de.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Advent of Code is back baby!
 * Day One!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        int result = partTwo();
        System.out.println("The frequency repeats at: " + result);
    }

    public static int partOne() {
        int sum = 0;
        File file = new File("advent/src/main/java/de/home/data.txt");
        System.out.println(file.getName());
        try {
            Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            sum = sum + sc.nextInt();
        }
        sc.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error Scanning File" + e);
        }
    
        return sum;
    }
    public static int partTwo() {
        int freq = 0;
        HashMap<Integer, String> frequencies = new HashMap<Integer, String >();
        File file = new File("advent/src/main/java/de/home/data.txt");
        try {
            Scanner sc = new Scanner(file);
        while (true) {

            if(frequencies.containsKey(freq) && !frequencies.isEmpty()) {
                sc.close();
                return freq;
            }
            else
                frequencies.put(freq, "frequency");
            freq = freq + sc.nextInt();

            if(sc.hasNext()) {
                sc.nextLine();
            }
            else {
                sc = new Scanner(file);
            }
            
        }
        
    }
    catch(FileNotFoundException e) {
        System.out.println("Error Scanning File" + e);
    }
        return freq;
    }
}
