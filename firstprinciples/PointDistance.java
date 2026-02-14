class Point {
    int x, y;

    Point(int x, int y) { // It is a constructor
        this.x = x;
        this.y = y;
    }

    /* M1 */ float distance(int x, int y) { // One definition of distance
        int dx = this.x - x;
        int dy = this.y - y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    /* M2 */ float distance(Point p) { // Overloaded definition of distance .
        return distance(p.x, p.y);
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) { // Constructor of Point3D
        super(x, y);
        this.z = z;
    }

    /* M3 */ float distance(int x, int y, int z) { // Another definition of distance
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    /* M4 */ float distance(Point3D pt) {
        return distance(pt.x, pt.y, pt.z);
    }
}

class PointDistance {
    public static void main(String args[]) {
        Point p1 = new Point(10, 5); // 2-D point
        Point p3 = new Point3D(5, 10, 5); // 3-D point
        Point p2 = new Point(4, 1); // another 2-D point
        Point p4 = new Point3D(2, 3, 4); // another 3-D point
        float d0 = p1.distance(0, 0); // M1 will be referred
        float d1 = p1.distance(p2); // M2 will be referncd
        System.out.println("Distance from P2 to Origin = " + d0);
        System.out.println(" Distance from P2 to P1 = " + d1);
        d1 = p4.distance(p3); // M4 will be referred
        System.out.println("Distance from P3 to P4= " + d1);
    }
}
