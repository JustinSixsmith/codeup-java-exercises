package Warmup;

public class Phone {
    private String brand;
    private String model;
    private String type;


    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.type = "undefined";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
