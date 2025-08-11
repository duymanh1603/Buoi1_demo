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
//
//        // câu 2//
//        System.out.print("Số nguyên 1: ");
//        int x = sc.nextInt();
//        System.out.print("Số nguyên 2: ");
//        int y = sc.nextInt();
//        int Tong = x + y;
//        System.out.println("tổng của 2 số là: " + Tong);
//
//        // câu 3//
//        System.out.print("Nhập vào bán kình: ");
//        double bk = sc.nextDouble();
//        double pi = 3.14;
//        double S =  pi * bk *2;
//        System.out.println("Diện tích của hình tròn: " + S);
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
//
//        //câu 5//
//        System.out.print("Nhập tuổi: ");
//        int tuoi = sc.nextInt();
//        if(tuoi < 0 || tuoi > 150){
//            System.out.println("Tuổi vừa nhập: " + tuoi + " : Sai, Tuổi không hợp lệ");
//        }
//        else {
//            System.out.println("Tuổi vừa nhập: " + tuoi + " : Tuổi hợp lệ");
//        }

        // câu 6 ax + b = 0
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        if( a==0 ){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm.");
            }
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            double nghiemX = -b /a;
            System.out.println("Phương trình có nghiệm là: " + nghiemX);
        }

        // Câu 7//
    }
}
