package demo;

public class FarmHouse
{
    Person[] people;
    FarmHouse(int capacity)
    {
        people = new Person[capacity];
    }
    public Person[] getPeople()
    {
        return people;
    }
    public void setPeople(Person[] people)
    {
        this.people = people;
    }
}
