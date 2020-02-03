package Newyear;

abstract class Sweets {
    Chocolate chocolate;
    OtherSweets otherSweets;
    abstract int getWeight();
    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public OtherSweets getOtherSweets() {
        return otherSweets;
    }

    public void setOtherSweets(OtherSweets otherSweets) {
        this.otherSweets = otherSweets;
    }
}
