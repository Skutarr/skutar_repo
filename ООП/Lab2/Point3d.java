public class Point3d {
    /**
     * координаты x,y,z
     **/
    private double xCoord, yCoord, zCoord, distanceXnY, distanceYnZ, distanceXnZ,compare_result;
    String name="";

    /**
     * Конструктор инициализации
     **/
    public Point3d(double x, double y, double z,String name) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
        this.name = name;

    }

    /**
     * Конструктор по умолчанию.
     **/
    public Point3d() {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0, 0,"new point");
    }

    /**
     * Возвращение координаты X
     **/
    public double getX() {
        return xCoord;
    }

    /**
     * Возвращение координаты Y
     **/
    public double getY() {
        return yCoord;
    }

    /**
     * Возвращение координаты Z
     **/
    public double getZ() {
        return zCoord;
    }

    /**
     * Установка значения координаты X.
     **/
    public void setX(double val) {
        xCoord = val;
    }

    /**
     * Установка значения координаты Y.
     **/
    public void setY(double val) {
        yCoord = val;
    }

    /**
     * Установка значения координаты Z.
     **/
    public void setZ(double val) {
        zCoord = val;
    }

    /**
     * Вычисление расстояния между точками X и Y.(кривое)
     **/
    public double distanceXY() {
        double varDif;

        if (xCoord <= yCoord) {
            varDif = xCoord - yCoord;
        }
        varDif = yCoord - xCoord;

        return varDif;
    }

    /**
     * Вычисление расстояния между точками Y и Z.(кривое)
     **/
    public double distanceYZ() {
        double varDif;

        if (yCoord <= zCoord) {
            varDif = yCoord - zCoord;
        }
        varDif = zCoord - yCoord;

        return varDif;
    }

    /**
     * Вычисление расстояния между точками X и Z.(кривое)
     **/
    public double distanceXZ() {
        double varDif;

        if (xCoord <= zCoord) {
            varDif = xCoord - zCoord;
        }
        varDif = zCoord - xCoord;

        return varDif;
    }



    /**
     * сравнение точек
     **/
    public void comparePoints(Point3d ob1, Point3d ob2, Point3d ob3) {
        double coordXFirstPoint = ob1.getX();
        double coordYFirstPoint = ob1.getY();
        double coordZFirstPoint = ob1.getZ();

        double coordXSecondPoint = ob2.getX();
        double coordYSecondPoint = ob2.getY();
        double coordZSecondPoint = ob2.getZ();

        double coordXThirdPoint = ob3.getX();
        double coordYThirdPoint = ob3.getY();
        double coordZThirdPoint = ob3.getZ();

        if ((coordXFirstPoint == coordXSecondPoint &
                coordYFirstPoint == coordYSecondPoint &
                coordZFirstPoint == coordZSecondPoint)) {

            if ((coordXSecondPoint == coordXThirdPoint &
                    coordYSecondPoint == coordYThirdPoint &
                    coordZSecondPoint == coordZThirdPoint)) {

                if ((coordXFirstPoint == coordXThirdPoint &
                        coordYFirstPoint == coordYThirdPoint &
                        coordZFirstPoint == coordZThirdPoint)) {
                    this.compare_result=1;
                    System.out.println(" Совпали точки  "+ob1.name+"    и   "+ob3.name);
                }
                this.compare_result=1;
                System.out.println("Совпали точки   "+ob2.name+"    и   "+ob3.name);
            }
            this.compare_result=1;
            System.out.println(" Совпали точки   "+ob1.name+"    и   "+ob2.name);
        }

        else if ((coordXSecondPoint == coordXThirdPoint &
                coordYSecondPoint == coordYThirdPoint &
                coordZSecondPoint == coordZThirdPoint)) {

            if ((coordXFirstPoint == coordXThirdPoint &
                    coordYFirstPoint == coordYThirdPoint &
                    coordZFirstPoint == coordZThirdPoint)) {
                System.out.println(" Совпали точки   "+ob1.name+"    и   "+ob3.name);
                this.compare_result=1;
            }
            this.compare_result=1;
            System.out.println(" Совпали точки   "+ob2.name+"    и   "+ob3.name);
        }

        else if ((coordXFirstPoint == coordXThirdPoint &
                coordYFirstPoint == coordYThirdPoint &
                coordZFirstPoint == coordZThirdPoint)) {
            System.out.println(" Совпали точки   "+ob1.name+"    и   "+ob3.name);
            this.compare_result=1;
        }

        else {

            this.compare_result = 0;
            System.out.println(" Точки не совпали  ");
        }
    }


    /**
     * измерение расстояний между точками
     **/
    public double distance1n2(Point3d ob1, Point3d ob2) {
        double x1,x2,y1,y2,z1,z2,distance1n2;
        /**инициализация координат + математические операции для формулы нахождения
         * расстояния между 3D точками**/
        x1=ob1.getX();
        x2=ob2.getX();
        y1=ob1.getY();
        y2=ob2.getY();
        z1=ob1.getZ();
        z2=ob2.getZ();

        double polX2_X1=Math.pow((x2-x1),2);
        double polY2_Y1=Math.pow((y2-y1),2);
        double polZ2_Z1=Math.pow(z2-z1,2);
        double Sum=polX2_X1+polY2_Y1+polZ2_Z1;
        distance1n2=(Math.rint(Math.sqrt(Sum)*100))/100;

        if (ob1.compare_result==0) {
            System.out.println("Расстояние между точками    "+ob1.name+"    и   "+ob2.name+"    равно   " + distance1n2);
            return distance1n2;

        }
        else {
            System.out.println("Координаты точек совпали ");
            return 0;
        }
    }



    /** расчет площади треугольника по теореме Герона  */

    public double triangle_area(Point3d ob1,Point3d ob2,Point3d ob3){
        double distance1n2,distance2n3,distance1n3;

        double x1=ob1.getX();
        double x2=ob2.getX();
        double x3=ob3.getX();

        double y1=ob1.getY();
        double y2=ob2.getY();
        double y3=ob3.getY();

        double z1=ob1.getZ();
        double z2=ob2.getZ();
        double z3=ob3.getZ();

        /**Расчет расстояния между точками 1 и 2 **/
        double polX2_X1=Math.pow((x2-x1),2);
        double polY2_Y1=Math.pow((y2-y1),2);
        double polZ2_Z1=Math.pow(z2-z1,2);
        double Sum1n2=polX2_X1+polY2_Y1+polZ2_Z1;
        distance1n2=(Math.rint(Math.sqrt(Sum1n2)*100))/100;
        if (compare_result==0)
            System.out.println("Расстояние между точками    "+ob1.name+"    и   "+ob2.name+"    равно   " + distance1n2);

        /**Расчет расстояния между точками 2 и 3 **/
        double polX2_X3=Math.pow((x3-x2),2);
        double polY2_Y3=Math.pow((y3-y2),2);
        double polZ2_Z3=Math.pow(z3-z2,2);
        double Sum2n3=polX2_X3+polY2_Y3+polZ2_Z3;
        distance2n3=(Math.rint(Math.sqrt(Sum2n3)*100))/100;
        if (compare_result==0)
            System.out.println("Расстояние между точками    "+ob2.name+"    и   "+ob3.name+"    равно   " + distance2n3);

        /**Расчет расстояния между точками 1 и 3 **/
        double polX1_X3=Math.pow((x3-x1),2);
        double polY1_Y3=Math.pow((y3-y1),2);
        double polZ1_Z3=Math.pow(z3-z1,2);
        double Sum1n3=polX1_X3+polY1_Y3+polZ1_Z3;
        distance1n3=(Math.rint(Math.sqrt(Sum1n3)*100))/100;
        if (compare_result==0)
            System.out.println("Расстояние между точками    "+ob1.name+"    и   "+ob3.name+"    равно   " + distance1n3);

        /**Расчет полупериметера **/
        double half_perimeter=(distance1n2+distance1n3+distance2n3)/2;
        /**Расчет площади**/
        double triangle_area=Math.sqrt(half_perimeter*(half_perimeter-distance1n2)*(half_perimeter-distance1n3)*(half_perimeter-distance2n3));
        double roundArea=(Math.rint(triangle_area*100))/100;

        if (compare_result==0) {
            System.out.println("Площадь треугольника , образованного точками    " + ob1.name + " , " + ob2.name + "    и   " + ob3.name + " равна  " + roundArea);
            return triangle_area;
        }
        else {
            System.out.println("Площадь треугольника не может быть рассчитана ,т.к. точки совпали !");

            return 0;
        }
    }

}





