public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;
    String name;
    public Flower(String name,String flowerColor,String country, double cost,int lifeSpan) {
        this.name = name;
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

    }



    public String toString() {
        return name + ", страна происхождения " + getCountry() + ", цвет " + getFlowerColor() + ", стоимость за штуку: "
                + getCost() + " рублей," + " срок стояния — " + lifeSpan + " дней.";

    }
}
