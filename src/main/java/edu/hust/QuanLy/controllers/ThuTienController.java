package edu.hust.QuanLy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.model.HoKhau;
import edu.hust.QuanLy.model.ThuTien;
import edu.hust.QuanLy.repositories.ThuTienRepository;
import edu.hust.QuanLy.services.ThongKeKhoanChuaDongGopService;
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
    @Autowired ThongKeKhoanChuaDongGopService thongKeKhoanChuaDongGopService;
    @Autowired ThuTienRepository thuTienRepository;

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

    @GetMapping("/noptien/{id}")
    public String getNopTienPage(@PathVariable("id") int id, Model model){
        model.addAttribute("idChuHo", id);
        model.addAttribute("khoanthubatbuocs", thongKeKhoanChuaDongGopService.getKhoanBatBuoc(id));
        model.addAttribute("khoanthutunguyens", thongKeKhoanChuaDongGopService.getKhoanTuNguyen(id));
        return "noptien";
    }

    @GetMapping("/lichsu/{id}")
    public String getLichSuPage(@PathVariable("id") int id, Model model){
        model.addAttribute("khoanthus", thongKeThuTienService.getThuTienByIdHoKhau(id));
        return "lichsu";
    } 
    
    @PostMapping("/noptien")
    public String postNopTien(int idChuHo, String tenNguoiNop, String idKhoanThuBatBuoc, String soTienBatBuoc, String idKhoanThuTuNguyen, int soTienTuNguyen, String ghiChuKhoanBatBuoc, String ghiChuKhoanTuNguyen, Model model){
        String[] a = idKhoanThuBatBuoc.split(",");
        String[] b = idKhoanThuTuNguyen.split(",");
        if(ghiChuKhoanBatBuoc == "") ghiChuKhoanBatBuoc = "Không có";
        if(ghiChuKhoanTuNguyen == "") ghiChuKhoanTuNguyen = "Không có";
        ThuTien t1 = new ThuTien(Integer.parseInt(a[0]), tenNguoiNop, idChuHo, Integer.parseInt(a[1]), ghiChuKhoanBatBuoc);
        ThuTien t2 = new ThuTien(Integer.parseInt(b[0]), tenNguoiNop, idChuHo, soTienTuNguyen, ghiChuKhoanTuNguyen);
        thuTienRepository.save(t1);
        thuTienRepository.save(t2);
        return "noptienthanhcong";
    }
}
