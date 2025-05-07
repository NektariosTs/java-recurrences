package repeat.chapters.chapter14;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
//        super(); //constructor chaining kanei o 3d ton 2d kai o 2d kalei ton point
//        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D(double x, double y) {
        super(x, y);
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + z + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + z + ")";
//    }
}
