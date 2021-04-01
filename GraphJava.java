import java.util.Scanner;
class TriangleCalc {
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     double xa, ya, xb, yb, difx, dify;
     System.out.print("Enter xa: ");
     xa = scan.nextDouble();
     System.out.print("Enter ya: ");
     ya = scan.nextDouble();
     System.out.print("Enter xb: ");
     xb = scan.nextDouble();
     System.out.print("Enter yb: ");
     yb = scan.nextDouble();
   
     
     difx = (xa)-(xb);
     dify = (ya)-(yb);
     System.out.printf("Dif x on A,B = %f",difx);
     System.out.printf("Dif y on A,b = %f",dify);
  }
}
