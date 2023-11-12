public class Main {
    public static void main(String[] args) {
       /*
short a = 20;
short b = -20;
System.out.println(a + b);
System.out.println(a - b);
a = 40;
System.out.println(a);
System.out.println(b);
byte a = 10;
byte b = -20;
short c = 10000;
short d = -5000;
int e = 100000;
int f = -200000;
long m = 100000000;
long n = -100000000;

double g = 2.5;
float h = 34.8f;
System.out.println(g);
System.out.println(h);

char letterA = 'A';
System.out.println(letterA);

boolean flag = true;
String str = "AC Milan";
System.out.println(str);

str = "Real Madrid";
System.out.println(str);

int a1 = 5, b1 = 6;
System.out.println(a1 + b1);

int x, y, z;
x = y = z = 60;
System.out.println(x + y + z);

// Задание 1
String flowersName = "Roses";
// Задание 2
int flowersNumber = 101;
// Задание 3
System.out.println(flowersName);
System.out.println(flowersNumber);
// Задание 4
int a = 15;
int b = 10;
System.out.println(a + b);
// Задание 5
int c = (a + b);
System.out.println(c);
// Задание 6
int x = 5, y = 10, z = 15;
int sum1 = x + y + z;
System.out.println(sum1);

            printHello();

            printHello("Анна");
            printHello("Еркебулан");
            printHello("Мария");
            printHello("Азамат", "Смит", 30);

            String hello = getHelloPerson("Anna");
            System.out.println(hello);
//        String hello = getHelloWorld();
//        hello += "!";
//        System.out.println(hello);

            int x = 10;
            int y = 5;
            int sum = getSumOfTwo(x, y);

            System.out.println(x + "+" + y + "=" + sum);

            double sumOfInts = getSum(2.5f, 2);

        }

        public static void printHello() {
            System.out.println("Привет, мир!");
        }
        public static void printHello(String name) {
            name += "!";
            System.out.println("Привет, " + name);
        }

        public static void printHello(String name, String surname, int age) {
            String helloName = getHelloPerson(name);
            System.out.println(helloName + " " + surname + ". Возраст: " + age);
        }

        public static String getHelloPerson(String name) {
            String hello = "Привет, " + name;

            return hello;
        }

        public static void printSumOfTwo(int x, int y) {
            int sum = x + y;
            System.out.println(sum);
        }

        public static int getSumOfTwo(int x, int y) {
            return x + y;
        }

        public static int getSum(int x, int y) {
            return x + y;
        }

        public static double getSum(double x, double y) {
            return x + y;
        }

        public static float getSum(float x, float y) {
            return x + y;
        }
        */
        int numberOfSides = 5;
        double sideLength = 6.0;
        double area = calculateArea(numberOfSides, sideLength);
        System.out.println("Площадь пятиугольника равна " + area);
    }
    static double calculateArea(int numberOfSides, double sideLength) {
        double apothem = sideLength / (2 * Math.tan(Math.PI / numberOfSides));
        double area = (numberOfSides * sideLength * apothem) / 2;
        return area;
    }
}