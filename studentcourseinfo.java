public class studentcourseinfo extends student {
    public String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    public int[] marks = { 35, 92, 75, 88, 95 };

    public void displayStudentMarks() {
        System.out.println("Course Codes \t Marks Obtained");

        for (int i = 0; i < courseCodes.length; i++) {
            System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }

    }

    /**
     * @return
     */
    public void totalStudentMarks() {
        int total = 0;
        int total_2 = 0;
        for (int i = 0; i < marks.length; i++) {

            total += marks[i];
        }
        System.out.println("Total marks: " + total);
    }

    public void LessThan40() {
        System.out.println("Course Codes \t Marks");
        for (int i = 0; i < courseCodes.length; i++) {

            if (marks[i] < 40) {

                System.out.println(courseCodes[i] + "\t\t" + marks[i]);
            }
        }
    }
}