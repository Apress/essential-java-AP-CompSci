public class Sprint19Main {
    public static void main(String[] args) {

        // I: Number methods
        double a = Math.floor(1.99); // a = 1
        double b = Math.ceil(1.01); // b = 2
        double c = Math.round(1.49); // c = 1
        System.out.printf("Rounding >> floor %f >> ceil %f >> round %f \n", a, b, c);
        // Output: Rounding >> floor 1.000000 >> ceil 2.000000 >> round 1.000000

        // II: Algebraic methods
        double d = Math.pow(2,8); // d = 256.0
        double e = Math.sqrt(256.0); // e = 128.0
        double f = Math.cbrt(27); // f = 3.0
        double g = Math.PI; // Represents pi
        double h = Math.E; // Represents Euclid's number
        double i = Math.log(50); // Returns the *natural* logarithm
        double j = Math.log10(50); // Returns the common (base-10) logarithm
        double k = Math.abs(-1); // k = 1.0
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f\n",d,e,f,g,h,i,j,k);
        // Output: 256.000000, 16.000000, 3.000000, 3.141593, 2.718282, 3.912023, 1.698970, 1.000000

        // III: Trigonometric methods
        double l = Math.sin(2); // Returns sine (using radians)
        double m = Math.cos(2); // Returns cosine (using radians)
        double n = Math.tan(2); // Returns tangent (using radians)
        double o = Math.asin(1); // Returns arc sine (using radians)
        double p = Math.acos(1); // Returns arc cosine (using radians)
        double q = Math.atan(2); // Returns arc tangent (using radians)
        double r = Math.toRadians(90.0); // Returns radians
        double s = Math.toDegrees(Math.PI * 2); // Returns degrees
        double t = Math.cos(Math.toRadians(Math.PI * 2)); // Nested method calls
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f, %f\n",l,m,n,o,p,q,r,s,t);
        // Output: 0.909297, -0.416147, -2.185040, 1.570796, 0.000000, 1.107149, 1.570796, 360.000000, 0.993993

        // IV: Comparison method
        double max = Math.max(1,2); // Returns 2
        double min = Math.min(1,2); // Returns 1
        System.out.printf("%f, %f",max,min);
        // Output: 2.000000, 1.000000
    }
}