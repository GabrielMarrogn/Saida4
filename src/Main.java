public class Main {
    public static void main(String[] args) {
        String[] d = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };
        String[] o = { "0", "1", "2", "3", "4", "5", "6", "7", "10", "11", "12", "13", "14", "15", "16", "17" };
        String[] h = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        int cont = -4;

        for (int i = 1; i <= 20; i++) {
            cont++;
            if (i == 1 || i == 3 || i == 20) {
                for (int k = 0; k < 39; k++) {
                    System.out.print("-");
                }
            } else if (i == 2) {
                for (int k = 1; k <= 19; k++) {
                    if (k == 1 || k == 7 || k == 13 || k == 19) {
                        System.out.print("|");
                    } else if (k == 4) {
                        System.out.print("decimal");
                    } else if (k == 10) {
                        System.out.print("octal");
                    } else if (k == 16) {
                        System.out.print("Hexadecimal");
                    } else {
                        System.out.print(" ");
                    }

                }
            } else if (cont < 8) {
                for (int k = 1; k <= 39; k++) {

                    if (k == 1 || k == 13 || k == 23 || k == 39) {
                        System.out.print("|");
                    } else if (k == 8) {
                        System.out.print(d[cont]);
                    } else if (k == 18) {
                        System.out.print(o[cont]);
                    } else if (k == 31) {
                        System.out.print(h[cont]);
                    }

                    else {
                        System.out.print(" ");
                    }

                }
            } else if (cont == 8 || cont == 9) {
                for (int k = 1; k <= 38; k++) {

                    if (k == 1 || k == 13 || k == 22 || k == 38) {
                        System.out.print("|");
                    } else if (k == 8) {
                        System.out.print(d[cont]);
                    } else if (k == 17) {
                        System.out.print(o[cont]);
                    } else if (k == 30) {
                        System.out.print(h[cont]);
                    }

                    else {
                        System.out.print(" ");
                    }
                }
            } else if (cont > 9) {
                for (int k = 1; k <= 37; k++) {
                    if (k == 1 || k == 12 || k == 21 || k == 37) {
                        System.out.print("|");
                    } else if (k == 7) {
                        System.out.print(d[cont]);
                    } else if (k == 16) {
                        System.out.print(o[cont]);
                    } else if (k == 29) {
                        System.out.print(h[cont]);
                    }

                    else {
                        System.out.print(" ");
                    }
                }

            }

            System.out.println();
        }
        System.out.println();
    }
}
