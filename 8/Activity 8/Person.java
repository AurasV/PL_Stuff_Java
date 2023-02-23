/**
 * 1211EC / Lab nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Person{

        private String first, last;
        private int age;
    
        public Person(String first, String last, int age){
            this.first = first;
            this.last = last;
            this.age = age;
        }
    
        String getFirst(){
            return first;
        }
    
        String getLast(){
            return last;
        }
    
        int getAge(){
            return age;
        }
    
        void displayPerson()
        {
            System.out.println(first);
            System.out.println(last);
            System.out.println(age);
        }    
    }