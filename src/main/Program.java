package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập vào 1 số tiền: ");
      int money = 0;
      try {
          money = sc. nextInt();
      } catch (InputMismatchException exception){
          System.out.println("Input nhập vào không hợp lệ, số tiền vẫn là  0");
      }

        System.out.println(" Số tiền vừa nhập: " + money);

        // tạo lại Scanner nếu nhập số trước rồi tạo lại chuỗi
         sc = new Scanner(System.in);
        System.out.println(" Nhập họ tên nhân viên: ");
        String fullname = sc.nextLine();
        System.out.println(" Họ tên nhân viên vừa nhập: " + fullname);
        // Nhập tuổi
        System.out.println(" Nhập tuổi:");
        int age = sc.nextInt();
        System.out.println(" Tuổi vừa nhập: " + age);

    }
}
