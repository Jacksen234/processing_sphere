float precision = 128;
float precisionY = 128;
int r = 300;
float rotation = 0;

void setup(){
  size(800, 800, P3D);
  colorMode(HSB);
  noFill();
  strokeWeight(1);
}

void draw(){
  background(40);
  beginShape();
  translate(width / 2, height / 2);
  for(int j = r; j >= -r;j -= (2 * r) / precisionY){
    for(float i = 0; i < TWO_PI; i += TWO_PI / precision){
    float mappedColor = map(j, -r, r, 150, 230);
    float calcRadius = (float)Math.sqrt(Math.pow(r, 2) - Math.pow(j, 2));
    float x = cos(i) * calcRadius;
    float z = sin(i) * calcRadius;
    stroke(mappedColor, 200, 255);
    vertex(x, j, z);
    }
  }
  rotateX(rotation);
  rotateY(rotation/2);
  rotateZ(rotation);
  rotation += 0.01;
  endShape();
}
 