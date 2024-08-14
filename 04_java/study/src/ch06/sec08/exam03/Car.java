package ch06.sec08.exam03;

public class Car {
    int gas;
    String model;
    boolean full;

    // 다른애들은 get  set 인데 boolean 이니까 is로 주는게 관례임

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

