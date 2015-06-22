public class Calculate {

    public static void main(String[] args) {

        System.out.println("Calculate...");

        if (args.length == 0) {
            System.out.println("No incoming args... Run in test mode.");
            runTest();
        } else {
            double[] stringToDouble = new double[args.length];
            for (int i = 0; i < stringToDouble.length; i++) {
                stringToDouble[i] = Double.parseDouble(args[i]);
            }
            ariphmetics(stringToDouble);
        }
    }

    private static void runTest() {

        System.out.println("Initializing test arguments...");
        System.out.println();
        double[] argsTest;
        int numOfArgs = (int) ((Math.random() * 5) + 1);
        argsTest = new double[numOfArgs];

        for (int i = 0; i < argsTest.length; i++) {
            double argsTestNum = ((Math.random() * 10.3) + 1.2);
            argsTest[i] = argsTestNum;
        }

        for (double j : argsTest) {
            System.out.println(String.format("%.2f", j));
        }
        System.out.println();
        System.out.println("Start testing...");
        System.out.println();
        ariphmetics(argsTest);
    }

    private static void ariphmetics(double argus[]) {
        double a, b, c, d;
        a = b = c = d = argus[0];

        for (int i = 1; i < argus.length; i++) {
            a += argus[i];
            b *= argus[i];
            c -= argus[i];
            d /= argus[i];
        }

        System.out.print("Addition: ");
        System.out.println(String.format("%.2f", a));

        System.out.print("Multiplication: ");
        System.out.println(String.format("%.2f", b));

        System.out.print("Subtraction: ");
        System.out.println(String.format("%.2f", c));

        System.out.print("Degree: ");
        System.out.println(String.format("%.2f", d));

    }
}
