public class GetFinalGPA {
    
    public static double getFinalGPA(double numericScore){
        char letter;
        double gpa;
        letter = ExecuteGradeReport.calculateLetterGrade(numericScore);
        gpa = calculateGPA(letter);
        return gpa;
    }

    public static double calculateGPA(char letter){
        double gpa;
        switch(letter){
            case 'A':
                gpa = 4.0;
                return gpa;
            case 'B':
                gpa = 3.5;
                return gpa;
            case 'C':
                gpa = 3.0;
                return gpa;
            case 'D':
                gpa = 2.5;
                return gpa;
            case 'E':
                gpa = 2.0;
                return gpa;
            case 'F':
                gpa = 1.5;
                return gpa;
            default:
                throw new IllegalArgumentException("Invalid letter grade");
        }
        
    }

    public static void main(String[] args) {

    }
}
