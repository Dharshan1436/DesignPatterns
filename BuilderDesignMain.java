package designPattrens;
class House {
    private String walls;
    private String roof;
    private String doors;
    private String windows;
    
    
    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.doors = builder.doors;
        this.windows = builder.windows;
    }

    @Override
    public String toString() {
        return "House with " + walls + ", " + roof + ", " + doors + ", " + windows;
    }

 
    public static class HouseBuilder {
        private String walls;
        private String roof;
        private String doors;
        private String windows;

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

       
        public House build() {
            return new House(this);
        }
    }
}

public class BuilderDesignMain {
	public static void main(String[] args) {
      
        House house = new House.HouseBuilder()
                              .setWalls("Brick Walls")
                              .setRoof("Concrete Roof")
                              .setDoors("Wooden Doors")
                              .setWindows("Glass Windows")
                              .build();
        
		System.out.println(house);
	}
}
