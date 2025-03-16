public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("Initial: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}