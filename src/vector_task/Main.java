package vector_task;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создайте класс, который описывает вектор в двумерной системе координат. +
Создайте класс, который описывает вектор в трехмерной системе координат.
У каждого класса должны быть:
- конструктор с параметрами в виде списка координат (например, х, y. z); +
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt(); +
- метод, вычисляющий скалярное произведение; +
- метод сложения векторов;+
- метод разности векторов;+
- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N. +
Предусмотреть метод сравнение векторов. +
Предусмотреть метод для вывода информации о векторе. +
Каждый из классов должен иметь константу, содержащую описание вектора
Например, "Это вектор для двумерной системы координат".
Эта константа также должна выводиться в методе для вывода информации о векторе.
         */

        Vector vector = new Vector(Math.random(), Math.random(), Math.random());
        Vector vector2 = new Vector(Math.random(), Math.random(), Math.random());
        System.out.println("Длина вектора: " + vector.getVectorLength());
        System.out.println("Cкалярное произведение двух векторов: " + vector.getScalarMultiplicationVector(vector2));
        System.out.println("Сумма векторов: " + vector.getSumVectors(vector2));
        System.out.println("Разность векторов: " + vector.getDifferenceVector(vector2));
        System.out.println("Массив случайных векторов: " + Arrays.toString(Vector.getRandomVectors(3)));
        vector.comparisonVector(vector2);

        TwoDimensionalVector twoDimensionalVector = new TwoDimensionalVector(Math.random(), Math.random(), Math.random(), Math.random(),
                Math.random(), Math.random());
        TwoDimensionalVector twoDimensionalVector2 = new TwoDimensionalVector(Math.random(), Math.random(), Math.random(), Math.random(),
                Math.random(), Math.random());
        System.out.println("Длина вектора: " + twoDimensionalVector.getVectorLength());
        System.out.println("Cкалярное произведение двух векторов: " + twoDimensionalVector.getScalarMultiplicationVector(twoDimensionalVector2));
        System.out.println("Сумма векторов: " + twoDimensionalVector.getSumVectors(twoDimensionalVector2));
        System.out.println("Разность векторов: " + twoDimensionalVector.getDifferenceVector(twoDimensionalVector2));
        System.out.println("Массив случайных векторов: " + Arrays.toString(TwoDimensionalVector.getRandomVectors(3)));
        twoDimensionalVector.comparisonVector(twoDimensionalVector2);

        ThreeDimensionalVector threeDimensionalVector = new ThreeDimensionalVector(Math.random(), Math.random(), Math.random(), Math.random(),
                Math.random(), Math.random(), Math.random(), Math.random(), Math.random());
        ThreeDimensionalVector threeDimensionalVector2 = new ThreeDimensionalVector(Math.random(), Math.random(), Math.random(), Math.random(),
                Math.random(), Math.random(), Math.random(), Math.random(), Math.random());
        System.out.println("Длина вектора: " + threeDimensionalVector.getVectorLength());
        System.out.println("Cкалярное произведение двух векторов: " + threeDimensionalVector.getScalarMultiplicationVector(threeDimensionalVector2));
        System.out.println("Сумма векторов: " + threeDimensionalVector.getSumVectors(threeDimensionalVector2));
        System.out.println("Разность векторов: " + threeDimensionalVector.getDifferenceVector(threeDimensionalVector2));
        System.out.println("Массив случайных векторов: " + Arrays.toString(ThreeDimensionalVector.getRandomVectors(3)));
        threeDimensionalVector.comparisonVector(threeDimensionalVector2);


    }


}
