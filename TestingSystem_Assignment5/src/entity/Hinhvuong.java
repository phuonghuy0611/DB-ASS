package entity;

public class Hinhvuong extends Hinhchunhat {
	public float tinhChuVi(float a) {
		return super.tinhChuVi(a, a);
	}

	public float tinhDienTich(float a) {
		return this.tinhDienTich(a, a);
	}

}
