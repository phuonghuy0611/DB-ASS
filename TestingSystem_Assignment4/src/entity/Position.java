package entity;

public class Position {
	private int positionId;
	private String PositionName;
	 public Position(int id,String name) {
		this.setPositionId(id);
		this.setPositionName(name);
	
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return PositionName;
	}
	public void setPositionName(String positionName) {
		PositionName = positionName;
	}
	
}