use quan_ly_khoan_thu;

insert into `nhankhau` (`id`, `hoten`, `namsinh`, `gioitinh`, `nguyenquan`, `dantoc`, `tongiao`, `quoctich`, `thuongtru`) values
(1, 'Phạm Thành Huấn', '1960-03-14', 'Nam', 'Xã Quang Lịch, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 1, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(2, 'Trần Thị Hoa', '1965-04-18', 'Nữ', 'Xã Quang Bình, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 1, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(3, 'Phạm Thành Long', '2000-11-15', 'Nam', 'Xã Quang Lịch, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 1, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(4, 'Phạm Thị Thảo', '2001-10-04', 'Nữ', 'Xã Quang Lịch, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 1, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(5, 'Phạm Thế Toàn', '2002-03-07', 'Nữ', 'Xã Quang Lịch, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 1, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(6, 'Bùi Minh Thắng', '1967-12-25', 'Nam', 'Xã Bình Minh, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 2, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(7, 'Trần Thị Phượng', '1970-08-07', 'Nữ', 'Xã Tán Thuật, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 2, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(8, 'Bùi Minh Tâm', '1997-05-02', 'Nam', 'Xã Bình Minh, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 2, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(9, 'Bùi Quang Thái', '2000-11-16', 'Nam', 'Xã Bình Minh, huyện Kiến Xương, tỉnh Thái Bình', 'Kinh', 'Không', 'Việt Nam', 'số 2, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(10, 'Nguyễn Thanh Tuấn', '1965-04-03', 'Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội', 'Kinh', 'Không', 'Việt Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(11, 'Trần Thị Tấm', '1970-10-13', 'Nữ', 'số 148, đường Chu Huy Mân, phường Phúc Đồng, quận Long Biên, thành phố Hà Nội', 'Kinh', 'Không', 'Việt Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(12, 'Nguyễn Thanh Tân', '1938-10-17', 'Nam', 'số 323, đường Trần Đại Nghĩa, phường Đồng Tâm, quận Hoàng Mai, thành phố Hà Nội', 'Kinh', 'Không', 'Việt Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(13, 'Trương Thị Thảo', '1940-01-14', 'Nữ', 'xã Hoa Thám, huyện Nguyên Bình, tỉnh Cao Bằng', 'Tày', 'Hồi giáo', 'Việt Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(14, 'Nguyễn Thanh Tú', '2000-08-21', 'Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội', 'Kinh', 'Không', 'Việt Nam', 'số 3, đường Giáp Bát, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội');

insert into `hokhau` (`id`, `idchuho`, `diachi`) values
(1, 1, 'số 1, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(2, 6, 'số 2, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội'),
(3, 10, 'số 3, phường Giáp Bát, quận Hoàng Mai, thành phố Hà Nội');

insert into `thanhviencuaho` (`id`, `idnhankhau`, `idhokhau`, `quanhevoichuho`) values
(1, 1, 1, 'chủ hộ'),
(2, 2, 1, 'vợ'),
(3, 3, 1, 'con trai'),
(4, 4, 1, 'con gái'),
(5, 5, 1, 'con trai'),
(6, 6, 2, 'chủ hộ'),
(7, 7, 2, 'vợ'),
(8, 8, 2, 'con trai'),
(9, 9, 2, 'con trai'),
(10, 10, 3, 'chủ hộ'),
(11, 11, 3, 'vợ'),
(12, 12, 3, 'bố'),
(13, 13, 3, 'mẹ'),
(14, 14, 3, 'con trai');

insert into `loaidonggop` (`id`, `tenloai`) values
(1, 'Bắt buộc'),
(2, 'Tự nguyện');

insert into `khoandonggop` (`id`, `tenkhoanthu`, `idloaidonggop`, `sotientoithieu`, `thoigiandong`) values
(1, 'Ủng hộ miền Trung', 2, 0, 'Tháng 9'),
(2, 'Ủng hộ miền Trung', 2, 0, 'Tháng 10'),
(3, 'Ủng hộ miền Trung', 2, 0, 'Tháng 11'),
(4, 'Làm đường', 1, 100000, 'Tháng 9'),
(5, 'Làm đường', 1, 100000, 'Tháng 10'),
(6, 'Đổ rác', 1, 50000, 'Tháng 9'),
(7, 'Đổ rác', 1, 50000, 'Tháng 10'),
(8, 'Đổ rác', 1, 50000, 'Tháng 11'),
(9, 'Đổ rác', 1, 50000, 'Tháng 12');

insert into `user` (`id`, `username`, `password`) values
(1, 'admin', 'admin');