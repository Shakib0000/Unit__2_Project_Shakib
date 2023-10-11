public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(String point1, String point2) {
        int length1 = point1.length();
        int length2 = point2.length();

        // First point

        int index1 = point1.indexOf("(");
        String sub1 = point1.substring(index1 + 1, length1);
        int index2 = sub1.indexOf(")");
        String sub2 = sub1.substring(0, index2);
        int index3 = sub2.indexOf(",");
        x1 = Integer.parseInt(sub2.substring(0, index3));
        y1 = Integer.parseInt(sub2.substring(index3 + 1));

        // Second point

        int index4 = point2.indexOf("(");
        String sub3 = point2.substring(index4 + 1, length2);
        int index5 = sub3.indexOf(")");
        String sub4 = sub3.substring(0, index5);
        int index6 = sub4.indexOf(",");
        x2 = Integer.parseInt(sub4.substring(0, index6));
        y2 = Integer.parseInt(sub4.substring(index6 + 1));
    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public double calculateSlope() {
        return (double) (y2-y1) / (x2 - x1);
    }

    public double calculateYIntercept() {
        return y1-(x1*calculateSlope());
    }

    public String makeEquation() {
        String top = String.valueOf(y2-y1);
        String bottom = String.valueOf(x2-x1);
        return "y = " + top + "/" + bottom + "x + " + String.format("%.2f", calculateYIntercept());
    }

    public String toString() {
        String str = "First pair: " + "(" + x1 + ", " + y1 + ")\nSecond pair: " + "(" + x2 + ", " + y2 + ")\n";
        str += "Slope of line: " + String.format("%.2f", calculateSlope()) + "\nY-intercept: " + String.format("%.2f", calculateYIntercept()) + "\n";
        str +=  "Slope intercept form: " + makeEquation() + "\nDistance between points: " + String.format("%.2f", calculateDistance());
        return str;
    }

    public String calculateCorrespondingPoint(int x) {
        double y = calculateSlope() * x + calculateYIntercept();
        return "(" + String.format("%.2f", (double) x) + ", " + String.format("%.2f", y) + ")";
    }
}
