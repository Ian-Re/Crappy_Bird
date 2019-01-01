public class pipe{
  public static void create(double pipex,double pipecut){

    //draw the pipes

    StdDraw.picture(pipex, pipecut + 8.6 , "Pipe-top.png");
    StdDraw.picture(pipex,pipecut - 8.6  , "Pipe-bottom.png");
 

  }
  
  public static double move(double pipex){
    
    // set the pipes in motion
    
    pipex = pipex - .09;
    return pipex;
    
    
  }
  public static double teleport(double pipex){
    // make sure pipes re-apper with different 'cut outs'
    
    if(pipex <= -12){
      pipex = 11;
    }
    return pipex;    
  }
  
  public static double randomcuts(double pipex,double cut){
    
    if(pipex <= -12){
      cut = StdRandom.uniform(0,8);
    }
    return cut;    
  }
}

