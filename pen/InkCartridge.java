
class InkCartridge {

    int inkLevel;
    int maxInk;
    String color;

    InkCartridge(int maxInk, String color) {
        this.maxInk = maxInk;
        this.inkLevel = maxInk;
        this.color = color;
    }

    boolean hasInk(int amt) {
        return inkLevel >= amt;
    }

    void useInk(int amt) {
        if (inkLevel >= amt) {
            inkLevel -= amt;
        }
    }

    void refill(String newColor) {
        inkLevel = maxInk;
        color = newColor;
        System.out.println("refilled with " + newColor);
    }
}
