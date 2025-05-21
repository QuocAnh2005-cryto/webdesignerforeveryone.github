package hello.java;

import java.util.Scanner;
// ~ include<stdio.h>
public class HelloJava {

    public static void main(String[] args) {
//       playWithVariables();
//       playWithInterger();
//       playWithdouble();
//       playWithCharacter();
//       playWithBolean();
//       printIntergerList();
//        printIntergerList(100);   //hard_code, cố định đầu vào
                                  //literal quá nhiều chỗ 
                                  //mà thực tế thì cần tương tác người dùng
                                  //
         int n;
         n = getApositiveInterger();
         System.out.println("Your number: "+ n);
         printIntergerList(n);
    }
    
    //hàm trả về 1 con số nguyên nhập từ bàn phím
    public static int getApositiveInterger (){
        //Nhập từ bàn phím, data đi vào ram, cần biến hứng
        int n;
        Scanner banPhiCuaTui = new Scanner(System.in);
        System.out.println("Input a positive number: ");
        n = banPhiCuaTui. nextInt();
        
        return n;   //getApositiveInterger () = n
    }
    
    //Hiện tượng một class bất kì chứa nhiều hàm trùng tên 
    //nhưng khác phần tham số, phải khác trên data types chứ ko phải khác tên biến
    //gọi là overload / overloading, quá tải hàm
    //Và phân biệt nó với overide, hàm kế thừa
     public static void printIntergerList(int n){
        //Không nên dùng scanf ở đây, coi như  đã có value r 
        //lúc gọi hàm, lôi hàm ra
          System.out.println("The list of " + n + " first intergers");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", (i));
            
        }
         System.out.println("");
        
    }
    
    //In ra các số tự nhiên từ 1-100
    public static void printIntergerList(){
        System.out.println("The list of 100 firt intergers");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
    }
    
    public static void playWithBolean (){
        //Java: đúng: true, sai: false --->bolean
        boolean marriedStatus  = false; 
        if(marriedStatus == true )
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chư ai vào");
    }
    
    public static void playWithCharacter (){
        //2 byte cho kiểu char, lư bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m );
        //tên em thì sao? C: mảng các kí tự, ko primative, phức tạp hơn
        
        String name = "Hoàng Ngọc Trinh";
                                               //loại data type mới hoàn toàn
                                               //phức tạp
                                               //object data type
        System.out.println("name: " + name); 
        System.out.println("1st letter of my name: " + name.charAt(0)); 
        System.out.println("My name as a lower case: " + name.toLowerCase()); 
        
    }
    
    //Java ưu tiên double hơn float
    public static void playWithdouble (){
        double y = 3.14;
        System.out.println("pi: " +y);
        System.out.printf("pi: %.2f\n", y); //cấm dùng %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        
    }
    
    public static void playWithInterger(){
        int n = 39;  //mọi con số xuất hiện trong code
                     //literal value
                     //Số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        long m = 3000_000_000L;
        System.out.println("n: " + m);
        
        int status = 0xFA;  //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010; //số 0 đứng trước là hệ 8
        System.out.println("phone: " +phone);
        
        
    }
    //static chir choiw voiws static - OOP
    public static void playWithVariables (){
        //biến là vùng ram được đặt tên chiếm một số byte nhất định tuỳ loại
        //dữ liệu/ thông tin mà nó chứa bên trong - datatypes - hình thức data
        //số, chữ, ảnh.....
        //biến là cách đạt trên cho một đại lượng 
        int age = 20; 
        int a = 10, b;
        b = 100;
        
        //tốn 12 bytes tronf ram để lưu trữ các thông tin 
        System.out.println("age: " + age);
        int yob = 2005; 
        age = 2025 - yob;
        System.out.println("age: " + age);
        System.out.println("age: " + (2025 - yob));
        //thay đổi độ ưu tiên trong phép toán
        System.out.printf("age changing is : %d\n", (2025 - yob));
        
    }
}


//Kiểm tra 1 số có phải số nguyên tố hay ko
//public static bolean isPrime (int n)

//Viết hàm in các số nguyên tố từ 1 - 1000
// public static void print1000IsPrime (); --->while

//Viết hàm nhập vào từ bàn phím hệ số  a và b 
//thông qua phương trình ax + b = c   => x ?
//public static void solve ();
