package listes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {

		Date d = new Date(102,8,19); //methode d�pr�ci�e, java nous dit d'utiliser autre chose
		System.out.println(d);
		
		//Alternative ? Passer par la date calendar
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2002); //ann�e corrig�e
		cal.set(Calendar.MONTH, 8); //mois non corrig�
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);

		Date date = cal.getTime();
		System.out.println(date);
		
		
		//Inconv�nient ? Format impos� pas tr�s sympa. Mais on peut utiliser la classe formattage
		Calendar calendrierMaintenant = Calendar.getInstance();
		Date maintenant = calendrierMaintenant.getTime();
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //change la date en chaine de caract�res
		System.out.println(formattage.format(maintenant));
	}

}
