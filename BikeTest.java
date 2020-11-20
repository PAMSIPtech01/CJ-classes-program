import java.util.Scanner;
class BikeTest {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		Bike b1 = new Bike();

		System.out.print("Enter number of gear :");
		b1.setgear(scn.nextInt());
		System.out.println("number of gear is :"+b1.getgear());
		scn.nextLine();

		System.out.print("Enter colour of bike");
		b1.setcolor(scn.nextLine());
		System.out.println("Bike color is \t :"+b1.getcolor());

		System.out.print("Enter bike number :");
		b1.setbikeNo(scn.nextLine());
		System.out.println("number of bike is :"+b1.getbikeNo());

		System.out.print("Enter bike model :");
		b1.setModel(scn.nextLine());
		System.out.println("Bike model is \t :"+b1.getModel());

		System.out.print("Enter bike brand :");
		b1.setBrand(scn.nextLine());
		System.out.println("Bike brand is \t :"+b1.getBrand());

	}
}