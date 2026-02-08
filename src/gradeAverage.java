public class gradeAverage {
    public static void executegradeAverage(double score) {

        if (!validateScore(score)) {
            System.out.println("Invalid score");
            return;
        }

        char grade = calculateLetterGrade(score);

        displayPerformanceMessage(grade);
    }

}
