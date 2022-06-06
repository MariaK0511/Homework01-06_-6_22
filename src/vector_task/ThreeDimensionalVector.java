package vector_task;

public class ThreeDimensionalVector extends TwoDimensionalVector {


    double x3, y3, z3;
    final String getDescriptionVector = "Это вектор для трехмерной системы координат";

    public ThreeDimensionalVector(double x, double y, double z, double x2, double y2, double z2, double x3, double y3, double z3) {
        super(x, y, z, x2, y2, z2);
        this.x3 = x3;
        this.y3 = y3;
        this.z3 = z3;
    }

    public ThreeDimensionalVector(double x, double y, double z, double x2, double y2, double z2) {
        super(x, y, z, x2, y2, z2);
    }

    @Override
    public double getVectorLength() {
        return Math.sqrt(x3 * x3) + Math.sqrt(y3 * y3) + Math.sqrt(z3 * z3);
    }

    @Override
    public double getScalarMultiplicationVector(Vector vector) {
        return ((x2 * vector.x - x3 * vector.x) +
                (y2 * vector.y - y3 * vector.y) +
                (z2 * vector.z - z3 * vector.z));
    }

    @Override
    public Vector getSumVectors(Vector vector) {
        return new Vector(
                (x2 + vector.x - x3 + vector.x),
                (y2 + vector.y - y3 + vector.y),
                (z2 + vector.z - z3 + vector.z));
    }

    @Override
    public Vector getDifferenceVector(Vector vector) {
        return new Vector(
                ((x2 - vector.x) - (x3 - vector.x)),
                ((y2 - vector.y) - (y3 - vector.y)),
                ((z2 - vector.z) - (z3 - vector.z)));
    }

    public static ThreeDimensionalVector[] getRandomVectors(int n) {
        ThreeDimensionalVector[] vector = new ThreeDimensionalVector[n];
        for (int index = 0; index < vector.length; index++) {
            vector[index] = new ThreeDimensionalVector(Math.random(), Math.random(), Math.random(),
                    Math.random(), Math.random(), Math.random());
        }
        return vector;
    }
    public void comparisonVector(ThreeDimensionalVector vector) {
        if (vector.x == x || vector.y == y || vector.z == z
                || vector.x2 == x2 || vector.y2 == y2 || vector.z2 == z2
                || vector.x3 == x3 || vector.y3 == y3 || vector.z3 == z3) {
            System.out.println("Координаты векторов 1 и 2 равны: " + this + " " + vector);

        } else {
            System.out.println("Координаты векторов 1 и 2 не равны: " + this + " " + vector);
        }
    }

    @Override
    public String toString() {
        return "ThreeDimensionalVector{" +
                "x3=" + x3 +
                ", y3=" + y3 +
                ", z3=" + z3 +
                ", getDescriptionVector='" + getDescriptionVector + '\'' +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", z2=" + z2 +
                ", getDescriptionVector='" + getDescriptionVector + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

