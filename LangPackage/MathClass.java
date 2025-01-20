package LangPackage;

public class MathClass
{
    public static void main(String[] args) {
        System.out.println("Math Class");

        System.out.println("Absolute: "+Math.abs(-123));  //gives positive value
        System.out.println("Absolute: "+StrictMath.abs(-123));
        System.out.println("Difference:\n" +
                "Math.abs(): It may use platform-specific optimizations, which can lead to slightly different results on different platforms due to hardware or compiler optimizations.\n" +
                "StrictMath.abs(): It provides more predictable and consistent results across different platforms by strictly adhering to the IEEE 754 standard for floating-point arithmetic, without any platform-specific optimizations.\n\n");
        System.out.println("Cube Root: "+Math.cbrt(9));
        System.out.println("Math.decrementExact(7) returns the exact decremented value of 7, which is 6. If the value is at the minimum limit for its type (e.g., Integer.MIN_VALUE for integers), it throws an ArithmeticException to prevent overflow.\nExact Decrement: "+Math.decrementExact(7));
        System.out.println("Exponent value in Floating point Representation: "+Math.getExponent(12.33)); //For 12.33, it calculates the exponent for the closest power of 2 that represents the number, which is 3 (since 12.33 is between 2^3 and 2^4).
        System.out.println("Round Division: "+Math.floorDiv(50,9));//truncates the decimal part of the division output
        System.out.println("e power x: "+Math.exp(1));
        System.out.println("e power x using StrictMath: "+StrictMath.exp(1));
        System.out.println("Log base 10: "+Math.log10(100));
        System.out.println("Maximum: "+Math.max(100,48));
        System.out.println("Tan : "+Math.tan(45*Math.PI/180));//tan 45--> here we have converted 45 degrees to radians by multiplying it with Math.PI/180
        System.out.println("Convert to Radians: "+Math.toRadians(90));
        System.out.println("Convert to Degrees: "+Math.toDegrees(Math.atan(1)));  //atan(1) is tan inverse of 1 gives the angle in radian value which we have further converted into degrees using Math.toDegrees method
        System.out.println("Convert to Degrees using StrictMath : "+StrictMath.toDegrees(StrictMath.tanh(1)));
        System.out.println("Random: "+Math.random());//generates a random number
        System.out.println("Power: "+Math.pow(2,3));
        System.out.println("Exact Product: "+Math.multiplyExact(100,200));//its like if we multifly two integer values and the result is within the integer value ranges then we get output . but if the limit exceeds then it throws an exception
        System.out.println("Next Float Value: "+Math.nextAfter(12.5,13));//It finds the smallest possible double value greater than 12.5 and less than 13.
        System.out.println("Next Float Value: "+Math.nextAfter(12.5,11));//It finds the smallest possible double value smaller than 12.5.




    }
}
