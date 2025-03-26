class Flag {

    Flag() {
        this("USA", "Stars and Stripes" , 25);
    }

    Flag(String country, String design , int width) {
        this(50 , 3);
        this.country = country;
        this.design = design;
		this.width = width;
    }

    Flag(int numberOfColors , int size) {
        this("Rectangular" );
        this.numberOfColors = numberOfColors;
		this.size = size;
    }

    Flag(String shape ) {
        this("Nylon" , "Usa");
        this.shape = shape;
    }


    Flag(String material, String country) {
        this(5);
        this.material = material;
        this.country = country;
    }

    Flag(int id) {
        this.id = id;
    }

    int id;
    String country;
    String design;
    int numberOfColors;
    String shape;
    int size;
    String material;
	int width;

    public void flagDetails() {
        System.out.println(id);
        System.out.println(country);
        System.out.println(design);
        System.out.println(numberOfColors);
        System.out.println(shape);
        System.out.println(size);
        System.out.println(material);
		System.out.println(width);
    }
}
