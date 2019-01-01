import java.io.*;
import java.awt.Font;
public class ReadFile
{
  public static void  score(char c,double rx,boolean scorek,int track)
  {
    try
    {
      FileReader file=new FileReader("highscore.txt");
      BufferedReader buffer=new BufferedReader(file);
      
      String textline = buffer.readLine();
      
      while((c != 'a')){
        
        StdDraw.show(50);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(0, 0, 15.0);
        StdDraw.setPenColor(StdDraw.YELLOW);
        Font f = new Font(Font.SERIF,Font.BOLD, 60);
        StdDraw.setFont(f);
        StdDraw.text((rx + 5) ,8 , "Highscore: " + textline);
        StdDraw.text((rx + 5) ,3 , "Your score: "  + track);
        scorek = StdDraw.hasNextKeyTyped();
        
        if(track < 10){
          StdDraw.text((rx + 5) ,-2 , "No medal received: ");
          Font g = new Font(Font.SERIF,Font.BOLD, 50);
        StdDraw.setFont(g);
          StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
        }
        
        if(track >= 10 && track <20){
          StdDraw.text((rx + 5) ,-2 , "Medal received: ");
          StdDraw.picture((rx + 5), -5, "bronze.png");
          Font g = new Font(Font.SERIF,Font.BOLD, 50);
          StdDraw.setFont(g);
          StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
        }
        
        if(track >= 20 && track <30){
          StdDraw.text((rx + 5) ,-2 , "Medal received: ");
          StdDraw.picture((rx + 5), -5, "silver.png");
          Font g = new Font(Font.SERIF,Font.BOLD, 50);
          StdDraw.setFont(g);
          StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
        }
        
        if(track >= 30 && track < 40){
          StdDraw.text((rx + 5) ,-2 , "Medal received: ");
          StdDraw.picture((rx + 5), -5, "gold.png");
          Font g = new Font(Font.SERIF,Font.BOLD, 50);
          StdDraw.setFont(g);
          StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
        }
        
          if(track >= 40){
          StdDraw.text((rx + 5) ,-2 , "Medal received: ");
          StdDraw.picture((rx + 5), -5, "gold.png");
          Font g = new Font(Font.SERIF,Font.BOLD, 50);
          StdDraw.setFont(g);
          StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
        }
        
        
        if(scorek == true){
          c = StdDraw.nextKeyTyped();
        }
        
      }
      
      buffer.close();
    }
    
    catch( IOException e ){} 
  }
   public static int check()
  {
     int i = 0;
   try
    {
      
      FileReader file=new FileReader("highscore.txt");
      BufferedReader buffer=new BufferedReader(file);
      
      String textline = null;
      while((textline = buffer.readLine()) != null){
        i = Integer.parseInt(textline);
      buffer.close();
    }
    
    }
    
    catch( IOException e ){} 
    return i;
  }
  
}
