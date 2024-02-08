/**
 * The Area class contains methods to calculate the area of a triangle and a square.
 */
class Area
{
    /**
     * The function calculates the area of a triangle given its base and height.
     * 
     * @param base The base of the triangle, which is the length of one of its sides.
     * @param height The height of the triangle.
     * @return the area of a triangle, which is calculated by multiplying the base by the height and
     * then dividing the result by 2.
     */
    double area_0f_triangle(double base, double height)
    {
        return(0.5*base*height);
    }

    /**
     * The function calculates the area of a square given the length of its side.
     * 
     * @param side The side parameter represents the length of one side of the square.
     * @return the area of a square, which is calculated by multiplying the length of one side by
     * itself.
     */
    double area_of_square(double side)
    {
        return(side*side);
    }

}