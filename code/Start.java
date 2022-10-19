class Start {
    public static void main(String[] args) {
        Car c = new Car();
        c.weight = 1572.0;
        c.serial = "GHSK-523566";
        System.out.println(c instanceof Car);    // true
        System.out.println(c instanceof Vehicle);    // true
        
        int count = 0;
        
        Vehicle[] a = { new Car(), new Truck(), new Car(),
                        new Car(), new Car(), new Truck(),
                        new Car(), new Truck(), new Truck()
                       };
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Car) {
                count++;
            }
        }
        System.out.println("Count : " + count);
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