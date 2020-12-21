package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.repositories.HoKhauRepository;
import edu.hust.QuanLy.repositories.NhanKhauRepository;
import edu.hust.QuanLy.services.ThongKeHoKhauService;


@Controller
public class MainController {
    @Autowired private NhanKhauRepository nhanKhauRepository;
    @Autowired private HoKhauRepository hoKhauRepository;
    @Autowired private ThongKeHoKhauService thongKeHoKhauService;
    @GetMapping("/thongke")
    public String getDashboardPage(Model model){
        model.addAttribute("soNhanKhau", nhanKhauRepository.findAll().size());
        model.addAttribute("soHoKhau", hoKhauRepository.findAll().size());
        return "thongke";
    }

    @GetMapping("/nhankhau")
    public String getNhanKhauPage(Model model){
        model.addAttribute("nhankhaus", nhanKhauRepository.findAll());
        return "nhankhau";
    }

    @GetMapping(value="/hokhau")
    public String getHoKhauPage(Model model) {
        model.addAttribute("hokhaus", thongKeHoKhauService.getAllHoKhau());
        return "hokhau";
    }
    
}
