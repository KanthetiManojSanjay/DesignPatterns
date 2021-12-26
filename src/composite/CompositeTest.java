package composite;

/**
 * @author kansanja on 18/12/21.
 */
public class CompositeTest {
    public static void main(String[] args) {

        // we can get price of leaf object like mouse & composite object like Motherboard - Object in tree structure
        Component hd = new Leaf(4000, "SSD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(9000, "CPU");

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        mb.addComponent(ram);
        mb.addComponent(cpu);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

//        ram.showPrice();
//        ph.showPrice();

        computer.showPrice();

    }
}
