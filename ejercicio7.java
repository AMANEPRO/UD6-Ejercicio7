package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio7 {

	public static void main(String[] args) {
		
		String usereurobeta = JOptionPane.showInputDialog("Introduce la cantidad de dinero que posees en euros").toLowerCase();
		
		double usereuro = Double.parseDouble(usereurobeta);
		
		String convfact = 	JOptionPane.showInputDialog("Introduce a que tipo quieres convertir(YEN-DOLAR-LIBRA)").toLowerCase();
				
			switch (convfact) {
			
			case ("yen"):
				
				double useryen=usereuro*(129.852/1);
				
				System.out.println("Tienes " + usereuro + " euros, que al cambio en yenes serian " + useryen + " yenes" );
				
			break;
			
			case("dolar"):
				
				double userdolar=usereuro*(1.28611/1);
			
				System.out.println("Tienes " + usereuro + " euros, que al cambio en dolares serian " + userdolar + " dolares.");
				
			break;
			
			case("libra"):
				
				double userlibra=usereuro*(0.86/1);
				
				System.out.println("Tienes " + usereuro + " euros, que al cambio en dolares serian " + userlibra+ " libras");
			}

	}

}
