package com.ossjk.ossjkssm.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.util.CommonUtil;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/system")
public class IndenContrller extends BaseController {

	@Autowired
	private UserService userService;

	/**
	 * 去主页
	 * 
	 * @return
	 */
	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index";
	}

	/**
	 * 去桌面
	 * 
	 * @return
	 */
	@RequestMapping("/toDesktop")
	public String toDesktop() {
		return "desktop";
	}

	/**
	 * 去登录
	 * 
	 * 
	 */
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	/**
	 * 登出
	 *
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute(Constant.SESSION_USER_KEY);
		return "redirect:/system/toLogin.do";
	}

	/**
	 * 登出
	 * 

	 */
	@RequestMapping("/login")
	public String login(String username, String pwd, ModelMap map, HttpSession session, HttpServletRequest request) {

		//获取登录ip地址
			String ip = request.getHeader("X-Forwarded-For");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				if (ip == null || ip.length() == 0
						|| "unknown".equalsIgnoreCase(ip)) {
					ip = request.getHeader("Proxy-Client-IP");
				}
				if (ip == null || ip.length() == 0
						|| "unknown".equalsIgnoreCase(ip)) {
					ip = request.getHeader("WL-Proxy-Client-IP");
				}
				if (ip == null || ip.length() == 0
						|| "unknown".equalsIgnoreCase(ip)) {
					ip = request.getHeader("HTTP_CLIENT_IP");
				}
				if (ip == null || ip.length() == 0
						|| "unknown".equalsIgnoreCase(ip)) {
					ip = request.getHeader("HTTP_X_FORWARDED_FOR");
				}
				if (ip == null || ip.length() == 0
						|| "unknown".equalsIgnoreCase(ip)) {
					ip = request.getRemoteAddr();
				}
				if (ip.equals("0:0:0:0:0:0:0:1")) {
					ip = "本地";
				}
			} else if (ip.length() > 15) {
				String[] ips = ip.split(",");
				for (int index = 0; index < ips.length; index++) {
					String strIp = (String) ips[index];
					if (!("unknown".equalsIgnoreCase(strIp))) {
						ip = strIp;
						break;
					}
				}
			}
			if (ip.equals("127.0.0.1")) {
				InetAddress inetAddress = null;
				try {
					inetAddress = InetAddress.getLocalHost();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ip = inetAddress.getHostAddress();
			}

		User user = userService.selectByName(username);
		if (!CommonUtil.isBlank(user)) {
			if (CommonUtil.isEquals(user.getPwd(), pwd)) {
				//记录上一次登录的时间和ip
				Map mp = new HashMap();
				mp.put("username",username);
				mp.put("ip",ip);
				userService.loginipAndtime(mp);
				logger.debug("登录的ip地址是："+ip+"     登录的用户是："+username);
				session.setAttribute(Constant.SESSION_USER_KEY, user);
				return "redirect:/system/toIndex.do";
			} else {
				map.put("msg", "密码不对");
			}
		} else {
			map.put("msg", "用户不存在");
		}
		return "login";
	}
	
	@RequestMapping("/toError")
	public String toError() {
		return "500";
	}
}
