import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Cate numere doresti sa introduci? ");
            int n = scanner.nextInt();

            
            double[] numere = new double[n];

            
            System.out.println("Introduceti " + n + " numere:");
            for (int i = 0; i < n; i++) {
                numere[i] = scanner.nextDouble();
            }

            
            boolean continua = true;
            while (continua) {
                
                System.out.println("Ce doresti sa afli?");
                System.out.println("1 - Suma numerelor");
                System.out.println("2 - Produsul numerelor");
                System.out.println("3 - Catul numerelor");
                System.out.println("4 - Iesire");
                System.out.print("Alege optiunea (1, 2, 3 sau 4 pentru a iesi): ");
                int optiune = scanner.nextInt();

                double rezultat = 0;

                
                switch (optiune) {
                    case 1:
                        for (int i = 0; i < n; i++) {
                            rezultat += numere[i];
                        }
                        System.out.println("Suma numerelor este: " + rezultat);
                        break;

                    case 2:
                        rezultat = 1;
                        for (int i = 0; i < n; i++) {
                            rezultat *= numere[i];
                        }
                        System.out.println("Produsul numerelor este: " + rezultat);
                        break;

                    case 3:
                        
                        if (n < 2) {
                            System.out.println("Pentru a calcula catul trebuie să ai cel puțin 2 numere.");
                        } else {
                            rezultat = numere[0];
                            for (int i = 1; i < n; i++) {
                                if (numere[i] != 0) {
                                    rezultat /= numere[i];
                                } else {
                                    System.out.println("Nu se poate imparti la 0!");
                                    return;
                                }
                            }
                            System.out.println("Catul numerelor este: " + rezultat);
                        }
                        break;

                    case 4:
                        continua = false;
                        System.out.println("Programul se inchide.");
                        break;

                    default:
                        System.out.println("Optiune invalida!");
                        break;
                }
            }
        } finally {
            
            scanner.close();
        }
    }
}
