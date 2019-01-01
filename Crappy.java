import java.awt.Font;
import StdDraw;
public class Crappy { 
  public static void main(String[] args) {
    // set the scale of the coordinate system
  boolean i = true;
  boolean exit = false;
    // main animation loop
    while (i && exit == false){
      int checkHighScore = 0;
      boolean restart = false;
      boolean scorek = false;
      boolean startcheck = false;
      double collision = 0.0;
      StdDraw.setXscale(-10.0, 10.0);
      StdDraw.setYscale(-10.0, 10.0);
      
      // initial values
      
      char check = 'a'; 
      char b = 's';
      char c = 's';
      double move = 0;
      double moveb = 0;
      double pipe1x = 8.0;           //pipe positions
      double pipe2x = 15.0; 
      double pipe3x = 22.0;
      double radius = 0.45;
      
      int track = 0;
      double rx = -5.0, ry = 0.0;     // position
      double vx = 0.0, vy = 0.0;     // velocity
      double pipe1cut = StdRandom.uniform(0,8);           //pipe cut out positions
      double pipe2cut = StdRandom.uniform(0,8);
      double pipe3cut = StdRandom.uniform(0,8);
      double[] check2 = new double[2];
      
      
      while( startcheck == false && exit == false){
        StdDraw.picture(0, 0, "photo.JPG");
        StdDraw.show(50);
        startcheck = StdDraw.hasNextKeyTyped() ;
        
      }
      if(startcheck == true){     
        check = StdDraw.nextKeyTyped();
        
        if ( check == ' '){
          
          while(collision == 0){ 
            // check if any key is pressed
            boolean z = StdDraw.hasNextKeyTyped() ;
            
            
            //Graphics p = new Graphics();
            // bounce off wall according to law of elastic collision
            if (Math.abs(ry + vy) > 11.0 - radius) vy = -vy;
            
            // update position
            rx = rx + vx; 
            ry = ry + vy; 
            
            
            // set the pipes in motion
            pipe1x = pipe.move(pipe1x);
            pipe2x = pipe.move(pipe2x);
            pipe3x = pipe.move(pipe3x);
            
            pipe1cut = pipe.randomcuts(pipe1x,pipe1cut);
            pipe2cut = pipe.randomcuts(pipe2x,pipe2cut);
            pipe3cut = pipe.randomcuts(pipe3x,pipe3cut);
            
            pipe1x = pipe.teleport(pipe1x);
            pipe2x = pipe.teleport(pipe2x);
            pipe3x = pipe.teleport(pipe3x);
            
            // clear the background
            move =  parallax.groundm(move);
            move =  parallax.groundt(move);
            moveb = parallax.background(moveb);
            moveb = parallax.backgroundt(moveb);
            StdDraw.picture(moveb, 0, "Flappy-Backgrounds day.png");
            
            
            pipe.create(pipe1x,pipe1cut);
            pipe.create(pipe2x,pipe2cut);
            pipe.create(pipe3x,pipe3cut);
            StdDraw.picture(move, -9.54, "Flappy-Ground.png");
            
            
            check2 =  keycheck.check(z,rx,ry,vy,collision);
            vy = check2[0];
            collision = check2[1]; 
                
            //collision test for each pipe
            collision = collisiontest.test(rx,ry,pipe1x,pipe1cut,collision,radius);
            collision = collisiontest.test(rx,ry,pipe2x,pipe2cut,collision,radius);
            collision = collisiontest.test(rx,ry,pipe3x,pipe3cut,collision,radius);
            if(collision == 12){
              
             
            }
            
            track = score.track(track,rx,radius,pipe1x,ry);
            track = score.track(track,rx,radius,pipe2x,ry);
            track = score.track(track,rx,radius,pipe3x,ry);
            
            
            
            // display and pause for 50 ms
            StdDraw.show(50); 
          } 
          
          if(collision == 12){
            while( ry >= -7){
              ry = ry-.5;
              
              StdDraw.picture(0, 0, "Flappy-Backgrounds day.png");
              pipe.create(pipe1x,pipe1cut);
              pipe.create(pipe2x,pipe2cut);
              pipe.create(pipe3x,pipe3cut);
              StdDraw.picture(rx, ry, "Flap down - fall.png");
              pipe.create(pipe1x,pipe1cut);
              pipe.create(pipe2x,pipe2cut);
              pipe.create(pipe3x,pipe3cut);
              StdDraw.picture(0, -10, "Flappy-Ground.png");
              
              
              StdDraw.show(50);
            }
            
            while(b != 'a'){
              
              StdDraw.show(50);
              StdDraw.picture((rx + 5), 0, "dead.jpg"); 
              StdDraw.setPenColor(StdDraw.YELLOW);
              Font f = new Font(Font.SERIF,Font.BOLD, 50);
              StdDraw.setFont(f);
              StdDraw.text((rx + 5) ,-8 , "Press a to continue: ");
              restart = StdDraw.hasNextKeyTyped();
              if(restart == true){
                b = StdDraw.nextKeyTyped();
              }
            }
            
            
            checkHighScore = ReadFile.check();
           
            if(checkHighScore < track){
              WriteFile.high(track);
            }
            
            ReadFile.score(c,rx,scorek,track);
            
            
            
          }
          
        } 
        
      }
      
      
    }
   
    WriteFile.high(0);
   
  }
} 
