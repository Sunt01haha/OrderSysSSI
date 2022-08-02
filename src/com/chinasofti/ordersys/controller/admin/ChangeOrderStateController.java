package com.chinasofti.ordersys.controller.admin;

import com.sun.deploy.net.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.ordersys.service.login.waiters.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ChangeOrderStateController {
	@Autowired
	OrderService service;

	public OrderService getService() {
		return service;
	}

	public void setService(OrderService service) {
		this.service = service;
	}

	@RequestMapping("/changeorder")
	public void changeOrderState(@RequestParam("orderId") Integer orderId,
			@RequestParam("state") int state) {
		System.out.println(orderId);
		
		// 修改订单的状态值
		service.changeState(orderId, state);

	}

	@RequestMapping("/alipay")
	public void getPrice( Integer orderId, Model model, HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
	double sum = 0;
	try {
		sum = service.getSumPriceByOrderId(orderId);
	}catch (Exception e){
		System.out.println("获取失败");
	}
		System.out.println(sum);
	request.setAttribute("sum",sum);
	request.getRequestDispatcher("alipay/indexalipay.jsp").forward(request,response);
	}

}
