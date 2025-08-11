package main;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // làm menu các chức năng

        System.out.println("==== Quản lý Sản Phẩm ====");

        System.out.println("1. Hiển thị DS sản phẩm");
        System.out.println("2. Thêm sản phẩm mới");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Xóa Sản phẩm");
        System.out.println("5. Thoát ");

        System.out.println("=== ");


        Scanner sc = new Scanner(System.in);

        // khi nhập không đúng từ 1- 5 , yêu cầu nhập lại ( sử dụng While
        /*while (true){
        }
*/
        int n = 0;
        while (n < 1 || n > 5){
            try {
                System.out.println("chức năng cần nhập từ 1 - 5. Vui lòng nhập lại ");
                System.out.println("Nhập chức năng:");

                 sc= new Scanner(System.in);
                n = sc.nextInt();

            }catch (Exception e){
                System.out.println("chức năng cần nhập từ 1 - 5. Vui lòng nhập lại ");
                System.out.println("Nhập chức năng:");

            }
        }



        if (n == 1) {
            System.out.println("== 1. Hiển thị DS sản phẩm ");
            System.out.println(" Nhập tên sản phẩm ");
            sc = new Scanner(System.in);
            String productName = sc.nextLine();
            ////
            // lấy dữ dlieeuj và in ra
        } else if (n == 2) {
            System.out.println("== 2. Thêm sản phẩm mới");
            System.out.println(" Nhập tên sản phẩm");
            sc = new Scanner(System.in);
            String tensanpham = sc.nextLine();
        } else if (n == 3) {
            System.out.println("== 3. Cập nhật sản phẩm");
            System.out.println(" Cập nhật sản phẩm");
            sc = new Scanner(System.in);
            String sanphamcapnhat = sc.nextLine();
        } else if (n == 4) {
            System.out.println("== 4. xóa sản phẩm");
            System.out.println("xóa sản phẩm");
            sc = new Scanner(System.in);
            String ProductName = sc.nextLine();

        } else if (n == 5) {
            System.out.println(" Đã thoát chương trình");
        }


    }

}
