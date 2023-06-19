public class AssignmentWork
{
    BallPen pen;
    AssignmentWork(BallPen p)
    {
       this.pen = p;
    }

    public void write(String str)
    {
          pen.writeinBall(str);
    }
}
