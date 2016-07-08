package People;


public class Student extends Man
{
    private int yearOfStudy;

    public Student(Sex sex, int yearOfStudy)
    {
        super(sex);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String name, int older, Sex sex, double weight, int yearOfStudy)
    {
        super(name, older, sex, weight);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String name, int older, Sex sex, double weight)
    {
        super(name, older, sex, weight);
        yearOfStudy = 0;
    }

    public void setYearOfStudy(int yearOfStudy)
    {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy()
    {
        return yearOfStudy;
    }

    public void increaseYearOfStudy()
    {
        yearOfStudy++;
    }

}
