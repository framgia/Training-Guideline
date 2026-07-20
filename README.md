i/TIẾP NHẬN, XỮ LÝ ĐƠN THƯ ĐƠN CHUNG 
# file xử lý đơn 
FILE ="đơn_thu.json"
      #file chuyển đơn
      try: "đon vị chuyển"/thời hạn xử lý"
      FILE ="hướng dẫn"
# File lưu đơn
FILE = "don_thu.json"

# Hàm đọc dữ liệu
def doc_don():
    try:
        with open(FILE, "r", encoding="utf-8") as f:
            return json.load(f)
    except FileNotFoundError:
        return []

# Hàm ghi dữ liệu
def ghi_don(ds_don):
    with open(FILE, "w", encoding="utf-8") as f:
        json.dump(ds_don, f, ensure_ascii=False, indent=4)

# Thêm đơn mới
def tiep_nhan_don(ma_don, nguoi_gui, loai_don, noi_dung):
    ds_don = doc_don()
    don = {
        "ma_don": ma_don,
        "nguoi_gui": nguoi_gui,
        "loai_don": loai_don,
        "noi_dung": noi_dung,
        "trang_thai": "Đã tiếp nhận"
    }
    ds_don.append(don)
    ghi_don(ds_don)
    print(f"✅ Đã tiếp nhận đơn {ma_don}")

# Cập nhật trạng thái đơn
def cap_nhat_trang_thai(ma_don, trang_thai):
    ds_don = doc_don()
    for don in ds_don:
        if don["ma_don"] == ma_don:
            don["trang_thai"] = trang_thai
            print(f"🔄 Đơn {ma_don} cập nhật trạng thái: {trang_thai}")
    ghi_don(ds_don)

# Tra cứu đơn
def tra_cuu(ma_don):
    ds_don = doc_don()
    for don in ds_don:
        if don["ma_don"] == ma_don:
            return don
    return None

# =========================
# Ví dụ chạy chương trình
# =========================
if __name__ == "__main__":
    tiep_nhan_don("DON001", "Nguyễn Văn A", "Khiếu nại", "Nội dung khiếu nại A")
    tiep_nhan_don("DON002", "Trần Thị B", "Tố cáo", "Nội dung tố cáo B")

    cap_nhat_trang_thai("DON001", "Đang xử lý")

    ket_qua = tra_cuu("DON001")
    print("📌 Kết quả tra cứu:", ket_qua)
    ii/TIẾP NHẬN, XỬ LÝ VỤ VIỆC

