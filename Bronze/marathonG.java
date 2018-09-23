// UNFINISHED
// UNFINISHED
// UNFINISHED
// UNFINISHED
// UNFINISHED


class marathon {
    public static void main(String args[]) {
        Point[] points = new point[4];

        points[0] = new Point(0, 0);
        points[1] = new Point(8, 3);
        points[2] = new Point(11, -1);
        points[3] = new Point(10, 0);

        for (int i = 1; i < points.length-1; i++) {
            int d1 = dist(points[i-1], points[i]);
            int d2 = dist(points[i], points[i+1]);
            int d3 = dist(points[i-1], points[i+1]);

            int skippedDistance = (d1 + d2) - d3;
        }
    }
    static int dist(Point a, Point b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - a.x);
    }
}

class Point {
    int x, y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// UNFINISHED