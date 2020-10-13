class emp
{
  String name;
  int age;
  String city;

}

class Employee
{
  public static void main (String args[])
  {
    emp obj1 = new emp ();
    emp obj2 = new emp ();


      obj1.name = "Alex";
      obj1.age = 23;
      obj1.city = "Bangalore";

      obj2.name = "Charlie";
      obj2.age = 27;
      obj2.city = "West Bangal";

      System.out.println ("Employee name is ");
      System.out.println (obj1.name);
      System.out.println ("And the age is ");
      System.out.println (obj1.age);
      System.out.println ("He stays in ");
      System.out.println (obj1.city);

      System.out.println ("Employee name is ");
      System.out.println (obj2.name);
      System.out.println ("And the age is ");
      System.out.println (obj2.age);
      System.out.println ("He stays in ");
      System.out.println (obj2.city);

  }
}
