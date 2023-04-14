/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SanPham {
     String tenSP;
     double donGia;
     double giamGia;
    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau(){
        return donGia/10;
    }
    public void nhap(){
        System.out.println("nhap ten sp:");
        Scanner sc=new Scanner(System.in);
        tenSP=sc.nextLine();
        System.out.println("nhap don gia sp:");
        donGia=sc.nextDouble();
        System.out.println("nhap giam gia sp:");
        giamGia=sc.nextDouble();
                
        
    }
    void xuat(){
        System.out.println("ten sp:"+tenSP);        
        System.out.println("don gia sp:"+donGia);
        System.out.println("giam gia sp:"+giamGia);
    }

    
    
    
}
