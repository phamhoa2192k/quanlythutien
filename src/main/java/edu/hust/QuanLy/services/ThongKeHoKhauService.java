package edu.hust.QuanLy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.model.HoKhau;
import edu.hust.QuanLy.repositories.HoKhauRepository;
import edu.hust.QuanLy.repositories.NhanKhauRepository;

@Service
public class ThongKeHoKhauService {
    @Autowired HoKhauRepository hoKhauRepository;
    @Autowired NhanKhauRepository nhanKhauRepository;


    public List<List<String> > getAllHoKhau(){
        List<List<String>> li = new ArrayList<>();
        List<HoKhau> list = hoKhauRepository.findAll();
        for(HoKhau item : list){
            List<String> a = new ArrayList<>();
            a.add(Integer.toString(item.getId()));
            a.add(nhanKhauRepository.findById(item.getIdChuHo()).get().getHoTen());
            a.add(item.getDiaChi());
            li.add(a);
        }
        return li;
    }
}
