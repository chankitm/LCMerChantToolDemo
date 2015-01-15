package model;

public enum RoleRight {

	READ("READ"), DML("DML"), OVERWRITE("OVERWRITE");
	String function;

	private RoleRight(String function) {
		this.function = function;
	}

	public String getFunction() {
		return function;
	}
	
}
