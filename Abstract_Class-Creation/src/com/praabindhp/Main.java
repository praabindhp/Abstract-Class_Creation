package com.praabindhp;
abstract class Shape
{
    int a=3,b=4;
    abstract public void print_area();
}
class Rectangle extends Shape
{
    public int area_rect;

    public void print_area()
    {
        area_rect=a*b;
        System.out.println("The Area of Rectangle is:"+area_rect);
    }
}
class Triangle extends Shape
{
    public int area_tri;

    public void print_area()
    {
        area_tri= (int) (0.5*a*b);
        System.out.println("The Area of Triangle is:"+area_tri);
    }
}
class Circle extends Shape
{
    public int area_cir;

    public void print_area()
    {
        area_cir= (int) (3.14*a*a);
        System.out.println("The Area of Circle is:"+area_cir);
    }
}
class Demo
{
    public static void main(String[] arg)
    {
        Shape s;
        s=new Rectangle();
        s. print_area();
        s=new Triangle();
        s.print_area();
        s=new Circle();
        s.print_area();
    }
}