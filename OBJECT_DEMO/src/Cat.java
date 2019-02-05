public class Cat  {
	private String name;

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;

		if (this == obj)
			return true;
		

		flag = !(obj instanceof Cat);
		if (flag)
			return false;

		flag = this.name.equals(((Cat) obj).name);// note here obj is of type object that's why we are type casting

		return flag;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("cleaning up Cat with name " + name);
		super.finalize();
	}

	@Override
	public String toString() {
		return "I'm a Cat";
	}



}
