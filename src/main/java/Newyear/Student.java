package Newyear;

class Student {
    String name;
    Sweets sweets;

    public int getCW(){
       int c = sweets.chocolate.weight + sweets.otherSweets.weight;
       return c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sweets getSweets() {
        return sweets;
    }

    public void setSweets(Sweets sweets) {
        this.sweets = sweets;
    }
}
