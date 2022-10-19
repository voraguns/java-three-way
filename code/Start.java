class Start {
    public static void main(String[] args) {
        Taxable[] a = { new Book(), new Ebook(), new Book(),
                        new Ebook(), new Ebook()
                       };
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += a[i].getTax();
        }
        System.out.println(total);
    }
}

interface Taxable {
    // double getTax();
    default double getTax() {
        return 5.0;
    }
}

class Book implements Taxable {
    double price;
    public double getTax() {
        return price * 0.01;
    }
}

class Ebook implements Taxable {
    public double getTax() {
        return 15.0;
    }
}