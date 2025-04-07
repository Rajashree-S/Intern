package com.xworkz.cooker.cookerdetails;

public class Cooker {

    private int cookerId;
    private String brand;
    private String capacity;
    private String material;
    private String finishType;

    public void setCookerId(int cookerId){
        this.cookerId = cookerId;
    }
    public int getCookerId(){
        return cookerId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }

    public String getFinishType() {
        return finishType;
    }
}
