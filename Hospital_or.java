class Hospital_or
{
//-----------------------------------------------------------------
//  Creates several objects from classes derived from
//  HospitalEmployee.
//-----------------------------------------------------------------
public static void main (String[] args)
{
	Hospital_or h = new Hospital_or();
  HospitalEmployee vito = h.new HospitalEmployee ("Vito", 123);
  Doctor michael = h.new Doctor ("Michael", 234, "Heart");
  Surgeon vincent = h.new Surgeon ("Vincent", 645, "Brain", true);
  Nurse sonny = h.new Nurse ("Sonny", 789, 6);
  

  // print the employees
  System.out.println (vito);
  System.out.println (michael);
  System.out.println (vincent);
  System.out.println (sonny);


  // invoke the specific methods of the objects
  vito.work();
  michael.work();
  vincent.work();
  sonny.work();
 
}
class HospitalEmployee
{
	protected String name;
	protected int number;
	public HospitalEmployee(String empN, int empNum)
    {
        name = empN;
        number = empNum;
    }
    public HospitalEmployee()
    {
        this.name="";
        this.number=0;
    }
    public void setName(String empN)
    {
        name = empN;
    }

    public void setNumber(int empNum)
    {
        number = empNum;
    }

    public String getN()
    {
        return name;
    }

    public int getNum()
    {
        return number;
    }
    public String toString()
    {
        return name + "\t" + number;
    }
    public void work()
    {
    System.out.println (name + " works for the hospital.");
    }

}
class Nurse extends HospitalEmployee
{
	int numOfPatients;
	public Nurse()
    {
        super ();
        this.numOfPatients=0;
    }
	public Nurse(String empName,int empNumber,int patNum)
    {
		name = empName;
		number = empNumber;
		numOfPatients = patNum;
    }
	public void setpatNum(int patNum)
    {
		numOfPatients = patNum;
    }
    public String getpatNum()
    {
        return String.valueOf(numOfPatients);
    }

	@Override
	public String toString()
	{
		String n = String.valueOf(numOfPatients);
		return name + "\t" + number + " has " + n + " patients.";
	}
	@Override
	public void work()
    {
    System.out.println (name + " works for the hospital." + name + " is a nurse with " + numOfPatients + " patients.");
    }
}
class Doctor extends HospitalEmployee
{
	String speciality;
	public Doctor()
    {
        super ();
        this.speciality="";
    }
	
	public Doctor(String empName,int empNumber,String Sp)
    {
		name = empName;
		number = empNumber;
		speciality = Sp;
    }
	public void setSp(String Sp)
    {
		speciality = Sp;
    }
    public String getSp()
    {
        return speciality;
    }
	@Override
	public String toString()
	{
		return name + "\t" + number + "\t" + speciality;
	}
	@Override
	public void work()
    {
    System.out.println (name + " works for the hospital." + name + " is a(n)" + speciality + " doctor.");
    }
}
class Surgeon extends HospitalEmployee
{
	String speciality;
	boolean Tf;
	public Surgeon()
    {
        super ();
        this.speciality="";
        this.Tf=true;
    }
	
	public Surgeon(String empName,int empNumber,String Sp,boolean x)
    {
		name = empName;
		number = empNumber;
		speciality = Sp;
		Tf = x;
    }
	public void setSp(String Sp)
    {
		speciality = Sp;
    }
    public String getSp()
    {
        return speciality;
    }
    public void setSp(boolean x)
    {
		Tf = x;
    }
    public boolean getx()
    {
        return Tf;
    }
	@Override
	public String toString()
	{
		return name + "\t" + number + "\t" + speciality + "Operating: " + Tf;
	}
	@Override
	public void work()
    {
    System.out.println (name + " works for the hospital." + name + " is operating now.");
    }
}
}
