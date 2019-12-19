package lab7;

public class Main {

    public static void main(String[] args) {
	Sphere sphere = new Sphere(4);
	Cube cube = new Cube(3);
	Parallelepiped parallelepiped= new Parallelepiped(1 ,2,3);

	GeometricBody[] geometricBodies = { sphere , cube,parallelepiped};
	GeometricBodyController controller = new GeometricBodyController();

        System.out.println("The volume of the sphere is - "+sphere.getVolume());
        System.out.println("The volume of the cube is - "+cube.getVolume());
        System.out.println("The volume of the Parallelepiped is - "+parallelepiped.getVolume()+"\n");

        System.out.println("The surface of the sphere is - "+sphere.getSurface());
        System.out.println("The surface of the cube is - "+cube.getSurface());
        System.out.println("The surface of the Parallelepiped is - "+parallelepiped.getSurface()+"\n");

        System.out.println("The biggest volume is - "+controller.getBiggestVolume(geometricBodies));
        System.out.println("The biggest area is - "+controller.getBiggestSurface(geometricBodies));

    }
}
