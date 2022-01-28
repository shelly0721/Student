package student;

/**
 *
 * @author nakamurasayaka
 */
public class PartTimeStudent extends Student {
    
    private int numCourse;
   
    
    public PartTimeStudent() {
        
    }
    
    
     public PartTimeStudent(String studentId, String name, int numCource) {
        super(studentId, name);
        this.numCourse = numCourse;         
     }
    
     
    public int getNumCource() {
        return numCourse;
    }
    
    public void setNumCourse(int numCource) {
        this.numCourse = numCourse;
    }
    
    
    
    
}
