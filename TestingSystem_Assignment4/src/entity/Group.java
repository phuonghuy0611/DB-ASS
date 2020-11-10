package entity;

import java.time.LocalDate;

public class Group {
	private int groupId;
	private String groupName;
	private int creatorId;
	private LocalDate createDate;
	private Account[] accountOfGroup;
	public Group() {
	}

	public Group(int id, String name, int creator, Account[] accounts, LocalDate createDate) {
		this.setGroupId(id);
		this.groupName = name;
		this.setCreatorId(creator);
		this.setAccountOfGroup(accounts);
		this.setCreateDate(createDate);
	}

	public Group(int id, String name, int creator, String[] usernames, LocalDate createDate) {
		this.setGroupId(id);
		this.groupName = name;
		this.setCreatorId(creator);

		// accounts
		Account[] accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			accounts[i] = new Account(usernames[i]);
		}
		this.setCreateDate(createDate);
	}
	@Override
	public String toString() {
		return groupName;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccountOfGroup() {
		return accountOfGroup;
	}

	public void setAccountOfGroup(Account[] accountOfGroup) {
		this.accountOfGroup = accountOfGroup;
	}
	
}