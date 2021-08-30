package proyect;

class proyectTest {
	public static void main(String[] args) {
	     proyect ProyectClass = new proyect("Mario");
	     proyect newclass = new proyect();
	     proyect newclass1 = new proyect("Mario", "La description de todo lo necesario");
	     String Name = ProyectClass.getName();
	     //class
	     System.out.println(newclass);
	     System.out.println("The Class name and description is: " + newclass1.getDescription());
	     System.out.println("The Class name is: " + Name);
	     
	    }
	}
