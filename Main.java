public class Main {
    public static void main(String[] args) {
        Person Lexa = new Person("Lexa", "Anikeev", 20);
        Car lexus = new Car("Lexus", 2013, 11);
        Book car = new Book("Ремонт и эксплуатация Lexus", "кто-то в Японии", 2013);
        Lexa.Book(lexus, car);
    }
}
class Person{
    public String Name;
    public String Surname;
    public int Age;
    public Person(String Name, String Surname, int Age){
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }
    public void pers(){
        System.out.println(Name+ " "+Surname+" "+Age);
    }
    public void Book(Car car, Book book){
        System.out.println(Name +" читает книгу "+ book.Title +" про манину "+ car.Make);
    }
}
class Car{
    public String Make;
    public int year_of_manufacture;
    public int Age;
    public Car (String Make, int year_of_manufacture, int Age){
        this.Make = Make;
        this.year_of_manufacture = year_of_manufacture;
        this.Age = Age;
    }
    public void Cars(){
        System.out.println(Make+" "+year_of_manufacture+" "+Age);
    }
}
class Book{
    public String Title;
    public String Author;
    public int Year_of_release;
    public Book(String Title, String Author, int Year_of_release){
        this.Title = Title;
        this.Author = Author;
        this.Year_of_release = Year_of_release;
    }
    public void books (){
        System.out.println(Title+" "+Author+" "+Year_of_release);
    }
}