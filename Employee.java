public class Employee //implements Serialization in case of Bean class
  {
    // private access modifier in case of Bean class
    String name;
    String regNo;
    String email;
    String gender;
    String mobileNumber;

    //No-arg constructor
    public Employee()
    {
      
    }

    //Parameterized constructor
    public Employee(String name,String regNno,String email,String gender,String mobileNumber)
    {
      this.name = name;
      this.regNo = regNo;
      this.email = email;
      this.gender = gender;
      this.mobileNumber = mobileNumber;
    }

    public void setName(String name)
    {
      this.name = name;
    }

    public String getName()
    {
      return name;
    }

    public void setRegNo(String regNo)
    {
      this.regNo = regNo;
    }

    public String getRegNo()
    {
      return regNo;
    }

    public void setEmail(String email)
    {
      this.email = email;
    }

    public String getEmail()
    {
      return email;
    }

    public void setGender(String gender)
    {
      this.gender = gender;
    }

    public String getGender()
    {
      return gender;
    }

    public void setMobileNumber(String mobileNumber)
    {
      this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber()
    {
      return mobileNumber;
    }

    
    
    
  }