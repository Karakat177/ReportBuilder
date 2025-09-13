//public class Car {
//    private final int seats;
//    private final String engine;
//    private final boolean hasGPS;
//    private final boolean hasTripComputer;
//
//
//    private Car(Builder builder){
//        this.seats = builder.seats;
//        this.engine = builder.engine;
//        this.hasGPS = builder.hasGPS;
//        this.hasTripComputer =  builder.hasTripComputer;
//    }
//
//
//    @Override
//    public String toString(){
//        return "Car{" +
//                "seats=" + seats +
//                ",engine='" + engine + '\'' +
//                ", hasGPS=" + hasGPS +
//                ", hasTripComputer=" + hasTripComputer +
//                '}';
//    }
//
//
//    public static class Builder{
//        private int seats;
//        private String engine;
//        private boolean hasGPS;
//        private boolean hasTripComputer;
//
//
//        public Builder setSeats(int seats){
//                this.seats = seats;
//                return this;
//        }
//
//
//        public Builder setEngine(String engine){
//                this.engine = engine;
//                return this;
//        }
//
//
//        public Builder setGPS(boolean hasGPS){
//                this.hasGPS = hasGPS;
//                return this;
//        }
//
//
//        public Builder setTripComputer(boolean hasTripComputer){
//                this.hasTripComputer = hasTripComputer;
//                return  this;
//        }
//
//
//        public Car build(){
//            return new Car(this);
//        }
//
//    }
//
//}

public class Report {
    private final String Title;
    private final String Author;
    private final String Conclusion;


    private Report(Builder builder){
        this.Title = builder.Title;
        this.Author = builder.Author;
        this.Conclusion = builder.Conclusion;
    }

    @Override
    public String toString(){
        return "Report {" +
                "Title = " + Title +
                ", Author = " + Author +
                ", Conclusion '"+ Conclusion+'\'' +
                "}";
    }


    public static class Builder{
        private String Title;
        private String Author;
        private String Conclusion;


        public Builder setTitle(String Title){
            this.Title = Title;
            return this;
        }

        public Builder setAuthor(String Author){
            this.Author = Author;
            return this;
        }

        public Builder setConclusion(String Conclusion){
            this.Conclusion = Conclusion;
            return this;
        }


        public  Report build() {
            return new Report  (this);
        }
    }
}




