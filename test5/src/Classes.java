public class Classes {

}

class BoxDemo {
    public static void main(String[] args) {
        
    }
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

 */