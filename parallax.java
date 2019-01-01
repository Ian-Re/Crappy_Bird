public class parallax{
  public static double groundm(double move){
    
    move = move -.5;
    return move;
  }
  
  public static double groundt(double movet){
    
    if(movet <= -12){
      movet = 11;
    }
    return movet;   
  }
    
   public static double background(double movep){
    
    movep = movep -0.10;
    return movep;
  }
  
  public static double backgroundt(double moves){
    if(moves <= -10){
      moves = 12;
    }
    return moves;   
  }
  
  /* public static double backgroundchange(double moves){
    if(moves <= -6){
      
    }
    return moves;   
  }*/
  
}