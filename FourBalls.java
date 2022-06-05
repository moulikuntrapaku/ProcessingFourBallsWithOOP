import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.setup();
        size(800,400);
    }
    Ball ball1 = new Ball(50,1);
    Ball ball2 = new Ball(150,2);
    Ball ball3 = new Ball(250,3);
    Ball ball4 = new Ball(350,4);

    @Override
    public void draw() {
        circle(ball1.positionX += ball1.speed, ball1.positionY,ball1.radius);
        circle(ball2.positionX += ball2.speed, ball2.positionY,ball2.radius);
        circle(ball3.positionX += ball3.speed, ball3.positionY,ball3.radius);
        circle(ball4.positionX += ball4.speed, ball4.positionY,ball4.radius);
    }
}
