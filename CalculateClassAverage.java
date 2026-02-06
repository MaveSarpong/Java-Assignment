    public class CalculateClassAverage {

        public static double calculateMean(int num1, int num2){
            double sum, mean;
            sum = num1 + num2;
            mean = sum/2;
            return mean;
        }

        public static double calculateMean(int num1, int num2, int num3){
            double sum, mean;
            sum = num1 + num2 + num3;
            mean = sum/3;
            return mean;
        }

        public static double calculateMean(int[] numbers){
            double sum, mean ;
            if (numbers.length == 0){
                throw new IllegalArgumentException("The array cannot be empty");
            }
            else if (numbers.length == 1){
                mean = (double)numbers[0];
                return mean;
            }
            else {
                sum = 0;
                for(double number: numbers){
                    sum += number;
                }
                mean = sum / (double)numbers.length;
                return mean;
            }
        }
        public static void main(String[] args) {}
    }
