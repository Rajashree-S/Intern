class Glass {
    
    Glass() {
        this("Clear", 5);
    }

    Glass(String transparency, int thickness) {
        this("Standard", "Low");
        this.transparency = transparency;
        this.thickness = thickness;
    }

    Glass(String type, String finish) {
        this("Tempered");
        this.type = type;
        this.finish = finish;
    }

    Glass(String type) {
        this(3);
        this.type = type;
    }

    Glass(int durability) {
        this.id = durability;
    }

    int id;
    String type;
    String transparency;
    int thickness;
    String finish;
    String surfaceType;
    int durability;

    public void glassDetails() {
        System.out.println(id);
        System.out.println(type);
        System.out.println(transparency);
        System.out.println(thickness);
        System.out.println(finish);
        System.out.println(surfaceType);
        System.out.println(durability);
    }
}
