package vn.edu.rikkei.session14.ex02;

public class BudgetCalculator {
    private int[] staffCounts = { 10, 0, 25 };

    public void calculateAverage(int deptIndex, int budget) {
        try {
            int count = staffCounts[deptIndex];
            int average = budget / count;

            System.out.printf("| [Phòng %d] Ngân sách TB: %,d VNĐ / người %6s|\n", deptIndex, average, "");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("| [Phòng %d] LỖI: Mã phòng ban không tồn tại! %7s|\n", deptIndex, "");

        } catch (ArithmeticException e) {
            System.out.printf("| [Phòng %d] LỖI: Phòng ban chưa có nhân sự (Chia cho 0) |\n", deptIndex);

        } catch (Exception e) {
            System.out.println("| LỖI: Đã xảy ra một lỗi hệ thống không xác định! |");
        }
    }
}
