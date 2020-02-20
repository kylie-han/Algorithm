import java.util.ArrayList;

/*
 * Polymorphism �Ѱ�� Object type Casting.
 * Polymorphism �Ѱ� : �θ� clss Ÿ���� ������ �ڽ� clss Ÿ���� instance ���� �������� ���� �Ұ�.
 * 
 * Object type Casting : Polymorphism �Ѱ� �غ� ���.
 * - ����� Casting : �θ� class Ÿ���� ������ ��� �ִ� �ּҸ� �ڽ� class Ÿ���� ������ ���� ��.
 * - ������ Casting : �ڵ� Casting. : �ڽ� ��ü �ּҸ� �θ� class Ÿ���� ������ ���� ��.
 */
public class Inherit7PolyLimitCasting {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("��ȣ��","12-12","010-1111-2222","����","��ȯ��");
		//������ Casting
		pArr[1] = new Nurse("���","98-12","010-9999-8888","��ȣ��","��ȯ�⳻��");
		pArr[2] = new Doctor("���缮","98-75","010-5555-3333","�ܰ�","���");
		//System.out.println(pArr[0].subject);//error
		//Polymorphism �Ѱ� : �θ� clss Ÿ���� ������ �ڽ� clss Ÿ���� instance ���� �������� ���� �Ұ�.
		System.out.println(((Doctor)pArr[0]).subject);//����� Casting �� 1)
		Doctor d1 = (Doctor)pArr[0];//����� Casting �� 2)
		System.out.println(d1.subject);
		//Polymorphism �Ѱ� �غ� : ������� Object data type Casting ���.
		//??? - ������ �� �ϳ���?
		ArrayList list = new ArrayList();
		list.add(new Doctor("��ȣ��","12-12","010-1111-2222","����","��ȯ��"));
		list.add(new Nurse("���","98-12","010-9999-8888","��ȣ��","��ȯ�⳻��"));
		//ArrayList - Heterogeneous Collection
		System.out.println(((Doctor)list.get(0)).subject);//����� Casting �� 1)
		Doctor d2 = (Doctor) list.get(0);//����� Casting �� 2)
		//�������� ������ �Ѱ躸�� �ξ� ũ����!!!
	}

}






