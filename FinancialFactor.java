/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1022990
 */
public class FinancialFactor {
    String name;
    double raw;
    double relative;
    double weight;
    
    FinancialFactor(String name){ 
        this.name = name;
        this.weight=(1.0/5);
    }

    public String getName() {
        return name;
    }

    public double getRaw() {
        return raw;
    }

    public double getRelative() {
        return relative;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRaw(double raw) {
        this.raw = raw;
    }

    public void setRelative(double relative) {
        this.relative = relative;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
