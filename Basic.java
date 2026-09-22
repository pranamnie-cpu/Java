class Basic{
  public static void main(String [] args){
    System.out.println("Hellow Java");

    Student s1 = new Student("Pranam", "1MS23CS001", 95.5);
    s1.display();
  }
}

class Student(
  String name;
  String usn;
  double mark;

  void Student(String name,String usn;double mark)
    {
    this.name=name;
  this.usn=usn;
  this.mark=mark;
    }
  void display(){
    System.out.println("Name: " + name);
    System.out.println("USN: " + usn);
    System.out.println("Mark: " + mark);
  }
)
