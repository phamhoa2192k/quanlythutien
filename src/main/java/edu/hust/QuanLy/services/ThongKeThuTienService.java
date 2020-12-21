package edu.hust.QuanLy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.model.ThuTien;
import edu.hust.QuanLy.repositories.KhoanDongGopRepository;
import edu.hust.QuanLy.repositories.NhanKhauRepository;
import edu.hust.QuanLy.repositories.ThuTienRepository;

@Service
public class ThongKeThuTienService {
    @Autowired private ThuTienRepository thuTienRepository;
    @Autowired private NhanKhauRepository nhanKhauRepository;
    @Autowired private KhoanDongGopRepository khoanDongGopRepository;

    public List<List<String> > getThuTienByIdHoKhau(int idHoKhau){
        List<List<String>> li = new ArrayList<>();
        List<ThuTien> list = thuTienRepository.findThuTienByIdHoKhau(idHoKhau);
        if(list != null) System.out.println(list.size());
        for(ThuTien item : list){
            
            List<String> a = new ArrayList<>();
            a.add(khoanDongGopRepository.findById(item.getIdKhoanDongGop()).get().getTenKhoanThu());
            //System.out.println("---------------------------------"+ a.get(0));
            a.add(nhanKhauRepository.findById(item.getIdNguoiNop()).get().getHoTen());
            a.add(Integer.toString(item.getSoTien()));
            a.add(item.getGhiChu());
            li.add(a);
        }
        return li;
    }
}
