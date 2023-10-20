import java.util.*;
import java.io.*;

public class TestKhachHang {

    public static void main(String[] args) {
        ArrayList<KhachHang> khachHang = new ArrayList<>();

        khachHang.add(new KhachHangMoi("522H0006", "Dang Thanh Nhan", "Nam", "15/2", 15, 2000));
        khachHang.add(new KhachHangThanThiet("522H0007", "Vo Nhat Hao", "Nam", "16/2", 16, 2000, 152000));
        khachHang.add(new KhachHangVIP("522H0008", "Nguyen Thanh Nhan", "Nam", "17/2", 17, 2000, "Diamond"));

        // for (KhachHang obj : khachHang) {
        //     if (obj instanceof KhachHangMoi) {
        //         KhachHangMoi khm = (KhachHangMoi) obj;
        //         System.out.println(khm.toString());

        //     }
        //     else if (obj instanceof KhachHangThanThiet) {
        //         KhachHangThanThiet khtt = (KhachHangThanThiet) obj;
        //         System.out.println(khtt.toString());

        //     }
        //     if (obj instanceof KhachHangVIP) {
        //         KhachHangVIP khv = (KhachHangVIP) obj;
        //         System.out.println(khv.toString());

        //     }
        // }

        for (KhachHang kh : khachHang) {
            System.out.println(kh.toString());
        }
    } 
}