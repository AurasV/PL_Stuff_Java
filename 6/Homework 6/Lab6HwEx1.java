/**
 * 1211EC / Homework nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab6HwEx1 {
    public static void main(String[] args) {
      Student student = new Student("Razvan Timofte");
      student.addExam(87);
      student.addExam(93);
      student.addExam(98);
      student.addExam(85);
  
      System.out.println("Name: " + student.getName());
      System.out.println("Total points: " + student.getTotal());
      System.out.println("Mean of all marks: " + student.getMeanMark());
    }
  }
  