public class Salary {
    public static void main(String[] args) {
    earningSalary SalaryObj1 = new earningSalary();
    SalaryObj1.setSalary(6000,12000,18000);
    SalaryObj1.evaluateSalary();
    }

}
class earningSalary {
    float lowestSalary, mediumSalary, highestSalary;

    void setSalary(float x, float y, float z) {
        lowestSalary = x;
        mediumSalary = y;
        highestSalary = z;
    }

    void evaluateSalary() {
        if
        (lowestSalary > mediumSalary && mediumSalary > highestSalary) {
            System.out.println(lowestSalary + "will be the lowest salary");
        } else if
        (mediumSalary > lowestSalary && mediumSalary > highestSalary) {
            System.out.println(mediumSalary + " will be the medium salary");
        } else if
        (highestSalary > lowestSalary && highestSalary > lowestSalary) {
            System.out.println(highestSalary + " will be the highest salary");
        } else {
            System.out.println("salary can be equal");
        }

    }
}
