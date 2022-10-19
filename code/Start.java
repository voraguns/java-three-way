class Start {
    public static void main(String[] args) throws Exception {
        Printer p = new Printer();
        p.start();      // working in another thread
        p.join();
        
        Writer w = new Writer();
        Thread t = new Thread(w);
        t.start();
        t.join();
        
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}

class Printer extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.print("P");
        }
    }
}

class Writer implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) System.out.print("W");
    }
}

