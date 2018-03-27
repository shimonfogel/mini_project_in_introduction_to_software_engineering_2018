package primitives;

/**
 * Created by sfogel on 27/03/2018.
 */
public class Coordinate implements Comparable<Coordinate>
{
    private double coordinate;
    // ***************** Constructors ********************** //
    public Coordinate()
    {
        coordinate = 0.0;
    }
    public Coordinate(double c)
    {
        coordinate = c;
    }
    public Coordinate(Coordinate c)
    {
        coordinate = c.coordinate;
    }
    // ***************** Getters/Setters ********************** //
    public double getCoordinate()
    {
        return coordinate;
    }
    public void setCoordinate(double c)
    {
        coordinate = c;
    }
    // ***************** Administration  ******************** //

    @Override//this means implementing the Comparable Interface (as interface's are virtual classes)
    public int compareTo(Coordinate c)
    {
        return Double.compare(coordinate, c.coordinate);
    }

    // ***************** Operations ******************** //

    // i don't know were this came from why you need it and what it means exactly
    public void add (Coordinate c )
    {
        coordinate += c.coordinate;
    }

    public void subtract(Coordinate c)
    {
        coordinate -= c.coordinate;
    }
}
