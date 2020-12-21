package edu.hust.QuanLy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.hust.QuanLy.model.KhoanDongGop;
import edu.hust.QuanLy.repositories.KhoanDongGopRepository;
import edu.hust.QuanLy.repositories.ThuTienRepository;
@Service
public class ThongKeKhoanChuaDongGopService {
    @Autowired ThuTienRepository thuTienRepository;
    @Autowired KhoanDongGopRepository khoanDongGopRepository;

    public List<KhoanDongGop> getKhoanBatBuoc(int idHoKhau){
        List<KhoanDongGop> list = khoanDongGopRepository.findKhoanDongGopByIdLoaiDongGop(1);
        return list;

    }

    public List<KhoanDongGop> getKhoanTuNguyen(int idHoKhau){
        List<KhoanDongGop> list = khoanDongGopRepository.findKhoanDongGopByIdLoaiDongGop(2);
        return list;
    }
}
