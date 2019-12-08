import java.io.*;
import java.util.*;
public class WordFrequencies{

   public static void main(String[] args) {
       try{ 
           File openfile = new File("lyrics.txt");
           BufferedReader bufferedReader = new BufferedReader(new FileReader(openfile));
           String x;
           HashMap<String, Integer> map = new HashMap<String, Integer>();
           
           while ((x = bufferedReader.readLine()) != null) {
           String[] str = x.split(" ");
           for (String a : str){
       
       if (map.containsKey(a)) {
           map.put(a, map.get(a) + 1);
           }
           else 
           {
                           map.put(a, 1);
           }
                   }
           }
       for (Map.Entry entry : map.entrySet()) {

    	   System.out.println(entry.getValue() + " :" + entry.getKey()); }
       }
       catch(Exception e){
           System.out.print("Can not find lyrics file");
       }
   }
}