public class Actions
{

  private String name;
  private int power;
  private int accuracy;
  private int pp;


	/**
	* Default Actions constructor
	*/
	public Actions(String name, int power, int accuracy, int pp)
  {
		this.name = name;
		this.power = power;
		this.accuracy = accuracy;
		this.pp = pp;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName()
  {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name)
  {
		this.name = name;
	}

	/**
	* Returns value of power
	* @return
	*/
	public int getPower()
  {
		return power;
	}

	public void setPower(int power)
  {
		this.power = power;
	}

	public int getAccuracy()
  {
		return accuracy;
	}

	public void setAccuracy(int accuracy)
  {
		this.accuracy = accuracy;
	}

	public int getPp()
  {
		return pp;
	}

	public void setPp(int pp)
  {
		this.pp = pp;
	}

  public void subtractPp(int amount)
  {
    this.pp -= amount;
  }

	public String toString()
  {
		return name + " " + "PP: " + pp;
	}
}
