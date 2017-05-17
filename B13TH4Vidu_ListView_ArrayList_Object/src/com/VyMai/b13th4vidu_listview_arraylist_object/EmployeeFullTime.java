package com.VyMai.b13th4vidu_listview_arraylist_object;

public class EmployeeFullTime extends Employee {
	@Override
	 public double TinhLuong() {
	 return 500;
	 }
	 @Override
	 public String toString() {
	 // TODO Auto-generated method stub
	 return super.toString() +" -->FullTime="+TinhLuong();
	 }

}
