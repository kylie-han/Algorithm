/*
 * instanceof
 * - ���� ��ü�� Type�� �˻��� �ִ� ������
 * - true/false�� ������.
 */
public class Inherit8IncetanceOf {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("��ȣ��","12-12","010-1111-2222","����","��ȯ��");
		pArr[1] = new Nurse("���","98-12","010-9999-8888","��ȣ��","��ȯ�⳻��");
		pArr[2] = new Doctor("���缮","98-75","010-5555-3333","�ܰ�","���");
		callPrint(pArr[0]);
		callPrint(pArr[1]);
		callPrint(pArr[2]);
	}
	public static void callPrint(Person p) {//Polymorphic Arguments
		if(p instanceof Doctor) {//instanceof ������.
			Doctor d = (Doctor) p;
			d.setSubject("�ܰ�");
		} else if (p instanceof Nurse) {
			Nurse n = (Nurse) p;
			n.setCharge("���޽�");
		}//���� ��ü�� Type�� �˻��� �ִ� ������
		p.print();
	}

}
