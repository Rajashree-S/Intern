class Chemical {

    Chemical() {
        this("Acid", 10);
    }

    Chemical(String name, int quantity) {
        this(100.0);
        this.name = name;
        this.quantity = quantity;
    }

    Chemical(double price) {
        this("Unknown", "Liquid");
        this.price = price;
    }

    Chemical(String type, String state) {
        this(20 , "Neutral");
        this.type = type;
        this.state = state;
    }

    Chemical(int hazardLevel , String supplier) {
        this(50);
        this.hazardLevel = hazardLevel;
		this.supplier = supplier;
    }

   

    Chemical(int id) {
        this.id = id;
    }

    int id;
    String supplier;
    int hazardLevel;
    double price;
    String state;
    String type;
    int quantity;
    String name;

    public void chemicalDetails() {
        System.out.println(id);
        System.out.println(supplier);
        System.out.println(hazardLevel);
        System.out.println(price);
		System.out.println(state);
	}
}