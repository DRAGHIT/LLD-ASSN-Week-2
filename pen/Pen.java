
class Pen {

    InkCartridge cart;

    Pen(InkCartridge c) {
        this.cart = c;
    }

    void seeInk() {
        System.out.println("Ink: " + cart.inkLevel + "/" + cart.maxInk + " color: " + cart.color);
    }

    void write(String text) {
        int need = text.length();
        if (cart.hasInk(need)) {
            System.out.println("writing: " + text);
            cart.useInk(need);
        } else {
            System.out.println("no ink");
        }
    }
}
