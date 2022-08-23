import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet
{
    int a,b,c,limit,sum;

    public PythagoreanTriplet() {
    }

    public PythagoreanTriplet(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static PythagoreanTriplet makeTripletsList()
    {
        return new PythagoreanTriplet();
    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int n)
    {
        this.limit=n;
        return this;
    }

    public PythagoreanTriplet thatSumTo(int sum)
    {
        this.sum=sum;
        return this;
    }

    public List<PythagoreanTriplet> build()
    {
        List<PythagoreanTriplet> actual = new ArrayList<>();
        int p,q,r;
        for (p=1; a<(this.sum/3); p++)
        {
            for (q=p+1; q<this.sum; q++)
            {
                r=this.sum-(p+q);
                if (q>=r)
                {
                    break;
                }
                if (((p*p) + (q*q)) == r*r)
                {
                    actual.add(new PythagoreanTriplet(p, q, r));
                }
            }
        }
        return actual;
    }
}
