package com.phone;

public class IPhone extends Phone implements Ringable{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Version Number: "+ this.getVersionNumber()+", batteryPercentage: "+ this.getBatteryPercentage()+", Carrier: "+this.getCarrier() + ", Ring Tone: "+ this.getRingTone());
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Swipe right";
    }
}
