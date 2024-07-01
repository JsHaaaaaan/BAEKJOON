package TEST;
public class Player {
    static int num_Players = 0;
	public String name = null;
    private int age = 0;
    
    public Player() {
    	num_Players++;
    } //Player 기본 생성자

    public Player(String n) { num_Players++; } // //Player의 name만 입력 받는 Player 생성자
    public Player(String n, int a) { //Player의 name, age를 입력 받는 생성자
    	num_Players++;
    }
    
    public void setName(String n) {  //Player의 name 설정
        this.name = n;
    }

    public String getName( ) {  //Player의 name 참조
        return name;
	}

    public void setAge(int a) {  //Player의 age setter
        this.age = a;
	} 

    public int getAge( ) {  //Player의 age getter
        return age;
	}
}
