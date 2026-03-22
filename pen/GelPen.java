
class GelPen extends Pen {

    GelPen(InkCartridge c) {
        super(c);
    }

    void write(String text) {
        int need = text.length() * 2;

        if (cart.hasInk(need)) {
            System.out.println("gel writing: " + text);
            cart.useInk(need);
        } else {
            System.out.println("not enough ink (gel)");
        }
    }
}
