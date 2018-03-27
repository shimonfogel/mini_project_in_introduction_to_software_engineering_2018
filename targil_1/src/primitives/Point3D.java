package primitives;

import primitives.Coordinate;
/**
 * Created by sfogel on 27/03/2018.
 */
public class Point3D extends Point2D
{
    private Coordinate z;

    // ***************** Constructors ********************** //
    public Point3D()
    {
        z = new Coordinate();
    }
    public Point3D(Coordinate a, Coordinate b, Coordinate c)
    {
        super(a,b);
        z = new Coordinate(c);
    }
    public Point3D(double a, double b, double c)
    {
        super(new Coordinate(a),new Coordinate(b));
        z = new Coordinate(c);
    }
    public Point3D(Point3D aPoint3D)
    {
        super(aPoint3D.getX(),aPoint3D.getY());
        z = aPoint3D.getZ();
    }

    // ***************** Getters/Setters ********************** //
    public void setZ(Coordinate c)
    {
        z = new Coordinate(c);
    }
    public Coordinate getZ()
    {
        return new Coordinate(z);
    }

    // ***************** Administration  ******************** //

    public int compareTo(Point3D point3D)
    {
        if (((Point2D)this).compareTo((Point2D)point3D) == 0)
            if (z.compareTo(point3D.z) == 0)
                return 0;
        return 1;
    }

    public String toString()
    {
        return "(" + x.getCoordinate() + ", " +
                y.getCoordinate() + ", " +
                z.getCoordinate() + ")";
    }
}
