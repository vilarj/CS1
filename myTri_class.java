
public class myTri_class {

	public static void main(String[] args) {
	Triangle_Class_Exercise Tri = new Triangle_Class_Exercise();
	
	Tri.base = 17.348;
	Tri.height = 104.6;
	
	System.out.print("Triangle Tri: ");
	System.out.printf("area : %.3f, \n", Tri.area());
	Tri.print();
	
	}
}
