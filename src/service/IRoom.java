package service;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRoom<T> {
	//them sua xoa xem//T
	public int insertRoom(T t) throws SQLException;
	public int updateRoom(T t) throws SQLException;
	public int deleteRoom(T t) throws SQLException;
	public ArrayList<T> selectAllRoom() throws SQLException;
	public T selectByRoomId(T t) throws SQLException;
}
