class Factory {

    Factory() {
        this("Electronics", 5000);
    }

    Factory(String type, int capacity) {
        this(100000.0);
        this.type = type;
        this.capacity = capacity;
    }

    Factory(double revenue) {
        this("Automotive", "Large");
        this.revenue = revenue;
    }

    Factory(String sector, String size) {
        this(50 , 15);
        this.sector = sector;
        this.size = size;
    }

    Factory(int numOfWorkers , int noOfHolidays) {
        this(120);
        this.numOfWorkers = numOfWorkers;
		this.noOfHolidays = noOfHolidays;
    }

    Factory(String location) {
        this(100);
        this.location = location;
    }

    Factory(int id) {
        this.id = id;
    }

    int id;
    String location;
    int numOfWorkers;
	int noOfHolidays;
    double revenue;
    String size;
    String sector;
    int capacity;
    String type;

    public void getFactoryDetails() {
        System.out.println(id);
        System.out.println(location);
        System.out.println(numOfWorkers);
        System.out.println(revenue);
        System.out.println(size);
        System.out.println(sector);
        System.out.println(capacity);
        System.out.println(type);
		System.out.println(noOfHolidays);
    }
}
