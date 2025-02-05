package service;

import java.util.ArrayList;

public interface IBill<T> {
	//them
	//xem(user/admin)
	//xoa(admin)
	//T
	public int insertBill(T t);
	public int deleteBill(T t);
	public ArrayList<T> selectAllBill();
	public T selectByBillId(T t); 
}
