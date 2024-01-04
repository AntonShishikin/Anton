class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulusOfComplexNumber(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}
