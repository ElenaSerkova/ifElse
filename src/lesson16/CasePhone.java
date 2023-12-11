package lesson16;

public class CasePhone {
        private  String color;
        private  String material;

        public CasePhone(String color, String material) {
            this.color = color;
            this.material = material;
        }


        public String getColor() {
            return color;
        }


        public String getMaterial() {
            return material;
        }


    @Override
    public String toString() {
        return "Case{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}





