package com.company;

import java.util.Arrays;
import java.util.Vector;

public class DescriptionOfVector {

  public static void main(String[] args) {

    Vector[] vector = Vector.generate(10);
  }

  public static class Vector {

    public static Vector[] generate;
    private double x; //Три параметра, с которыми нужно работать в следующих методах;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public double length() { //Длина вектора - корень суммы квадратов элементов вектора.
      return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarMultiplication(Vector vector) { //Скалярное произведение;
      return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossMultiplication(Vector vector) { //Векторное произведение;
      return new Vector(y * vector.z - z * vector.y,
          z * vector.x - x * vector.z,
          x * vector.y - y * vector.x);
    }

    public double cos(Vector vector) { //Косинус угла между векторами;
      return scalarMultiplication(vector) / (length() * vector.length());
    }

    public Vector summ(Vector vector) { //Сумма векторов;
      return new Vector(x + vector.x,
          y + vector.y,
          z + vector.z);
    }

    public Vector substruction(Vector vector) { //Вычитание векторов;
      return new Vector(x - vector.x,
          y - vector.y,
          z - vector.z);

    }

    public static Vector[] generate(int n) {
      Vector[] vector = new Vector[n];
      for (int i = 0; i < n; i++) {
        vector[i] = new Vector(Math.random(), Math.random(), Math.random());
      }
      return vector;
    }

  }
}



