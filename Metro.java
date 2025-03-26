class Metro {

    Metro() {
        this("Underground", 10);
    }

    Metro(String type, int capacity) {
        this(1000000.0);
        this.type = type;
        this.capacity = capacity;
    }

    Metro(double fare) {
        this("City Center", "Modern");
        this.fare = fare;
    }

    Metro(String location, String design) {
        this(5 , true);
        this.location = location;
        this.design = design;
    }

    Metro(int numOfStations , boolean isAvailable) {
        this("Standard");
        this.numOfStations = numOfStations;
		this.isAvailable = isAvailable;
    }

    Metro(String line) {
        this(30);
        this.line = line;
    }

    Metro(int id) {
        this.id = id;
    }

    int id;
    String line;
    int numOfStations;
	boolean isAvailable;
    double fare;
    String design;
    String location;
    int capacity;
    String type;

    public void getMetroDetails() {
        System.out.println(id);
        System.out.println(line);
        System.out.println(numOfStations);
        System.out.println(fare);
        System.out.println(design);
        System.out.println(location);
        System.out.println(capacity);
        System.out.println(type);
    }
}
