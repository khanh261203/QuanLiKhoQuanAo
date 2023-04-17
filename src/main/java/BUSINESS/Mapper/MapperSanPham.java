/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Mapper;

/**
 *
 * @author ADMIN
 */
import BUSINESS.Service.SanPhamService;
import CONTRACT.Dtos.SanPhamCreateDto;
import CONTRACT.Dtos.SanPhamDto;
import DATAACCESSOR.Model.SanPham;

public class MapperSanPham {

  
    public static SanPham MapperSanPhamCreateDto(SanPhamCreateDto spdto){
    	 
        SanPham sp = new SanPham(spdto.getMasp(),spdto.getTensp(),spdto.getGiaban(),spdto.getSoluongtonkho(),spdto.getMotasanpham(),spdto.getManhacungcap(),"ABC",spdto.getLoaiSanPham(),true);
        return sp;
    }

public static SanPhamDto MapperSanPhamDto(SanPham sp) {
	
	SanPhamDto spDto = new SanPhamDto(sp.getMasp(),sp.getTensp(),sp.getGiaban(),sp.getSoluongtonkho(),sp.getMotasanpham(),sp.getLoaiSanPham());
	return spDto;
}

public static SanPham MapperSanPham(SanPhamDto spDto, SanPhamService sv ) {
	return sv.GetSanPham(spDto.getMasp());
}
}

