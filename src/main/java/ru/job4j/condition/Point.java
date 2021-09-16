package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2, 4);
        Point b = new Point(0, 3, 10);
        Point c = new Point(6, 6, 6);
        double rslAB = a.distance3d(b);
        double rslAC = a.distance3d(c);
        double rslBC = b.distance3d(c);
        System.out.println(rslAB + " " + rslAC + " " + rslBC);
    }
}