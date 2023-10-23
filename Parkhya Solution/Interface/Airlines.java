interface Airindia
{
void rates();
static void mum_delhi()
{
System.out.println("3000 rupees");
}
static void kolkatta_pune()
{
System.out.println("3500 rupees");
}

}
interface Jetairways
{
void rates1();
static void delhi_chennai()
{
System.out.println("5900");
}
static void chan_goa()
{
System.out.println("6000");
}

}
class Airlines implements Airindia,Jetairways
{
public void info()
{
System.out.println("details of airlines prices");
}
public void rates()
{
System.out.println("AirIndia rates");
}
public void rates1()
{
System.out.println("JetAirways  rates");
}
public static void main(String aa[])
{
Airlines obj=new Airlines();
obj.info();
obj.rates();
Airindia.mum_delhi();
Airindia.kolkatta_pune();
obj.rates1();
Jetairways.delhi_chennai();
Jetairways.chan_goa();
}
}