# HIT_BTL_JAVA
# Ứng dụng Quản lý Khách sạn bằng Java

## 1. Mô tả bài toán

### 1.1 Mục tiêu bài toán:
Xây dựng một ứng dụng quản lý khách sạn bằng Java, sử dụng cơ sở dữ liệu MySQL để lưu trữ và quản lý dữ liệu. Ứng dụng cho phép quản lý các thông tin như:
- **Quản lý phòng**: Thêm, sửa, xóa thông tin phòng (số phòng, loại phòng, giá, tình trạng...).
- **Quản lý khách hàng**: Thêm, sửa, xóa thông tin khách hàng (họ tên, CMND/CCCD, số điện thoại, địa chỉ…).
- **Quản lý đặt phòng**: Khách đặt phòng, hủy đặt phòng, cập nhật trạng thái đặt phòng.
- **Quản lý hóa đơn**: Tạo hóa đơn, tính tổng tiền, in hóa đơn.
- **Quản lý góp ý** của khách hàng sau khi sử dụng dịch vụ.

---

### 1.2 Các chức năng chính:
- **Đăng nhập/Quản lý người dùng**:
  - Người dùng (admin) đăng nhập vào hệ thống.
  - Phân quyền: Admin, nhân viên, khách hàng.
- **Quản lý phòng**:
  - Thêm, sửa, xóa thông tin phòng.
  - Xem danh sách phòng, trạng thái phòng (trống, đã đặt, đang sử dụng).
- **Quản lý khách hàng**:
  - Thêm mới, chỉnh sửa, xóa khách hàng.
  - Tìm kiếm khách hàng theo tên, số điện thoại, ID.
- **Quản lý đặt phòng**:
  - Đặt phòng: chọn phòng, nhập thông tin khách hàng, ngày nhận, ngày trả.
  - Hủy đặt phòng.
  - Cập nhật thông tin đặt phòng.
- **Quản lý hóa đơn**:
  - Tạo hóa đơn dựa trên thông tin đặt phòng.
  - Tính tổng chi phí (tiền phòng, dịch vụ).
  - In hóa đơn.

---

### 1.3 Mô hình cơ sở dữ liệu
Cơ sở dữ liệu MySQL gồm các bảng chính:
- **room**: `number`, `type`, `price`, `status`.
- **user**: `id`, `name`, `email`, `phoneNumber`, `address`, `password`, `securityQuestion`, `answer`.
- **booking**: `id`, `name`, `number`, `type`, `checkIn`, `checkOut`, `price`.
- **bill**: `id`, `createDate`, `name`, `phoneNumber`, `number`, `type`, `checkIn`, `checkOut`, `price`.
- **comment**: `id`, `name`, `number`, `checkIn`, `checkOut`, `comment`.

---

### 4. Công nghệ sử dụng:
- **Ngôn ngữ**: Java sử dụng JDBC để kết nối MySQL.
- **Cơ sở dữ liệu**: MySQL.
- **IDE**: Eclipse.
- **Quản lý project**: Maven để quản lý các thư viện JDBC, MySQL Connector.
