public class School
{
    public  static void main(String args[])
    {
         AssignmentWork assignmentWork = new AssignmentWork(new PenAdapter());
         assignmentWork.write("writing the assignment");
         return;
    }
}
