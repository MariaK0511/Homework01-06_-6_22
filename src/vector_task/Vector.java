package vector_task;

import java.util.Random;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVectorLength() {
        return Math.sqrt(x * x) + Math.sqrt(y * y) + Math.sqrt(z * z);
    }

    public double getScalarMultiplicationVector(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector getSumVectors(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getDifferenceVector(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }


    public static Vector[] getRandomVectors(int n) {
        Vector[] vector = new Vector[n];
        for (int index = 0; index < vector.length; index++) {
            vector[index] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector;
    }

    public void comparisonVector(Vector vector) {
        if (vector.x == x || vector.y == y || vector.z == z) {
            System.out.println("Координаты векторов 1 и 2 равны: " + this + " " + vector);

        } else {
            System.out.println("Координаты векторов 1 и 2 не равны: " + this + " " + vector);
        }
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
