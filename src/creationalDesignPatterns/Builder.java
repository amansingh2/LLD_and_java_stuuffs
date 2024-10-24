package creationalDesignPatterns;


/*
Builder: Construct a complex object step by step

 */
class House{
    private String walls;
    private String roofs;
    private String foundations;

    public static class Builder{
        private String walls;
        private String roofs;
        private String foundations;

        public Builder setWalls(String walls){
            this.walls = walls;
            return this;
        }
        public Builder setRoofs(String roofs){
            this.roofs = roofs;
            return this;
        }
        public Builder setFoundation(String foundations){
            this.foundations = foundations;
            return this;
        }
        public House build() {
            House house = new House();
            house.walls = this.walls;
            house.roofs = this.roofs;
            house.foundations = this.foundations;
            return house;
        }
    }
    @Override
    public String toString(){
        return walls + "  " + roofs + "  " + foundations;
    }
}
public class Builder {
    public static void main(String[] args) {
        House house  =  new House.Builder()
                .setWalls("5")
                .setRoofs("1")
                .setFoundation("4")
                .build();

        System.out.println(house);
    }
}
