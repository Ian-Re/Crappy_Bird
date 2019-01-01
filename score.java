import java.awt.Font;
public class score{
  public static int track(int scoret,double rx,double radius,double pipex,double ry){
    
    if (((rx + radius) <= pipex + 1.1) && ((rx + radius) >= pipex + 1.01)){
      scoret++;
    }
    
    else{
      scoret = scoret + 0;
    }
    
    StdDraw.setPenColor(StdDraw.YELLOW);
    Font f = new Font(Font.SERIF,Font.BOLD, 80);
    StdDraw.setFont(f);
    StdDraw.text((rx - 5) ,8  , " " + scoret);
    return scoret;
  }
}