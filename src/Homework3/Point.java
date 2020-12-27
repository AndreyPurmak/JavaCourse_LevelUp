package Homework3;

public class Point {
    public static void main(String[] args) {

        Point pointA = new Point(11, 22);
        pointA.flip(25,-14);
        System.out.println(pointA.x + " " + pointA.y + " ");

        pointA.flip(-7, -3);
        System.out.println(pointA.x + " " + pointA.y + " ");

        pointA.flip(0,0);
        System.out.println(pointA.x + " " + pointA.y + " ");
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    private void flip(int x, int y) {
            this.x = - x;
            this.y = - y;
        }
    }