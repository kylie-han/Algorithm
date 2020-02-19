class Company {
	private static Company com = new Company();
	private Company() {
		
	}
	public Company getInstance() {
		return com;
	}
}
public class Static5Singleton {

}
