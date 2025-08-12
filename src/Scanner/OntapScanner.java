package Scanner;

import java.util.Scanner;

public class OntapScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // câu 1//
//        System.out.println("Nhập tên: ");
//        String ten = sc.nextLine();
//        if (ten.length()== 0){
//            System.out.println("Bạn vừa nhập tên là chuỗi rỗng");
//        }else {
//            System.out.println("Xin chào, " + ten);
//        }

//        // câu 2//
//        System.out.print("Số nguyên 1: ");
//        int x = sc.nextInt();
//        System.out.print("Số nguyên 2: ");
//        int y = sc.nextInt();
//        int tong = x + y;
//        System.out.println("Tổng của 2 số là: " + Tong);

//        // câu 3//
//        System.out.print("Nhập vào bán kình: ");
//        double bk = sc.nextDouble();
//        double pi = 3.14;
//        double s =  pi * bk * bk;
//        System.out.println("Diện tích của hình tròn: " + s);
//
//        // câu 4//
//        System.out.print("Nhập vào một số nguyên: ");
//        int soNguyen = sc.nextInt();
//
//        if( soNguyen %2 ==0){
//            System.out.println("Số nguyên vừa nhập: "+ soNguyen + " là số chẵn");
//        } else {
//            System.out.println("Số nguyên vừa nhập: "+ soNguyen + " là số lẻ");
//        }

//        //câu 5//
//        System.out.print("Nhập tuổi: ");
//        int tuoi = sc.nextInt();
//        if(tuoi < 0 || tuoi > 150){
//            System.out.println("Tuổi vừa nhập: " + tuoi + " : Sai, Tuổi không hợp lệ");
//        } else {
//            System.out.println("Tuổi vừa nhập: " + tuoi + " : Tuổi hợp lệ");
//        }


        // câu 6: không có ;
//        // câu 7 ax + b = 0
//        System.out.print("Nhập a: ");
//        double a = sc.nextDouble();
//        System.out.print("Nhập b: ");
//        double b = sc.nextDouble();
//
//        if(a==0) {
//            if(b == 0){
//                System.out.println("Phương trình vô số nghiệm.");
//            }else{
//            System.out.println("Phương trình vô nghiệm");
//        } else{
//            double nghiemX = -b /a;
//            System.out.println("Phương trình có nghiệm là: " + nghiemX);
//        }

        // Câu 8//
//        System.out.print("Nhập tên: ");
//        String fullName = sc.nextLine();
//        int namSinh;
//        while(true) {
//            try {
//                System.out.print("Nhập năm sinh: ");
//                namSinh = sc.nextInt();
//                if (namSinh >= 1900 && namSinh <= 2025) {
//                    int tuoi = 2025 - namSinh;
//                    System.out.println("Họ và Tên: " + fullName + " - Tuổi: " + tuoi);
//                    break; // hợp lệ thì thoát vòng lặp
//
//                } else {
//                    System.out.println("Năm sinh không hợp lệ, vui lòng nhập lại!");
//                }
//            } catch (Exception e) {
//                System.out.println("Vui lòng nhập số nguyên!");
//                sc.nextLine();
//            }
//        }
        // cau 9//

//        while (true) {
//            try {
//                System.out.print("Nhập vào a:");
//                int a = sc.nextInt();
//                System.out.print("Nhập vào b:");
//                int b = sc.nextInt();
//                System.out.print("Nhập vào c:");
//                int c = sc.nextInt();
//                if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
//                    System.out.println("=== 3 cạnh nhập vào đạp ứng là 1 tam giác ===");
//                    break;
//                } else {
//                    System.out.println("=== 3 cạnh nhập vào không đáp ứng là 3 cạnh của tam giá ===");
//                    System.out.println("=> Điều kiện: tổng 2 cạnh bất kỳ > độ dài cạnh còn lại. <=");
//                }
//
//            } catch (Exception e) {
//                System.out.println("Vui lòng nhập lại a, b, c!");
//                sc.nextInt();
//            }
//        }


         //câu10//
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println("Bảng cửu chương của " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println();
        }
        sc.close();

//        // câu 11//
//        System.out.print("Nhập vào 1 chuỗi: ");
//        String chuoi = sc.nextLine();
//        System.out.println("Chuỗi vừa nhập: " + chuoi + " Số ký tự: " + chuoi.length() );




        // làm lại bảng cửu chương

    }
}
