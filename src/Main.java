public class Main {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println(p);

        MovablePoint mp = new MovablePoint(1,2,3,4);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
    }
}
