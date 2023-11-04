public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        int c = 15;
        long d = 18l;
        float e = 150.3424f;
        double f = 140.241412412d;

        do {
            a += b;
        } while (a <= 100);

        System.out.println(a);

        for (int i = 0; i < b; i++) {
            System.out.println(b -= 1);
        }

        String result = (c < 18) ? "Ur a kid." : "Ur an adult.";
        System.out.println(result);

        double g = (e * f) / 100;
        System.out.println(g);

        double[] numbers = new double[6];
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    numbers[i] = a;
                    break;
                case 1:
                    numbers[i] = b;
                    break;
                case 2:
                    numbers[i] = c;
                    break;
                case 3:
                    numbers[i] = d;
                    break;
                case 4:
                    numbers[i] = e;
                    break;
                case 5:
                    numbers[i] = f;
                    break;
            }
        }

        double average;
        double sum = 0;

        for (double number :
                numbers) {
            System.out.println(number);
            sum += number;
        }

        average = sum / (double) numbers.length;

        System.out.println(average);

        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);

        System.out.println(a);
        System.out.println(b);
        double area = a * b;
        double volume = a + a + b + b;
        System.out.println(area);
        System.out.println(volume);

        double areaT = 0.5 * c * d;
        System.out.println(areaT);

        double diameter = e;
        double areaC = Math.PI * Math.pow((diameter / 2), 2);
        double volumeC = 2 * Math.PI * diameter / 2;
        System.out.println(areaC);
        System.out.println(volumeC);

        double h = 3;
        double i = 4;
        double j = 5;
        boolean isRight;

        if (Math.pow(h,2) + Math.pow(i, 2) == Math.pow(j, 2) || Math.pow(j,2) + Math.pow(i, 2) == Math.pow(h, 2) || Math.pow(h,2) + Math.pow(j, 2) == Math.pow(i, 2)) {
            isRight = true;
        } else {
            isRight = false;
        }

        String r = (isRight) ? "It is a right tringle." : "It is not a right tringle.";
        System.out.println(r);


//        Zadeklaruj po kilka zmiennych różnych typów i potestuj wywoływanie na nich działań +, -, *, /, %.
//
//        Oblicz średnią arytmetyczną z tych liczb.

//        Zadeklaruj zmienną typu int i potestuj operację ++ i -- zarówno w opcji pre jak i post.
//
//        Zadeklaruj dwie zmienne odpowiadające bokom prostokąta i policz jego pole oraz obwód.
//
//        Przypisz wartość pola i obwodu do zmiennych. Jakiego typu mogą być te zmienne?

//        Zadeklaruj dwie zmienne odpowiadające bokom (przyprostokątnym) trójkąta prostokątnego i policz jego pole.
//
//        Przypisz wartość pola do zmiennej. Jakiego typu może być ta zmienna?

//        Zadeklaruj zmienną odpowiadającą średnicy koła i policz jego pole i obwód.
//
//        Przypisz wartości pola i obwodu do zmiennych. Jakiego typu mogą być te zmienne?

//        Zadeklaruj trzy zmienne odpowiadające bokom trójkąta i sprawdź, czy jest on prostokątny.
//
//        Przypisz wynik do zmiennej. Jakiego typu powinna być ta zmienna?
    }
}
