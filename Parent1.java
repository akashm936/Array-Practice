class Parent1
{
	public void parentMethod(){
		System.out.println("hello form Parent");
	}

}

class Child extends Parent1{


    public void childMethod(){
    	System.out.println("hello form child1 ");
    }
	public static void main(String[] args) {

		Child child = new Child();
		

	}
}