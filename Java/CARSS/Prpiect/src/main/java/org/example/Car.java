package org.example;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

public class Car {
    private String brand;
    private String model;
    private  Boolean transmision;
    private String color;


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

    public Boolean getTransmision() {
        return transmision;
    }

    public void setTransmision(Boolean transmision) {
        this.transmision = transmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public JsonOject toJsonObject(){
        JsonObject jo = new JsonObject();
        jo.put("brand", brand);
        jo.put("model", model);
        jo.put("transmision",transmision);
        jo.put("color", color);
        return jo;
    }

}
