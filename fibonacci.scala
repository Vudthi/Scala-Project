object fibonacci
{
    def main(args: Array[String])
    {
        calculate(scala.io.StdIn.readInt());
    }
    def calculate(amount: Int):Int=
    {
        var a:Int=0;
        var b:Int=1;
        var c = new Array[Int](100);
        var i:Int=0;
        var j:Int=0;
        while( i < amount )
        {
            c(i)=a+b;
            a=b;
            b=c(i);
            i=i+1;
        }
        while( j < amount )
        {
            print(c(j));
            j=j+1;
        }
    }
}