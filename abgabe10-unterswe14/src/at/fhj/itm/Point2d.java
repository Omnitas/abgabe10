package at.fhj.itm;

import java.io.PrintStream;

class Point2d {
    protected double x;
    protected double y;
    private boolean debug;

    public Point2d(double px, double py) {
        this.x = px;
        this.y = py;
        this.debug = false;
    }

    public Point2d() {
        this(0.0, 0.0);
    }

    public Point2d(Point2d pt) {
        this.x = pt.getX();
        this.y = pt.getY();
    }

    public void dprint(String s) {
        if (this.debug) {
            System.out.println("Debug: " + s);
        }
    }

    public void setDebug(boolean b) {
        this.debug = b;
    }

    public void setX(double px) {
        this.dprint("setX(): Changing value of X from " + this.x + " to " + px);
        this.x = px;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double py) {
        this.dprint("setY(): Changing value of Y from " + this.y + " to " + py);
        this.y = py;
    }

    public double getY() {
        return this.y;
    }

    public void setXY(double px, double py) {
        this.setX(px);
        this.setY(py);
    }

    public double distanceFrom(Point2d pt) {
        double dx = Math.abs(this.x - pt.x);
        double dy = Math.abs(this.y - pt.getY());
        this.dprint("distanceFrom(): deltaX = " + dx);
        this.dprint("distanceFrom(): deltaY = " + dy);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceFromOrigin() {
        return this.distanceFrom(new Point2d());
    }

    public String toString() {
        String pt_str = "(" + this.x + ", " + this.y + ")";
        return pt_str;
    }
}
	