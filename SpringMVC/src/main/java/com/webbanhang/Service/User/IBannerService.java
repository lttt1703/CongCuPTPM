package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Entity.Banner;
@Service
public interface IBannerService {
	@Autowired
	public List<Banner> GetDataBanner();
}
