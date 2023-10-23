package Encap3;

public class Account {
private long acc_no;
private String name,email;
private float amount;

public void setAcc_no(long acc_no)
{
this.acc_no=acc_no;	
}
public long getAcc_no()
{
return acc_no;	
}

public void setName(String name)
{
this.name=name;	
}
public String getName()
{
return name;	
}
public void setEmail(String email)
{
this.email=email;	
}
public String getEmail()
{
return email;	
}
public void setAmount(float amount)
{
this.amount=amount;	
}
public float getAmount()
{
return amount;	
}
}
