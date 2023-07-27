public class Classes {

}
/*
Example 1
        String s = "we check";
        System.out.println(s.length()); // 8
        int i = s.length() - 1;
        System.out.println(i); // 7
        do {
            char ch = s.charAt(i);
            System.out.println("char is '" + ch + "'");
        } while (--i >= 0);

Example 2
        String org = "This is a test.";
        String search = "t";
        String sub = "b";
        String result = "";
        int i;
        do {
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result += sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);

Class Example 1
        class Box {
            double width;
            double height;
            double depth;
        }
        class BoxDemo {
            public static void main(String[] args) {
                Box mybox = new Box();
                mybox.width = 10;
                mybox.height = 20;
                mybox.depth = 15;
                double vol = mybox.width * mybox.height * mybox.depth;
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 2
        class Box {
            double width;
            double height;
            double depth;
        }
        class BoxDemo {
            public static void main(String[] args) {
                Box mybox2 = new Box();
                Box mybox1; // объявить ссылку на объект
                mybox1 = new Box(); // выделить память для объекта Box
                double vol;
                mybox1.width = 10;
                mybox1.height = 20;
                mybox1.depth = 15;

                mybox2.width = 3;
                mybox2.height = 6;
                mybox2.depth = 9;

                vol = mybox1.width * mybox1.height * mybox1.depth;
                System.out.println("Объем равен: " + vol);
                vol = mybox2.width * mybox2.height * mybox2.depth;
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 3
        Box b1 = new Box();
        Box b2 = b1;

Class Example 4
        class Box {
            double width;
            double height;
            double depth;

            //вывести объем параллелепипеда
            void volume() {
                System.out.println("Объем равен: ");
                System.out.println(width * height * depth);
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
                Box mybox1 = new Box();
                Box mybox2 = new Box();
                mybox1.width = 10;
                mybox1.height = 20;
                mybox1.depth = 15;

                mybox2.width = 3;
                mybox2.height = 6;
                mybox2.depth = 9;

                mybox1.volume();
                mybox2.volume();
            }
        }

Class Example 5
        class Box {
            double width;
            double height;
            double depth;

            double volume() {
                return width * height * depth;
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
                Box mybox1 = new Box();
                Box mybox2 = new Box();
                double vol;
                mybox1.width = 10;
                mybox1.height = 20;
                mybox1.depth = 15;

                mybox2.width = 3;
                mybox2.height = 6;
                mybox2.depth = 9;

                vol = mybox1.volume();
                System.out.println("Объем равен: " + vol);
                vol = mybox2.volume();
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 6
        class BoxDemo {
            static int square(int i) {
                return i * i;
            }

            public static void main(String[] args) {
                System.out.println(square(10));
            }
        }

Class Example 7
        class Box {
            double width;
            double height;
            double depth;

            double volume() {
                return width * height * depth;
            }

            //установить размеры параллелепипеда
            void setDim(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
                Box mybox1 = new Box();
                Box mybox2 = new Box();
                double vol;
        //инициализировать каждый экземпляр класса Box
                mybox1.setDim(10, 20, 15);
                mybox2.setDim(3, 6, 9);
        //получить объем первого параллелепипеда
                vol = mybox1.volume();
                System.out.println("Объем равен: " + vol);
        //получить объем второго параллелепипеда
                vol = mybox2.volume();
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 8
        class Box {
            double width;
            double height;
            double depth;

        //Конструктор класса Box
            Box() {
                System.out.println("Конструирование объекта Box");
                width = 10;
                height = 10;
                depth = 10;
            }

            double volume() {
                return width * height * depth;
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты класса Box
                Box mybox1 = new Box();
                Box mybox2 = new Box();
                double vol;
                vol = mybox1.volume();
                System.out.println("Объем равен: " + vol);
                vol = mybox2.volume();
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 9
        class Box {
            double width;
            double height;
            double depth;

        //Конструктор класса Box
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }

        //рассчитать и возратить объем
            double volume() {
                return width * height * depth;
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты класса Box
                Box mybox1 = new Box(10,20,15);
                Box mybox2 = new Box(3,6,9);
                double vol;
        //получить объем первого параллелепипеда
                vol = mybox1.volume();
                System.out.println("Объем равен: " + vol);
        //получить объем второго параллелепипеда
                vol = mybox2.volume();
                System.out.println("Объем равен: " + vol);
            }
        }

Class Example 10
        class OverloadDemo {
            void test() {
                System.out.println("Параметры отсутствуют");
            }

            //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
            void test(int a) {
                System.out.println("a: " + a);
            }

            //Перегружаемый метод, проверяющий наличие двух целочисленных параметров
            void test(int a, int b) {
                System.out.println("a и b: " + a + " " + b);
            }

            //Перегружаемый метод, проверяющий наличие параметра типа double
            double test(double a) {
                System.out.println("double a: " + a);
                return a * a;
            }
        }

        class Overload {
            public static void main(String[] args) {
                OverloadDemo ob = new OverloadDemo();
                double result;
        //вызвать все варианты метода test()
                ob.test();
                ob.test(10);
                ob.test(10, 20);
                result = ob.test(123.25);
                System.out.println("Результат вызова ob.test(123.25): " + result);
            }
        }

Class Example 11
        //Применить автоматическое преобразование типов к перегрузке
        class OverloadDemo {
            void test() {
                System.out.println("Параметры отсутствуют");
            }

            //Перегружаемый метод, проверяющий наличие двух целочисленных параметров
            void test(int a, int b) {
                System.out.println("a и b: " + a + " " + b);
            }

            //Перегружаемый метод, проверяющий наличие параметра типа double
            void test(double a) {
                System.out.println("Внутренее преобразование при вызове " + "test(double) a: " + a);
            }
        }

        class Overload {
            public static void main(String[] args) {
                OverloadDemo ob = new OverloadDemo();
                int i = 88;
                ob.test();
                ob.test(10, 20);
                ob.test(i); //здесь вызывается вариант метода test(double)
                ob.test(123.2); //и здесь вызывается вариант метода test(double)
            }
        }

Class Example 12
        class Box {
            double width;
            double height;
            double depth;

            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }

            double volume() {
                return width * height * depth;
            }
        }

        class BoxDemo {
            public static void main(String[] args) {
                //Box mybox = new Box(); ОШИБКА!!!
            }
        }

Class Example 13
        class Box {
            double width;
            double height;
            double depth;

            //Конструктор, используемый при указании всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }

            //Конструктор, используемый, когда ни один из размеров не указан
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }

            Box(double len) {
                width = height = depth = len;
            }

            double volume() {
                return width * height * depth;
            }
        }

        class OverloadCons {
            public static void main(String[] args) {
        //Создать параллелепипеды, используя разные конструкторы
                Box mybox1 = new Box(10,20,15);
                Box mybox2 = new Box();
                Box mycube = new Box(7);
                double vol;
        //Получить объем первого параллелепипеда
                vol = mybox1.volume();
                System.out.println("Объем mybox1 равен: " + vol);
        //Получить объем второго параллелепипеда
                vol = mybox2.volume();
                System.out.println("Объем mybox2 равен: " + vol);
        //Получить объем куба
                vol = mycube.volume();
                System.out.println("Объем mycube равен: " + vol);
            }
        }

Class Example 14
        class Test {
            int a, b;

            //Конструктор, используемый при указании всех размеров
            Test(int a, int b) {
                this.a = a;
                this.b = b;
            }

            Test(Test t) {
                a = t.a;
                b = t.b;
            }

            //возвратить логическое значение true, если в качестве параметра o указан вызывающий объект
            boolean equals(Test o) {
                if (o.a == a && o.b == b) return true;
                else return false;
            }
        }

        class PassOb {
            public static void main(String[] args) {
                Test ob = new Test(100, 22);
                Test ob2 = new Test(ob);
                Test ob3 = new Test(-1, -1);
                System.out.println("ob == ob2 : " + ob.equals(ob2));
                System.out.println("ob == ob3 : " + ob.equals(ob3));
            }
        }

Class Example 15

Class Example 16
        class Test {
            int a;
            public int b;
            private int c;

            //Установить значение с данного класса
            void setC(int i) {
                c = i;
            }

            //Получить значение с данного класса
            int getC() {
                return c;
            }
        }

        class AccessTest {
            public static void main(String[] args) {
                Test ob = new Test();
                ob.a = 10;
                ob.b = 20;
        // ob.c = 10; ОШИБКА
                ob.setC(100);
                System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
            }
        }

Class Example 17
        class UseStatic {
            static int a = 3;
            static int b;
            static void meth(int x) {
                System.out.println("x: " + x);
                System.out.println("a: " + a);
                System.out.println("b: " + b);
            }
            static {
                System.out.println("Static block of code is initialized");
                b = a * 4;
            }
            public static void main(String[] args) {
                meth(42);
            }
        }

Class Example 18
        class StaticDemo {
            static int a = 42;
            static int b = 99;

            static void callMe() {
                System.out.println("a: " + a);
            }

        }

        class StaticByName {
            public static void main(String[] args) {
                StaticDemo.callMe();
                System.out.println("b: " + StaticDemo.b);
            }
        }
*/