package Newyear;

class Chocolate extends Sweets {
    String Cname;
    int weight;
    int cost;

    int getWeight(){
        return weight;
    }
    int getCost(){
        return cost;
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
