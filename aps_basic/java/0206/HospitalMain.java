
public class HospitalMain {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("��ȣ��","12-12","010-1111-2222","����","��ȯ��");
		pArr[1] = new Nurse("���","98-12","010-9999-8888","��ȣ��","��ȯ�⳻��");
		pArr[2] = new Doctor("���缮","98-75","010-5555-3333","�ܰ�","���");
		for(int i=0; i<pArr.length; i++){
			pArr[i].print();//override�� ���� �޼ҵ� ȣ��.
			//override ���� : �θ� class Ÿ���� �޼ҵ������,
			//				�ڽ� class Ÿ�� instance�� �޼ҵ带 �ҷ� �� �� �ִ�.
		}
	}

}
