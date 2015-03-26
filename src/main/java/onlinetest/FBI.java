package onlinetest;

public class FBI
{
    protected String description;
    protected int id;
    public FBI(int id, String description)
    {
	  this.id=id;
	  this.description=description;
    }
    public String toString()
    {
	  return id+":"+description;
    }
}
