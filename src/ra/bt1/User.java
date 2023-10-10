package ra.bt1;

import java.util.Scanner;

public class User {
   private int id;
   private String name;
   private String password;

    public User(String password, String name) {
        this.password = password;
        this.name = name;
        this.id = (int) Math.round(Math.random()*8999999)+100000;
    }
    public void signIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten dang nhap: ");
        String userLogin = scanner.nextLine();
        System.out.println("Mat khau: ");
        String userPass = scanner.nextLine();
        if (userLogin.equals(this.name) && userPass.equals(this.password)){
            System.out.println("Đăng nhập thành công");
            displayData();
            return;
        }
        System.out.println("Đăng nhập thất bại");
    }
    public void displayData() {
        System.out.println("User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}');
    }

}