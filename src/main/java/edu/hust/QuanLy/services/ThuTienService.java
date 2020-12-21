package edu.hust.QuanLy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.model.HoKhau;
import edu.hust.QuanLy.model.NhanKhau;
import edu.hust.QuanLy.repositories.HoKhauRepository;
import edu.hust.QuanLy.repositories.NhanKhauRepository;

@Service
public class ThuTienService {
    @Autowired NhanKhauRepository nhanKhauRepository;
    @Autowired HoKhauRepository hoKhauRepository;

    public List<HoKhau> findHoKhauByTenChuHo(String tenChuHo){
        List<HoKhau> hokhaus = new ArrayList<>();
        List<NhanKhau> nhankhaus = nhanKhauRepository.findByHoTen(tenChuHo);
        for(NhanKhau nhankhau : nhankhaus){
            HoKhau h = hoKhauRepository.findByIdChuHo(nhankhau.getId());
            if(h != null) hokhaus.add(h);
        }
        return hokhaus;
    }
}
