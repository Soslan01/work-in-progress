import java.util.ArrayList;

public class BoxWithFigures {

  class Figure {//СуперКЛасс;

    private double volume;//Объем;

    public Figure(double volume) {//Создание объекта с определенным объемом;
      this.volume = volume;
    }

    public double getVolume() {
      return volume;
    }
  }

  class Form extends Figure {

    private double radius;

    public Form(double volume, double radius) {
      super(volume);
      this.radius = radius;
    }

    public double getRadius() {
      return radius;
    }
  }

  //Далее создаем сами объекты - фигуры;
  class Ball extends Form {

    public Ball(double radius) {
      //Math.PI(число ПИ), Math.pow(возведение в степень);
      super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
      //Рассчет объема Шара;
    }
  }

  class Cylinder extends Form {

    private double height;

    public Cylinder(double radius, double height) {
      super(Math.PI * radius * radius * height, radius);
      this.height = height;
    }
  }

  class Pyramid extends Form {

    private double height;
    private double s;//Площадь основания;

    public Pyramid(double height, double s) {
      super(height * s * 4 / 3);
      this.height = height;
      this.s = s;
    }
  }

  //Здесь необходимо реализовать саму коробку, в которой будут храниться эти фигуры;
  class Box extends Form {

    private ArrayList<Form> figures = new ArrayList<>();
    private static double available;

    //Доступный объем коробки, который будет сравниваться с объемом фигур, которые
    //нужно поместить в него;
    public Box(double available) {
      super(available);
      this.available = available;
    }

    public boolean add(Figure figure){
      if (available >= figure.getVolume()){
        Box.add(figure);
        available -= figure.getVolume();
        return true;
      }else{
        return false;
      }
    }
  }

  public static void main(String[] args) {

    Ball ball = new Ball(4.5);
    Cylinder cylinder = new Cylinder(2,3,);
    Pyramid pyramid = new Pyramid(50,50);

    Box box = new Box(1000);

    System.out.println(box.add);

  }
}


