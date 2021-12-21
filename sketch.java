function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);
  //backhair
  noStroke()
  fill(32,19,19);
  arc(240,260,320,250, QUARTER_PI + HALF_PI, QUARTER_PI,OPEN);
  //face
  stroke(2)
  fill(247,221,212);
  ellipse(240,295,190,220);
  //tophair
  noStroke()
  fill(32,19,19);
  rect(230,175,65);
  rect(130,190,65)
  rect(170,186,65)
  rect(255,180,65)
  //eyes
  strokeWeight(1)
  fill(12,12,12)
  ellipse(265,180,5,5)
  ellipse(180,290,28,25)
  //eyearound
stroke(249, 67, 6, 130);
  strokeWeight(6);
  arc(210, 255, 45, 15, PI, TWO_PI, OPEN);
  arc(310, 255, 45, 15, PI, TWO_PI, OPEN);
  arc(210, 257, 40, 30, HALF_PI, PI);
  arc(310, 257, 40, 30, 0, HALF_PI);
