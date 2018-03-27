package primitives;

import primitives.Coordinate;

/**
 * Created by sfogel on 27/03/2018.
 */
public class Point2D implements Comparable<Point2D>
{
    protected Coordinate x;
    protected Coordinate y;

    // ***************** Constructors ********************** //
    public Point2D()
    {
        x = new Coordinate();
        y = new Coordinate();
    }
    public Point2D(Coordinate a , Coordinate b)
    {
        x = new Coordinate(a);
        y = new Coordinate(b);
    }
    public Point2D(Point2D aPoint2D)
    {
        x = aPoint2D.getX();
        y = aPoint2D.getY();
    }

    // ***************** Getters/Setters ********************** //
    public void setX(Coordinate c)
    {
        x = new Coordinate(c);
    }
    public Coordinate getX()
    {
        return new Coordinate(x);
    }
    public void setY(Coordinate c)
    {
        y = new Coordinate(c);
    }
    public Coordinate getY()
    {
        return new Coordinate(y);
    }

    // ***************** Administration  ******************** //
    @Override
    public int compareTo(Point2D aPoint2D)
    {
        if (x.compareTo(aPoint2D.x) == 0 && y.compareTo(aPoint2D.y) == 0)
            return 0;
        return 1;
    }

    // ***************** Operations ******************** //
    @Override
    public String toString()
    {
        return "(" + x.getCoordinate() + ", " + y.getCoordinate() + ")";
    }
}
