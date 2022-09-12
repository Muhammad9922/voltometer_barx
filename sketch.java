import processing.serial.*;
Serial myPort;
String inBuffer;
int butter;
void setup(){
 size(1300, 700); 
 background(255, 106, 35);
 rectMode(CENTER);
 rect(width/2, 600, 300, 150);
 rect(width/2, 450, 300, 150);
 rect(width/2, 300, 300, 150);
 rect(width/2, 150, 300, 150);
 noStroke();
 myPort = new Serial(this, "COM3", 9600);
}

void draw(){
    while (myPort.available() > 0) {
    background(255, 106, 35);
    inBuffer = myPort.readString();   
    if (inBuffer != null) {
      println(inBuffer);
      butter = Integer.parseInt(inBuffer);
      one();
    }
  }
  

  
}

void one(){
  if (butter == 1){
      fill(200, 0, 0);
     rect(width/2, 600, 300, 150);

  }
  
    if (butter == 2){
      fill(200, 0, 0);
     rect(width/2, 600, 300, 150);
     fill(255, 64, 0);
      rect(width/2, 450, 300, 150);
  }
  
      if (butter == 3){
     fill(200, 0, 0);
     rect(width/2, 600, 300, 150);
     fill(255, 64, 0);
     rect(width/2, 450, 300, 150);
     fill(255, 255, 0);
     rect(width/2, 300, 300, 150);
  }
  
        if (butter == 4){
     fill(200, 0, 0);
     rect(width/2, 600, 300, 150);
     fill(255, 64, 0);
     rect(width/2, 450, 300, 150);
     fill(255, 255, 0);
     rect(width/2, 300, 300, 150);
     fill(0, 255, 0);
     rect(width/2, 150, 300, 150);

  }
          if (butter == 5){
     fill(255, 0, 64);
     rect(width/2, 370, 300, 600);


  }
}
