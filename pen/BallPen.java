
class BallPen extends Pen {

    BallPen(InkCartridge c) {
        super(c);
    }

    void write(String text) {
        int need = text.length();

        if (cart.hasInk(need)) {
            System.out.println("ball writing: " + text);
            cart.useInk(need);
        } else {
            System.out.println("not enough ink (ball)");
        }
    }
}
