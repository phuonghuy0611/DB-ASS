package testing2;

import java.util.Date;
public class Group {
	int groupId;
	String groupName;
	int creatorId;
	Date createDate;
	Account[] accountOfGroup;
	@Override
	public String toString() {
		return groupName;
	}
	
}