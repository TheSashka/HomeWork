/*
Создайте класс с именем Fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
Конструктор класса должен инициализировать их заданным набором значений.
Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
метод, умножающий (произведение) текущую дробь на число типа double,
переданное ему в параметре и возвращающий дробь - результат умножения;
метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
 */
public class Fraction
{
    private int numerator;
    private int denominator;

    public static void main(String[] args)
    {
        double value = 0.75;
        Fraction fraction1 = new Fraction(3,5);
        Fraction fraction2 = new Fraction(2,4);
        Fraction sum = fraction1.sum(fraction2);
        Fraction mul = fraction1.mul(value);
        Fraction div = fraction1.div(value);
        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction toFraction(double value)
    {
        Fraction temp = new Fraction(0,0);
        boolean isRunning = true;
        int denominator = 1;
        double epsilon = 0.0000000001;
        while(isRunning)
        {
            if(value % (int)value > epsilon || value < 1)
            {
                denominator *= 10;
                value *= 10;
            }
            else
            {
                isRunning = false;
            }
        }
        temp.setNumerator((int)value);
        temp.setDenominator(denominator);
        return temp;
    }

    public Fraction sum(Fraction fraction)
    {
        Fraction temp = new Fraction(0,0);
        if(this.getDenominator() == fraction.getDenominator())
        {
            temp.setNumerator(this.getNumerator() + fraction.getNumerator());
            temp.setDenominator(this.getDenominator());
        }
        else
        {
            temp.setNumerator(this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator());
            temp.setDenominator(this.getDenominator() * fraction.getDenominator());
        }
        return temp;
    }

    public Fraction mul(double value)
    {
        Fraction temp = Fraction.toFraction(value);
        return new Fraction(this.getNumerator()*temp.getNumerator(), this.getDenominator()*temp.getDenominator());
    }

    public Fraction div(double value)
    {
        Fraction temp = Fraction.toFraction(value);
        return new Fraction(this.getNumerator() * temp.getDenominator(), this.getDenominator() * temp.getNumerator());
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
