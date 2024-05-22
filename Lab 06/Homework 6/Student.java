/**
 * 1211EC / Homework nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Student {
    private String name;
    private int totalPoints;
    private int numExams;
  
    public Student(String name) {
      this.name = name;
      this.totalPoints = 0;
      this.numExams = 0;
    }
  
    public String getName() {
      return name;
    }
  
    public void addExam(int mark) {
      totalPoints += mark;
      numExams++;
    }
  
    public int getTotal() {
      return totalPoints;
    }
  
    public double getMeanMark() {
      return (double) totalPoints / numExams;
    }
  }
  