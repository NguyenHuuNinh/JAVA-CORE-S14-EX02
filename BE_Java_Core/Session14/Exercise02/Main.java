package vn.edu.rikkei.session14.ex02;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- THỬ NGHIỆM MULTI-CATCH BUDGET CALCULATOR ---");
        System.out.println("TH1: Phòng 0 (10 người), Ngân sách 50,000,000 -> Hợp lệ");
        System.out.println("TH2: Phòng 1 (0 người),  Ngân sách 50,000,000 -> ArithmeticException");
        System.out.println("TH3: Phòng 9 (Không tồn tại), Ngân sách 50,000,000 -> ArrayIndexOutOfBounds\n");

        BudgetCalculator calculator = new BudgetCalculator();
        int totalBudget = 50000000;

        System.out.println("+-------------------------------------------------+");
        System.out.println("|           NHẬT KÝ PHÂN BỔ NGÂN SÁCH MULTI-CATCH |");
        System.out.println("+-------------------------------------------------+");

        calculator.calculateAverage(0, totalBudget);
        calculator.calculateAverage(1, totalBudget);
        calculator.calculateAverage(9, totalBudget);

        System.out.println("+-------------------------------------------------+");
    }
}
