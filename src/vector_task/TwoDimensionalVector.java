package vector_task;

public class TwoDimensionalVector extends Vector {
    double x2, y2, z2;
    final String getDescriptionVector = "Это вектор для двумерной системы координат";

    public TwoDimensionalVector(double x, double y, double z, double x2, double y2, double z2) {
        super(x, y, z);
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    @Override
    public double getVectorLength() {
        return Math.sqrt(x2 * x2) + Math.sqrt(y2 * y2) + Math.sqrt(z2 * z2);
    }

    @Override
    public double getScalarMultiplicationVector(Vector vector) {
        return ((x * vector.x - x2 * vector.x) +
                (y * vector.y - y2 * vector.y) +
                (z * vector.z - z2 * vector.z));
    }

    @Override
    public Vector getSumVectors(Vector vector) {
        return new Vector(
                (x + vector.x - x2 + vector.x),
                (y + vector.y - y2 + vector.y),
                (z + vector.z - z2 + vector.z));
    }

    @Override
    public Vector getDifferenceVector(Vector vector) {
        return new Vector(
                ((x - vector.x) - (x2 - vector.x)),
                ((y - vector.y) - (y2 - vector.y)),
                ((z - vector.z) - (z2 - vector.z)));
    }

    public void comparisonVector(TwoDimensionalVector vector) {
        if (vector.x == x || vector.y == y || vector.z == z || vector.x2 == x2 || vector.y2 == y2 || vector.z2 == z2) {
            System.out.println("Координаты векторов 1 и 2 равны: " + this + " " + vector);

        } else {
            System.out.println("Координаты векторов 1 и 2 не равны: " + this + " " + vector);
        }
    }

    public static TwoDimensionalVector[] getRandomVectors(int n) {
        TwoDimensionalVector[] vector = new TwoDimensionalVector[n];
        for (int index = 0; index < vector.length; index++) {
            vector[index] = new TwoDimensionalVector(Math.random(), Math.random(), Math.random(),
                    Math.random(), Math.random(), Math.random());
        }
        return vector;
    }

    @Override
    public String toString() {
        return "TwoDimensionalVector{" +
                "x2=" + x2 +
                ", y2=" + y2 +
                ", z2=" + z2 +
                ", getDescriptionVector='" + getDescriptionVector + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
