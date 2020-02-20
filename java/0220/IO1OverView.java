/*
 * Java IO : InputStream & OutputStream
 * - Java IO Stream : data�� �̵��� �ǹ�.
 * - InputStream : �ܺο��� myProgram���� data �̵�.
 * - OutputStream : myProgram���� �ܺη� data �̵�.
 * - NodeStream(���) : data source�� destination�� ����.
 *                     FileInputStream, FileOutputStream.
 * - FilterStream(data ����) : data �����ϰų�, ���� ����� ����.
 *                            �ݵ�� NodeStream�� �Բ� ���.
 *                            InputStreamReader, OutputStreamWriter.
 * - ByteStream (8bit ����) : ����� ������ 8bit. �񿵾�� ���� ǥ���� ������ ����.
 *                           class name�� ~InputStream, ~OutputStream.
 * - CharStream (16bit ����) : ����� ������ 16bit. �񿵾�� ���� ǥ�� ����.
 *                            class name�� ~Reader, ~Writer.
 * - ����!!! : NodeStream�� FilterStream ���� ��, 16bit�� 16bit ����, 8bit�� 8bit ���� �����Ѵ�.
 * - ����!!! : ������ Java IO�� �ݵ�� close() �ؾ� �Ѵ�.
 * - ����!!! : Java IO�� close() �� ���� �ݵ�� ������ �������� close() �Ѵ�.
 * - flush() : Writer�� OutputStream���� data�� �о �� ���.
 */
public class IO1OverView {

	public static void main(String[] args) {
		System.out.println("���� ���� �Ϸ�!!!");
	}

}
