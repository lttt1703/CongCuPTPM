package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.BannerDao;
import com.webbanhang.Entity.Banner;
@Service
public class BannerServiceImpl implements IBannerService{
	@Autowired
	private BannerDao bannerDao;
	
	public List<Banner> GetDataBanner() {
		// TODO Auto-generated method stub
		return bannerDao.GetDataBanner();
	}

}
