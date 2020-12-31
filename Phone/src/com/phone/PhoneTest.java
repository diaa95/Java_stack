package com.phone;

public class PhoneTest {
    public static void main(String [] args){
        IPhone iPhone = new IPhone("IPhone 6", 89, "Silent", "Reflection");
        Galaxy galaxy = new Galaxy("Galaxy s6", 76, "General", "Over the Horizon");
        System.out.println(iPhone.ring());
        System.out.println(iPhone.unlock());
        System.out.println(galaxy.ring());
        System.out.println(galaxy.unlock());
        iPhone.displayInfo();
        galaxy.displayInfo();
    }
}
