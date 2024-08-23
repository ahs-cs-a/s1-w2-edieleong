public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Tahoe", 12, 1645, false);
        BodyOfWater b1 = new BodyOfWater("San Francisco Bay", 15);

        System.out.println(b.name());
        System.out.println(b1.name());

        System.out.println(b.largestDiameter());
        System.out.println(b1.largestDiameter());

        System.out.println(b.avgDepth());
        System.out.println(b1.avgDepth());

        System.out.println(b.isSaltWater());
        System.out.println(b1.isSaltWater());

        b1.setName("SF Bay");

        System.out.println(b1.name());
    }
}
