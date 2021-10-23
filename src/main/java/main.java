public class main {
/**
 * đầu vào là hai số kiểu double theo thứ tự là điểm giữa kì và cuối kì
 * chương trình trả về đánh giá học lực của sinh viên dựa theo điểm trung bình (ĐTB)
 * khung đánh giá
 *       trượt:      ĐTB < 4
 *       trung bình  4 <= ĐTB < 6.5
 *       khá         6.5 <= ĐTB < 8
 *       giỏi        ĐTB >= 8
 * ĐTB = giữa kì * 0.4 + cuối kì * 0.6
 * ĐTB được làm tròn 1 chữ số sau dấu phẩy
 * miền giá trị: giữa kì [0.00, 10.00]
 *               cuối kì [0.00, 10.00]
 */
    public static String checkDiem(double giuaki, double cuoiki) {
        String output = null;
        if (giuaki < 0 || giuaki > 10 || cuoiki < 0 || cuoiki > 10) {
            output = "Diem khong hop le";
        } else {
            double diem = giuaki * 0.4 + cuoiki * 0.6;
            diem = (double) Math.round(diem * 10) / 10;
            if (diem < 4) {
                output = "Truot";
            } else if (diem < 6.5) {
                output = "Trung binh";
            } else if (diem < 8) {
                output = "Kha";
            } else {
                output = "Gioi";
            }
        }
        return output;
    }
}
