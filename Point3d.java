public class Point3d {
    /**
     * координаты x,y,z
     **/
    private double xCoord, yCoord, zCoord, distanceXnY, distanceYnZ,distanceXnZ;


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
 *  Вычисление расстояния между точками X и Y.
 **/
    public double distanceXY() {
        double varDif;

        if (xCoord<=yCoord) {
            varDif = xCoord - yCoord;
        }
        varDif=yCoord-xCoord;

        return varDif;}
    /**
     *  Вычисление расстояния между точками Y и Z.
     **/
    public double distanceYZ() {
        double varDif;

        if (yCoord<=zCoord) {
             varDif = yCoord - zCoord;
        }
        varDif=zCoord-yCoord;

        return varDif;
    }
    /**
     *  Вычисление расстояния между точками X и Z.
     **/
    public double distanceXZ() {
        double varDif;

        if (xCoord<=zCoord) {
            varDif = xCoord - zCoord;
        }
        varDif=zCoord-xCoord;

        return varDif;}

    /**
     * сравнение
     **/
    public boolean comparePoints(double x, double y,double z) {
        return this.equals(new Point3d(x, y, z));
    }

}



