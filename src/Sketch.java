import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(7, 166, 240);
    }

    public void draw() {

    }

    public void keyPressed() {
        if (key == 'r') {
            background(7, 166, 240);
        }
        if (key == 'p') {
            drawPumpkin(mouseX, mouseY, 0.4);
        }
        if (key == 'l') {
            drawLeaf(mouseX, mouseY, 0.4, 100, 180, 100);
        }
        if (key == 'a') {
            drawAcorn(mouseX, mouseY, 0.4);
        }
        if (key == 't') {
            drawTree(mouseX, mouseY, 0.4, 50, 150, 50);
        }
        if (key == 'h') {
            drawHaystack(mouseX, mouseY, 0.4);
        }

    }

    // Draws a pumpkin at the specified (x, y) position with the given scale factor s.
    public void drawPumpkin(int x, int y, double s) {
        pushMatrix();
        translate(x, y);
        scale((float) s);

        // body
        stroke(170, 80, 10);
        strokeWeight(3);
        fill(240, 130, 30);
        ellipse(-60, 0, 120, 150);
        ellipse(60, 0, 120, 150);
        ellipse(0, 0, 130, 160);

        // stem and leaf
        noStroke();
        fill(80, 120, 50);
        rect(-8, -105, 16, 35);
        ellipse(25, -90, 40, 20);

        popMatrix();
    }

    public void drawLeaf(int x, int y, double s, int r, int g, int b) {
        pushMatrix();
        translate(x, y);
        scale((float) s);

        // leaf body
        stroke(r / 2, g / 2, b / 2);
        strokeWeight(3);
        fill(r, g, b);
        beginShape();
        vertex(0, -80); // tip
        bezierVertex(50, -50, 50, 40, 0, 60); // right edge down to base
        bezierVertex(-50, 40, -50, -50, 0, -80); // left edge back to tip
        endShape(CLOSE);

        // veins
        line(0, -70, 0, 60);
        line(0, -20, 25, -40);
        line(0, -20, -25, -40);
        line(0, 20, 28, 0);
        line(0, 20, -28, 0);

        // stem
        strokeWeight(4);
        line(0, 60, 0, 90);

        popMatrix();
    }

    public void drawAcorn(int x, int y, double s) {
        pushMatrix();
        translate(x, y);
        scale((float) s);

        stroke(90, 50, 20);
        strokeWeight(3);

        // nut
        fill(170, 110, 50);
        ellipse(0, 20, 100, 120);

        // stem
        fill(90, 50, 20);
        rect(-5, -75, 10, 30);

        // cap
        fill(120, 75, 35);
        ellipse(0, -25, 120, 60);

        // cap texture
        line(-30, -35, 30, -35);
        line(-40, -22, 40, -22);

        popMatrix();
    }

    public void drawTree(int x, int y, double s, int r, int g, int b) {
        pushMatrix();
        translate(x, y);
        scale((float) s);

        // trunk
        stroke(70, 40, 20);
        strokeWeight(3);
        fill(110, 70, 40);
        rect(-15, 0, 30, 110);

        // leaves
        stroke(r / 2, g / 2, b / 2);
        fill(r, g, b);
        ellipse(-50, 0, 100, 100);
        ellipse(50, 0, 100, 100);
        ellipse(0, -45, 120, 120);
        ellipse(0, 10, 110, 90);

        popMatrix();
    }

    public void drawHaystack(int x, int y, double s) {
        pushMatrix();
        translate(x, y);
        scale((float) s);

        // bale
        stroke(170, 130, 40);
        strokeWeight(3);
        fill(230, 190, 90);
        rect(-100, -50, 200, 100, 20);

        // straw
        line(-80, -25, -55, -25);
        line(-15, 15, 15, 15);
        line(55, -15, 80, -15);
        line(-75, 25, -50, 25);
        line(50, 30, 75, 30);

        // twine
        stroke(140, 70, 30);
        strokeWeight(4);
        line(-35, -50, -35, 50);
        line(35, -50, 35, 50);

        popMatrix();
    }
}