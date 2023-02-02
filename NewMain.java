import java.util.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Hardware> Hardwares = new ArrayList<>();
        ArrayList<Employee> borrower = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        String Name;
        int i = 5;
        do {
            System.out.println("1.INSERT PERIPHERAL");
            System.out.println("2.DESIGNATE PERIPHERAL");
            System.out.println("3.VIEW TRANSACTION");
            System.out.println("4.VIEW ALL HARDWARES");
            System.out.println("5.Terminate Program/Exit");
            System.out.print("Enter Your Choice : ");
            i = s.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Enter Hardware name:");
                    Name = s.nextLine();
                    s.nextLine();
                    System.out.println("Enter Code:");
                    int code = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter typeofperipheral:");
                    String type = s.nextLine();
                    Hardware hard = new Hardware(Name, code, type);
                    Hardwares.add(hard);
                    break;

                case 2:
                    System.out.println("Enter Nameofborrower:");
                    String Nameofborrower = s.next();
                    s.nextLine();
                    System.out.println("Enter typeofperipheral:");
                    String itemborrowed = s.nextLine();

                    borrower.add(new Employee(Nameofborrower, itemborrowed));

                    break;
                case 3:

                    Iterator<Hardware> f = Hardwares.iterator();

                    while (f.hasNext()) {
                        Hardware r = f.next();
                        System.out.println(r);
                    }

                    break;
                case 4:
                    Iterator<Employee> g = borrower.iterator();

                    while (g.hasNext()) {
                        Employee y = g.next();
                        System.out.println(y);
                    }

                    break;
                case 5:
                    System.out.println("Program Terminated!!!!!!!!1");
                    break;

            }
        } while (i != 5);

    }
}

class Hardware {

    private String Name;
    private int code;
    private String typeofperipheral;

    Hardware(String Name, int code, String typeofperipheral) {
        this.Name = Name;
        this.code = code;
        this.typeofperipheral = typeofperipheral;
    }

    @Override
    public String toString() {
        return "Hardware{" + "Name=" + Name + ", code=" + code + ", typeofperipheral=" + typeofperipheral + '}';
    }

}

class Employee {

    private String Nameofborrower;
    private String itemborrowed;

    public Employee(String Nameofborrower, String itemborrowed) {
        this.Nameofborrower = Nameofborrower;
        this.itemborrowed = itemborrowed;
    }

    @Override
    public String toString() {
        return "Employee{" + "Nameofborrower=" + Nameofborrower + ", itemborrowed=" + itemborrowed + '}';
    }

}
