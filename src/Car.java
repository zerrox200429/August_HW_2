public abstract class Car {
private Rule rule;
private Wheel wheel;
private String nameOfCar;

    public Car(Rule rule, Wheel wheel, String nameOfCar) {
        this.setRule(rule);
        this.setWheel(wheel);
        this.setNameOfCar(nameOfCar);
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }
}
