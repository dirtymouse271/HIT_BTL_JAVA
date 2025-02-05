package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JDBCUtil;
import model.Room;
import service.IRoom;

public class IRoomImpl implements IRoom<Room>{

	public static IRoomImpl getInstance() {
		return new IRoomImpl();
	}
	
	@Override
	public int insertRoom(Room t) throws SQLException {
		int ketQua = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql ="INSERT INTO room(room_id, room_number, room_type, room_price, room_status) "
						+"VALUES(?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setInt(1,t.getRoom_id());
			pst.setInt(2, t.getRoom_number());
			pst.setString(3, t.getRoom_type());
			pst.setDouble(4, t.getRoom_price());
			pst.setString(5, t.getRoom_status().name());
			
			ketQua=pst.executeUpdate();
			
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateRoom(Room t) throws SQLException {
		int ketQua=0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql ="UPDATE room "
						+"SET "
						+"room_number=?"
						+",room_type=?"
						+",room_price=?"
						+",room_status=?"
						+" WHERE room_id=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setInt(1, t.getRoom_number());
			pst.setString(2, t.getRoom_type());
			pst.setDouble(3, t.getRoom_price());
			pst.setString(4, t.getRoom_status().name());
			pst.setInt(5,t.getRoom_id());
			ketQua=pst.executeUpdate();
			
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteRoom(Room t) throws SQLException {
		int ketQua=0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql ="DELETE from room "
						+"WHERE room_id=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setInt(1,t.getRoom_id());
			
			ketQua=pst.executeUpdate();
			
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Room> selectAllRoom() {
		
		return null;
	}

	@Override
	public Room selectByRoomId(Room t) {
		// TODO Auto-generated method stub
		return null;
	}
//t
}
