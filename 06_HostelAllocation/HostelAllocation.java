import java.util.Scanner;

public class HostelAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Multidimensional Array (Hostel Floor: 3 rooms × 3 beds)
        int[][] floor = {
            {101, 102, 0}, // 0 means empty bed
            {103, 0, 0},
            {104, 105, 106}
        };

        System.out.println("🛏 current hostel allocation (room→beds):");

        // 2. For-Each Loop to print 2D array
        int roomNo = 1;
        for (int[] room : floor) {
            System.out.print("room " + roomNo++ + ": ");
            for (int studentID : room) {
                System.out.print(studentID + " ");
            }
            System.out.println();
        }

        // 3. Array Operations
        int totalStudents = 0;
        int emptyBeds = 0;
        int maxID = Integer.MIN_VALUE;
        int minID = Integer.MAX_VALUE;

        for (int[] room : floor) {
            for (int id : room) {
                if (id == 0) {
                    emptyBeds++; // count empty
                    continue;
                }
                totalStudents++; // count student
                maxID = Math.max(maxID, id); // max search
                minID = Math.min(minID, id); // min search
            }
        }

        System.out.println("\n📊 hostel analytics:");
        System.out.println("total students allocated : " + totalStudents);
        System.out.println("total empty beds         : " + emptyBeds);
        System.out.println("highest student id       : " + maxID);
        System.out.println("lowest student id        : " + minID);

        // 4. Update operation in array
        System.out.print("\nenter room number to allocate new student (1-3): ");
        int r = sc.nextInt() - 1;

        System.out.print("enter bed number (1-3): ");
        int b = sc.nextInt() - 1;

        System.out.print("enter student id: ");
        int newID = sc.nextInt();

        if (floor[r][b] == 0) {
            floor[r][b] = newID; // update array
            System.out.println("\n✅ allocation successful!");
        } else {
            System.out.println("\n❌ bed already occupied!");
        }

        System.out.println("\n🧾 updated hostel allocation:");

        // Again print using for-each
        roomNo = 1;
        for (int[] room : floor) {
            System.out.print("room " + roomNo++ + ": ");
            for (int id : room) {
                System.out.print(id + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
