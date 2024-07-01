package TEST;
import java.util.ArrayList;

public class Team {
	public static int num_teams=0;
	public String name = null;
	public int rank=0;
	public int size = 0;
	public Player captain; //주장
	public ArrayList<Player> members= new ArrayList<>(); //Player ArrayList로 사용


	public Team() {
		num_teams++;
	} //Tema 기본 생정자
	
	public Team(String n) {
		num_teams++;
	} //Team name 입력 받는 생성자
	
	public Team(String n, int r) {
		num_teams++;
	} //Team name, rank 입력 받는 생성자
	
	public Team(String n, int r, Player p) {
		num_teams++;
	} //Team name, rank, 선수를 받는 생성자
		
	public void setName(String n) { //Team name settrer
		this.name = n;
	}
	
	public String getName() {	//Team name getter
		return name;
	}
	
	public void setRank(int r) { //Team rank setter
		this.rank = r;
	}
	
	public int getRank() { //Team rank getter
		return rank;
	}
	
	public int getSize() { //Team size getter
		return this.size;
	}
	
	public void setCaptain(Player p) { //Team caption setter
		this.captain = p;
	}

	public Player getCaptain() { //Team caption getter
		return captain;
	}
	
	public void addMember(Player p) { //Team에 Player 추가
	}
	
	public void removeMember(String n) { //Team에서 Player 삭제

	}
	
	public void printTeam() { //Team 이름, 팀 인원수, 팀순위 출력
		System.out.println(name + ", " +getSize()+" ��, "+ rank+" ��");
	}

}
