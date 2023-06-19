public class PenAdapter implements BallPen
{
     GelPen pen;
     PenAdapter()
     {
         this.pen = new GelPen();
     }

    @Override
    public void writeinBall(String str)
    {
         pen.WriteInGel(str);
    }
}
