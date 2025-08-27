package Generics;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOneMachine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class IntersectionTypeExample {
    public static <T extends Printer & Scanner> void useDevice(T device) {
        device.print();
        device.scan();
    }

    public static void main(String[] args) {
        AllInOneMachine machine = new AllInOneMachine();
        useDevice(machine);
    }
}