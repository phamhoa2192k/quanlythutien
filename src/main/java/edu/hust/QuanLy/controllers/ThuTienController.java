package edu.hust.QuanLy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.model.HoKhau;
import edu.hust.QuanLy.services.ThongKeThuTienService;
import edu.hust.QuanLy.services.ThuTienService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/thutien")
public class ThuTienController {
    @Autowired ThuTienService thuTienService;
    @Autowired ThongKeThuTienService thongKeThuTienService;

    @GetMapping(value="")
    public String getThuTienPage(Model model) {
        return "thutien";
    }

    @PostMapping(value="/timhokhau")
    public String postTenChuHo(String tenChuHo, Model model) {
        List<HoKhau> hokhaus = thuTienService.findHoKhauByTenChuHo(tenChuHo);
        if(hokhaus.isEmpty()) model.addAttribute("hokhaus", new ArrayList<>());
        else model.addAttribute("hokhaus", hokhaus);
        model.addAttribute("tenChuHo", tenChuHo);
        return "thutien_timhokhau";
    }

    @GetMapping("/thutien/{id}")
    public String getNopTienPage(@PathVariable("id") int id, Model model){
        return "noptien";
    }

    @GetMapping("/lichsu/{id}")
    public String getLichSuPage(@PathVariable("id") int id, Model model){
        model.addAttribute("khoanthus", thongKeThuTienService.getThuTienByIdHoKhau(id));
        return "lichsu";
    }  
}
