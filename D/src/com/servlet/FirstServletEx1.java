package com.servlet;
import javax.servlet.Servlet;

public class FirstServletEx1 implements Servlet{

	public static void main(String[] args) {
		ServletConfig config;
		public void init(ServletConfig config) {
			this.config=config;
		}
		public  void Service(ServletRequest request, ServletResponse response) {
		System.out.println("hello ");	
		}
		public void destory() {
			
		}
		public ServletConfig getServletConfig() {
			return config;
		}
		public String getServletInfo() {
			return null;
		}
	}

}
