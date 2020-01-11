public class Lab1 {
    double area;

    public static void main(String[] args) {

        /**
         * СОздание объектов класса
         **/
        Point3d first3dPoint = new Point3d(3, 1, 13,"first3dPoint");
        Point3d second3dPoint = new Point3d(7, 21, 3,"second3dPoint");
        Point3d third3dPoint = new Point3d(13, 1, 13,"third3dPoint");

        /**
         * Сравнение объектов класса
         **/
        first3dPoint.comparePoints(first3dPoint,second3dPoint,third3dPoint);

        /**
         * Расчет расстояний между точками
         **/
        // first3dPoint.distance1n2(first3dPoint,third3dPoint);

        /**
         * Расчет площади треугольника , образованного объектами
         **/
        first3dPoint.triangle_area(first3dPoint,second3dPoint,third3dPoint);
    }

    /** static double compureArea() {
     double area1;
     Point3d newfirst3dPoint = new Point3d(1, 2, 3);
     Point3d newsecond3dPoint = new Point3d(4, 5, 6);
     Point3d newthird3dPoint = new Point3d(9, 8, 7);
     **/

}



