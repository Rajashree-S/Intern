class Switch {

    Switch() {
        this("Mechanical", 100);
    }

    Switch(String type, int capacity) {
        this(200.0);
        this.type = type;
        this.capacity = capacity;
    }

    Switch(double voltage) {
        this("Standard", "Metal");
        this.voltage = voltage;
    }

    Switch(String design, String material) {
        this(10, 5);
        this.design = design;
        this.material = material;
    }

    Switch(int numOfContacts, int durability) {
        this(50);
        this.numOfContacts = numOfContacts;
        this.durability = durability;
    }

    Switch(String brand) {
        this(100);
        this.brand = brand;
    }

    Switch(int id) {
        this.id = id;
    }

    int id;
    String brand;
    int numOfContacts;
    int durability;
    double voltage;
    String material;
    String design;
    int capacity;
    String type;

    public void switchDetails() {
        System.out.println(id);
        System.out.println(brand);
        System.out.println(numOfContacts);
        System.out.println(durability);
        System.out.println(voltage);
        System.out.println(material);
        System.out.println(design);
        System.out.println(capacity);
        System.out.println(type);
    }
}
