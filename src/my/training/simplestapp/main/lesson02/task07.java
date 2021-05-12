package my.training.simplestapp.main.lesson02;

public class task07 {

	public static void main(String[] args) {
		
		float x,y,z;
		
		x=-2;
		y=3;
		z=5;
		
		double qx,qy,qz, fx,fy,fz;
		
		
		if (x<0) {
		   fx=Math.pow(x, 4);	
		  System.out.println("X<0, x â 4:"+ fx);
		} else {
			qx=Math.pow(x, 2);
			System.out.println("X>=0, x â 2:"+ qx);
		}
		
		if (y<0) {
			fy=Math.pow(y,4);
			System.out.println("y<0, y â 4:"+ fy);
		} else {
			qy=Math.pow(y, 2);
			System.out.println("y>=0, y â 2:"+ qy);
		}
		
		if (z<0) {
			fz=Math.pow(z,4);
			System.out.println("z<0, z â 4:"+ fz);
		} else {
			qz=Math.pow(z, 2);
			System.out.println("z>=0, z â 2:"+ qz);
		}
		
	}

}
