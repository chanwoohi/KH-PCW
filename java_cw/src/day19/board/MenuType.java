package day19.board;

enum MenuType{
	INSERT(1),
	UPDATE(2),
	DELETE(3),
	SEARCH(4),
	EXIT(5);
	
	private final int value;
	
	private MenuType (int value) {
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public static MenuType fromValue(int value) {
		for( MenuType tmp : MenuType.values()) {
			if(tmp.getValue() == value) {
				return tmp;
			}
		}
		throw new IllegalArgumentException("잘못된 메뉴 선택.");
	}
}
