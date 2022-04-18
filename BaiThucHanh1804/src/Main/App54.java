package Main;
import Shapes.HinhTron;
import Shapes.hinhChuNhat;
import Shapes.HinhTru;
import Shapes.HinhVuong;
public class App54 {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        
        //kiem tra hình trụ
        HinhTru hTru = new HinhTru();
        hTru.xuatTen();
        hTru.nhapChieuCao();
        hTru.tinhTheTich();
        hTru.inTheTich();

        //kiem tra hinh chữ nhật
        HinhChuNhat hCN = new HinhChuNhat();
        hCN.xuatTen();
        hCN.nhapChieuDai();
        hCN.nhapChieuRong();
        hCN.tinhChuVi();
        hCN.tinhDienTich();
        hCN.inChuVi();
        hCN.inDienTich();

        //kiem tra hình vuông
        HinhVuong hV = new HinhVuong();
        hV.xuatTen();
        hV.nhapChieuDai();
        hV.tinhChuVi();
        hV.tinhDienTich();
        hV.inChuVi();
        hV.inDienTich();
}
}