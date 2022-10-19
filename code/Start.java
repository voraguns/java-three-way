class Start {
    public static void main(String[] args) {
        int cmp = "Latte".compareTo("Cappucino");
        System.out.println(cmp);
    }
}

class Vehicle {
    double weight;
    String serial;
}

class Car extends Vehicle {
    
}

class Truck extends Vehicle {
    int wheels;
}