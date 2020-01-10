public class Point3d {
    /**
     * координаты x,y,z
     **/
    private double xCoord, yCoord, zCoord, distanceXnY, distanceYnZ, distanceXnZ;


    /**
     * Конструктор инициализации
     **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /**
     * Конструктор по умолчанию.
     **/
    public Point3d() {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0, 0);
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
     * измерение расстояний между точками 1 и 2
     **/
    public double distance1n2(Point3d ob1, Point3d ob2) {
        double distance1n2 = 0;
        return distance1n2;

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
                coordZFirstPoint == coordZSecondPoint))
            System.out.println(" Равны первая и вторая точки ");
        {

            if ((coordXSecondPoint == coordXThirdPoint &
                    coordYSecondPoint == coordYThirdPoint &
                    coordZSecondPoint == coordZThirdPoint))
                System.out.println(" Равны вторая и третья точки ");
            {

                if ((coordXFirstPoint == coordXThirdPoint &
                        coordYFirstPoint == coordYThirdPoint &
                        coordZFirstPoint == coordZThirdPoint))
                    System.out.println(" Равны первая и третья точки  ");

            }

        }


        else
        System.out.println(" Точки не равны  ");
    }



/**
        if(ob1.equals(ob2))
            System.out.println(" Равны первая и вторая точки ");
        if (ob2.equals(ob3))
            System.out.println(" Равны вторая и третья точки ");
        if (ob1.equals(ob3))
            System.out.println(" Равны первая и третья точки  ");
        else
            System.out.println(" Точки не равны  ");
*/





    /**
     * измерение расстояний между точками 2 и 3
    **/

        /**
        *  измерение расстояний между точками 1 и 3
        **/







/** метод нахождения площади треугольника */

    public double change_point(Point3d ob1,Point3d ob2,Point3d ob3){

        int x=0;
        return x;
    }

}



