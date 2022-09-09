// switch case = menu driven program

class SwitchTest {
    static void add(int n, int m) {
        System.out.println(n + m);
    }

    static void sub(int n, int m) {
        System.out.println(n - m);
    }

    static void mul(int n, int m) {
        System.out.println(n * m);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter your choice : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Option Chosen");
        }

    }

}
