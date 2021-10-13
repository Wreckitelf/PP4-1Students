public class GoodStudent
{
    private String firstName;
    private String lastName;
    private boolean csStudent;
    private int idNum;
    private double gpa;

    public GoodStudent(String newFirstName, String newLastName, int newIdNum, double newGpa, boolean newCsStudent )
    {
        firstName = newFirstName;
        lastName = newLastName;
        csStudent = newCsStudent;
        idNum = newIdNum;
        gpa = newGpa;
    }

    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        csStudent = false;
        idNum = 00000;
        gpa = 0.0;
    }

    public GoodStudent(String newFirstName, String newLastName, int newIdNum)
    {
        firstName = newFirstName;
        lastName = newLastName;
        idNum = newIdNum;

    }


    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public boolean getCsStudent()
    {
        return csStudent;
    }
    public int getIdNum()
    {
        return idNum;
    }
    public double getGpa()
    {
        return gpa;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setCsStudent(boolean newCsStudent)
    {
        csStudent = newCsStudent;
    }
    public void setIdNum(int newIdNum)
    {
        idNum = newIdNum;
    }
    public void setGPA(double newGpa)
    {
        gpa = newGpa;
    }

    //brain
    public String createId()
    {
        String idNumAsString = "" + idNum;
        String output = firstName.charAt(0) + lastName.toLowerCase();
        output = output.toLowerCase();
        output += idNumAsString.substring(idNumAsString.length()-3);
        return output;
    }

    public double CSGPA()
    {
        if(csStudent)
        {
            gpa *= 1.15;
        }
        gpa *= 100;
        gpa = Math.floor(gpa);
        gpa /= 100;

        return gpa;
    }

    public String toString()
    {
        String output = "Name: "  + firstName + " " + lastName;
        output += "\nCS status: " + csStudent;
        output += "\nidNum: " + idNum;
        output += "\ngpa: " + gpa;
        return output;
    }
}
