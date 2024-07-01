package TEST;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Team g1 = new Team();			
		Team g2 = new Team("Soccer", 3);
		Player p1 = new Player("�����");
		Player p2 = new Player("Ȳ����",21);
		Player p3 = new Player("�̰���",22);		
		Player p4 = new Player("������");
		Player p5 = new Player("���ϼ�",21);
		Player p6 = new Player("������",23);
		
		g1.setName("Football");
		g1.setRank(1);
		g1.addMember(p1);
		g1.addMember(p2);
		g1.addMember(p3);
		g1.setCaptain(p1);
		g1.printTeam();
		g1.removeMember("�̰���");
		g1.setRank(2);
		g1.printTeam();
				
		g2.setName("Baseball");
		g2.addMember(p4);
		g2.addMember(p5);
		g2.addMember(p6);
		g2.setCaptain(p4);
		g2.printTeam();
		
		
		
	}
}
