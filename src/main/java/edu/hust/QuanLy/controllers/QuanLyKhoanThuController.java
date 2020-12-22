package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.hust.QuanLy.model.KhoanDongGop;
import edu.hust.QuanLy.repositories.KhoanDongGopRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QuanLyKhoanThuController {

    @Autowired private KhoanDongGopRepository khoanDongGopRepository;

    @GetMapping("/quanlykhoanthu")
    public String getQuanLyKhoanThuPage(Model model){
        model.addAttribute("khoanthus", khoanDongGopRepository.findAll());
        return "quanlykhoanthu";
    }

    @PostMapping(value="/quanlykhoanthu/them")
    public String postThemForm(@RequestParam String tenKhoanThu,
                                @RequestParam int idKhoanThu,
                                @RequestParam int soTienToiThieu,
                                @RequestParam String thoiGianDong) {

        KhoanDongGop k = new KhoanDongGop(tenKhoanThu, idKhoanThu, soTienToiThieu, thoiGianDong);
        khoanDongGopRepository.save(k);
        return "redirect:/quanlykhoanthu";
    }

    @GetMapping("/quanlykhoanthu/xoa/{id}")
    public String xoaKhoanThu(@PathVariable("id") int id) {
        khoanDongGopRepository.deleteById(id);
        return "redirect:/quanlykhoanthu";
    }
    
    
}
