package entity;

public class Khoi {
	private String ten;
	private String monThi;

	public String getMonThi() {
		if (ten.equals("A")) {
			monThi = "Toan,Ly,Hoa";

		} else if (ten.equals("B")) {
			monThi = "Toan,Hoa,Sinh";

		} else if (ten.equals("C")) {
			monThi = "Van,Su,Dia";

		} else {
			monThi = "Unknown";
		}

		return monThi;

	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

}
