
package datamining1;
import java.io.*;
import java.util.*;
/*
Main class contains object of readFile class to read data from the file
*/

public class DataMining1 {

    public static void main(String[] args) {
        
        String file_name;
        int min_support,confidence;        
        Scanner sc = new Scanner(System.in);
        file_name = sc.nextLine();
        min_support = sc.nextInt();
        confidence = sc.nextInt();        
        readFile rf = new readFile (file_name,min_support,confidence); 
     
      
    }
    
}
