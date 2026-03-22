
public class Main {

    public static void main(String[] args) {

        InkCartridge c1 = new InkCartridge(100, "blue");

        Pen p1 = new FountainPen(c1);
        p1.write("hello");
        p1.seeInk();

        c1.refill("black");
        p1.seeInk();

        Pen p2 = new GelPen(new InkCartridge(100, "blue"));
        p2.write("world");

        Pen p3 = new BallPen(new InkCartridge(100, "black"));
        p3.write("ok");
    }
}
