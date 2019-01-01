public class keycheck {  
  public static double[] check(boolean z,double rx, double ry, double vy,double collision){
       double[] check2 = new double[2];
           if(z == false){
             check2[0] =  -.2;
              StdDraw.picture(rx, ry, "Flap down.png");            
              
            }
            
            if(z == true){
               char a = StdDraw.nextKeyTyped();
              if( a == ' ' ){ 
              StdDraw.picture(rx, ry, "Flap up.png");
 
              check2[0] = 1;
              }
              
              else if( a == 'q' || a == 'Q'){
               check2[1] = 12;
               StdDraw.picture(rx, ry, "Flap down.png");
              }
              
              else if(a != 'q' || a != 'Q'){
                check2[1] = 0;
                StdDraw.picture(rx, ry, "Flap down.png");
              }
              
               else{
             check2[0] =   vy = -.1;
                StdDraw.picture(rx, ry, "Flap down.png");  
               
              }
             
            }
             return check2;
             
  }
  

}