public class BodyOfWater {
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, double ld, double ad, boolean sw){
        name = n;
        largestDiameter = ld;
        avgDepth = ad;
        isSaltWater = sw;
    }

    public BodyOfWater(String n, double ad){
        name = n;
        avgDepth = ad;
    }

    public String name(){
        return name;
    }

    public double largestDiameter(){
        return largestDiameter;
    }

    public double avgDepth(){
        return avgDepth;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }

    public void setName(String n){
        name = n;
    }

    public void setLargestDiameter(double ld){
        largestDiameter = ld;
    }
}
