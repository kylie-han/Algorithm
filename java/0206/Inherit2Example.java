/*
 * has a relationship.
 * - �ٸ� ��ü�� attribute(����)�� ������ �� �ִ�.
 * ��) Car has a Engine.
 * - class diagram : ���� -<> �ڵ���(�Ǽ�+���̺���̾Ƹ��), ���԰���.
 */
//��� ������ ����.
class ExamplePerson {
	String name;
	String phone;
	String addrress;
}
class ExampleStudent extends ExamplePerson {
	String hakbun;
	int classRoomNo;//�Ҽ�
	public void exampleHasARelation() {
		//������ ǥ�� - ��������{"��","��","��"} - ����{100,90,80}
		Jumsu [] jumsuArr = new Jumsu[20];//has a relationship
		jumsuArr[0] = new Jumsu("��",100.0,"��");
	}
}
class Jumsu {
	String subjectName;//�����
	double jumsu;//����
	String gradeName;//����̾簡
	public Jumsu (String sNm, double p, String gN){
		subjectName = sNm;
		jumsu = p;
		gradeName = gN;
	}
}
class ExampleTeacher extends ExamplePerson {
	String subject;//���
	int classRoomNo;//���
}
class ExampleEmployee extends ExamplePerson {
	String empNo;
	String deptName;//�Ҽ�
}
public class Inherit2Example {

	public static void main(String[] args) {
		System.out.println("��� ������ ����");
	}

}
