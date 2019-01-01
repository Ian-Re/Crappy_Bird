public class collisiontest {
  public static double test(double rx, double ry, double pipex, double pipecut,double collision,double radius){
    
    if (((rx + radius) >= pipex - 1.2) && ((rx - radius) <= pipex + 1.2)){
      if(((Math.abs((ry - radius)-(pipecut-1.8))) < radius)    || ((Math.abs((pipecut + 1.8) - (ry + radius))) < radius)){
        collision = 12;
        
      }
    }
    
    if(((ry - radius) <= ( pipecut - 1.8)) || ((ry + radius) >= ( pipecut + 1.8)) ){
   if (((rx + radius) >= (pipex - 1.2)) && ((rx - radius) <= (pipex + 1.2))){
          collision = 12;
      }
    }
    
    if(ry <= -7){
      collision = 12;
    }
    return collision;
  }
}
