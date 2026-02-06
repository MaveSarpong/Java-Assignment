A short summary of the three source files in this folder.

## GetFinalGPA.java
- Key methods:
    - `getFinalGPA(double numericScore)` — returns GPA (double).
    - `calculateGPA(char letter)` — maps A→4.0, B→3.5, C→3.0, D→2.5, E→2.0, F→1.5; throws on invalid letter.

## ExecuteGradeReport.java
- Key methods:
    - `executeGradeReport(double score)` — validates the score and computes letter grade.
    - `validateScore(double score)` — ensures score is between 0.0, 100.0.
    - `calculateLetterGrade(double score)` — converts numeric grades to letter grades ("A"–"F").
    - `displayPerformanceMessage(char grade)` — prints the grade.

## CalculateClassAverage.java
- Key methods:
    - `calculateMean(int num1, int num2)` — mean of two values.
    - `calculateMean(int num1, int num2, int num3)` — mean of three values.
    - `calculateMean(int[] numbers)` — mean of array; throws if array is empty.
