public class ExecuteGradeReport{

    public static void executeGradeReport(double score){
        char grade;
        if (validateScore(score)){
            grade = calculateLetterGrade(score);
            displayPerformanceMessage(grade);
        }
        else{
            throw new IllegalArgumentException("Invalid Score");
        }
    }

    public static boolean validateScore(double score){
        return score >= 0.0 && score <= 100.0;
    }

    public static char calculateLetterGrade(double score){
        if (score >= 90.0){
            return 'A';
        }
        else if (score >= 80.0){
            return 'B';
        }
        else if (score >= 70.0){
            return 'C';
        }
        else if (score >= 60.0){
            return 'D';
        }
        else if (score >= 50.0){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    public static void displayPerformanceMessage(char grade){
        System.out.println("You had a/an : " + grade);
    }

    public static void main(String[] args) {}

}