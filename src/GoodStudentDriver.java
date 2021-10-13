import java.text.NumberFormat;

public class GoodStudentDriver
{
    public static void main(String[] args)
    {

        GoodStudent AT = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent FN = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
            GoodStudent GH = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);
        System.out.println(AT.toString());
        FN.setIdNum(95366);
        FN.setGPA(3.92);
        System.out.println("Florence new id num " +FN.getIdNum());
        System.out.println("Florence new gpa " + FN.getGpa());
        System.out.println("Grace first name " + GH.getFirstName());
        System.out.println("Grace cs student status " + GH.getCsStudent());
        System.out.println("Alan ID " + AT.createId());
        System.out.println("Florence ID " + FN.createId());
        System.out.println("Grace ID " + GH.createId());

        System.out.println("GPA after (possible) benefit (Alan): " + AT.CSGPA());
        System.out.println("GPA after (possible) benefit (Florence): " + FN.CSGPA());
        System.out.println("GPA after (possible) benefit (Grace): " + GH.CSGPA());

    }
}
