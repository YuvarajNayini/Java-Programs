public class calculator {
    /* 
    // with instance without static keyword
    public double add(double a, double b) {
    return a + b;
        }
    // with instance without static keyword
    public double sub(double a, double b) {
    return a - b;
            }
    // with instance without static keyword
    public double multiply(double a, double b) {
    return a * b;
    }
    // with instance without static keyword
    public String divide(double a, double b) {
    if(b != 0){
    return String.valueOf(a / b);
            }
    else {
    return "Error: Division by zero is not allowed";  // custom error message
        }
}*/
// with static keyword
    public static double add(double a, double b) {
    return a + b;
        }
    // with instance without static keyword
    public static double sub(double a, double b) {
    return a - b;
            }
    // with instance without static keyword
    public static double multiply(double a, double b) {
    return a * b;
    }
    // with instance without static keyword
    public static String divide(double a, double b) {
    if(b!=0){
    return String.valueOf(a / b);
            }
    else {
    return "Error: Division by zero is not allowed";  // custom error message
        }
}
}
