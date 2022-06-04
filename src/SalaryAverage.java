public class SalaryAverage {

    public double calculateAverage(int[] salaries) {
        int min = salaries[0];
        int max = 0;
        int sum = 0;
        double average = 0;
        for(int i = 0 ; i< salaries.length ; i++) {
            min = Math.min(min, salaries[i]);
            max = Math.max(max,salaries[i]);
        }

        for(int i=0;i< salaries.length ; i++){
            if(salaries[i] == min | salaries[i]==max){
                continue;
            }
            sum += salaries[i];
        }
        System.out.println("the min is " + min);
        System.out.println("the max is "+ max);
        System.out.println("The average salary is " + sum/(salaries.length -2));
        return sum/(salaries.length -2);
    }

    public static void main(String[] args) {
        int[] integerArray = new int[] {1200, 16600,5600,3214,12365,850,451,1320};
        SalaryAverage salaryAverage = new SalaryAverage();
        salaryAverage.calculateAverage(integerArray);



    }
}
