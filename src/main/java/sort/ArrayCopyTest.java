package sort;

public class ArrayCopyTest {


    public static void main(String[] args) {
        Test[] tests = new Test[10];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test(i);
        }

        Test[] testCopy = new Test[10];
        System.arraycopy(tests,0,testCopy,0,10);

        for (int i = 0; i < tests.length; i++) {
            tests[i].setAge(i + 10);
        }

        for (int i = 0; i < testCopy.length; i++) {
            System.out.println(testCopy[i].age);
        }

    }

    static class Test {
        public Test(Integer age){
            this.age = age;
        }
        private Integer age;

        public void setAge(Integer age){
            this.age = age;
        }
    }
}
