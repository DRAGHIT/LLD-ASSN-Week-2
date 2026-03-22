
class FountainPen extends Pen {

    FountainPen(InkCartridge c) {
        super(c);
    }

    void write(String text) {
        int need = text.length() * 3;

        if (cart.hasInk(need)) {
            System.out.println("fountain writing: " + text);
            cart.useInk(need);
        } else {
            System.out.println("not enough ink (fountain)");
        }
    }
}
