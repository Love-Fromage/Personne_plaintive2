public class Person {
   String[] sexPossible = {"Male","Female"};
   String sex;
   String firstName;
   String lastName;
   public Person(int sexChoice, String fName) {
        sex = sexPossible[sexChoice];
        firstName = fName;
   }
   
};
