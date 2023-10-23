class Left{

public void run(){

System.out.println("Control is Left");
}
}

class Right extends Left{

public void run(){

System.out.println("Control is Right");
}
public void stop(){

System.out.println("Right Control is Stop");
}
}

public class Control{
public static void main(String args[]){

Left l= new Left();
Right r= new Right();    
l.run();
r.run();
r.stop();

//Upcasting
Left l1 = r;
l1.run();
// l1.stop();

//Downcasting
/*Left l3 = new Left();
Right r3 = (Right)l3;
r3.run();
r3.stop();*/

Left l2 = new Right();
Right r2 = (Right)l2;
r2.run();
r2.stop();
}
}