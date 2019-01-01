import java.io.*;
public class WriteFile {
  public static void high(int track)
  {
    try{
      FileWriter file = new FileWriter("highscore.txt");
      BufferedWriter buffer = new BufferedWriter(file);
      
      buffer.write("" + track);
      buffer.close();
    }
    catch(IOException e){}
  }
}