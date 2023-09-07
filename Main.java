package mainapppackage1;

import java.util.Scanner;

class Elevator {
    int floor;
    int fromnum;
    int tonum;

    public Elevator() {}

    public void floornum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the total number of floors： ");
        int num = scanner.nextInt();
        floor = num;
    }

    public void fromfloor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the current floor： ");
        int num = scanner.nextInt();
        fromnum = num;
    }

    public void tofloor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the floor you want to go to： ");
        int num = scanner.nextInt();
        tonum = num;
    }

    public void moveup() {
        for (int i = fromnum + 1; i <= tonum; i++) {
            System.out.println("Going upstairs. . ." + i + "building");
            fromnum++;
        }
    }

    public void movedown() {
        for (int i = fromnum - 1; i >= tonum; i--) {
            System.out.println("going downstairs. . ." + i + "building");
            fromnum--;
        }
    }

    public void stopAndopendoor() {
        System.out.println("\narrive " + tonum + " building,opendoor!\n");
    }

    public void closedoor() {
        System.out.println("\nPlease note，closedoor!\n\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Elevator elev = new Elevator();
        elev.floornum();
        elev.fromfloor();
        if (elev.fromnum < 1 || elev.fromnum > elev.floor) {
            System.out.println("Departure floor is illegal！！！");
            return;
        }
        elev.tofloor();
        if (elev.tonum < 1 || elev.tonum > elev.floor) {
            System.out.println("Arrival floor is illegal！！！");
            return;
        }
        elev.closedoor();
        if (elev.fromnum > elev.tonum) {
            elev.movedown();
        }
        if (elev.fromnum < elev.tonum) {
            elev.moveup();
        }
        if (elev.fromnum == elev.tonum) {
            elev.stopAndopendoor();
        }
    }
}
