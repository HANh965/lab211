/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changebase;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Main {

    // 👉 Hàm này dùng để chuyển đổi giữa các hệ cơ số
    public static String convertBase(String value, int fromBase, int toBase) {
        try {
            // Bước 1: Chuyển số nhập vào (ở hệ fromBase) sang hệ thập phân
            int decimalValue = Integer.parseInt(value, fromBase);

            // Bước 2:1 Từ số thập phân, đổi sang hệ toBase (kết quả in hoa)
            return Integer.toString(decimalValue, toBase).toUpperCase();

        } catch (NumberFormatException e) {
            // Nếu người dùng nhập sai định dạng (ví dụ nhập "2" mà chọn Binary)
            return "❌ Invalid number for base " + fromBase;
        }
    }

    // 👉 Hàm này để chọn hệ cơ số (2, 10, hoặc 16)
    public static int chooseBase(Scanner sc, String type) {
        while (true) {
            System.out.println("\nChoose " + type + " base system:");
            System.out.println("1. Binary (2)");
            System.out.println("2. Decimal (10)");
            System.out.println("3. Hexadecimal (16)");
            System.out.print("Your choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    return 2;  // hệ nhị phân
                case "2":
                    return 10; // hệ thập phân
                case "3":
                    return 16; // hệ thập lục phân
                default:
                    System.out.println("⚠️ Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }

    // 👉 Chương trình chính
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chạy lặp đến khi người dùng muốn thoát
        while (true) {
            System.out.println("\n=== CHANGE BASE NUMBER SYSTEM PROGRAM ===");

            // Chọn hệ cơ số đầu vào và đầu ra
            int fromBase = chooseBase(sc, "input");
            int toBase = chooseBase(sc, "output");

            // Nhập số cần chuyển đổi
            System.out.print("\nEnter number in base " + fromBase + ": ");
            String value = sc.nextLine().trim();

            // Gọi hàm chuyển đổi
            String result = convertBase(value, fromBase, toBase);

            // In kết quả
            System.out.println("=> Result in base " + toBase + ": " + result);

            // Hỏi có muốn tiếp tục không
            System.out.print("\nDo you want to continue? (Y/N): ");
            String cont = sc.nextLine().trim();
            if (cont.equalsIgnoreCase("N")) {
                System.out.println("👋 Program exited. Goodbye!");
                break;
            }
        }

        sc.close();
    }
}
 
/*public class Main {

    // 👉 Hàm này dùng để chuyển đổi giữa các hệ cơ số (Base 2 đến 36)
    public static String convertBase(String value, int fromBase, int toBase) {
        try {
            // Bước 1: Chuyển số nhập vào (ở hệ fromBase) sang hệ thập phân
            // Hàm Integer.parseInt hỗ trợ Base từ 2 đến 36
            int decimalValue = Integer.parseInt(value, fromBase);

            // Bước 2: Từ số thập phân, đổi sang hệ toBase (kết quả in hoa)
            // Hàm Integer.toString cũng hỗ trợ Base từ 2 đến 36
            return Integer.toString(decimalValue, toBase).toUpperCase();

        } catch (NumberFormatException e) {
            // Xử lý lỗi nếu người dùng nhập ký tự không hợp lệ cho hệ cơ số đã chọn
            return "❌ Invalid number for base " + fromBase + ". Ensure characters are within 0-"
                    + (fromBase > 10 ? ('9' + " and A-" + (char) ('A' + fromBase - 11)) : (char) ('0' + fromBase - 1));
        }
    }

    // 👉 Hàm này để chọn hệ cơ số (cho phép nhập bất kỳ từ 2 đến 36)
    public static int chooseBase(Scanner sc, String type) {
        while (true) {
            System.out.println("\nChoose " + type + " base system (2 to 36):");
            System.out.println("   (Ex: 2: Binary, 8: Octal, 10: Decimal, 16: Hexadecimal)");
            System.out.print("Enter base value: ");

            try {
                String baseInput = sc.nextLine().trim();
                int base = Integer.parseInt(baseInput);

                // Kiểm tra ràng buộc: Base phải nằm trong khoảng [2, 36]
                if (base >= 2 && base <= 36) {
                    return base;
                } else {
                    System.out.println("⚠️ Invalid base. Please enter an integer value between 2 and 36.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input. Please enter a valid integer number for the base.");
            }
        }
    }

    // 👉 Chương trình chính
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Chạy lặp đến khi người dùng muốn thoát
            while (true) {
                System.out.println("\n=== ADVANCED BASE NUMBER SYSTEM CONVERTER ===");

                // Chọn hệ cơ số đầu vào và đầu ra
                int fromBase = chooseBase(sc, "input");
                int toBase = chooseBase(sc, "output");

                // Nhập số cần chuyển đổi
                System.out.print("\nEnter number in base " + fromBase + ": ");
                String value = sc.nextLine().trim();

                // Gọi hàm chuyển đổi
                String result = convertBase(value, fromBase, toBase);

                // In kết quả
                System.out.println("=> Result in base " + toBase + ": " + result);

                // Hỏi có muốn tiếp tục không
                System.out.print("\nDo you want to continue? (Y/N): ");
                String cont = sc.nextLine().trim();
                if (cont.equalsIgnoreCase("N")) {
                    System.out.println("👋 Program exited. Goodbye!");
                    break;
                }
            }
        } // Scanner tự động đóng ở đây
    }
}
