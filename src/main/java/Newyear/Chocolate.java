package Newyear;

class Chocolate extends Sweets {
    String Cname;
    int weight;

    int getWeight(){
        return weight;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
