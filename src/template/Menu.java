package template;

import servicio.Consulta;
import modelo.Horoscopo;

public class Menu extends MenuTemplate {

    @Override
    public void horoscop() {
        Consulta consulta = new Consulta();
        System.out.println("🔮✨-------------------------------------✨🔮");
        System.out.println("What is your zodiac sign? 🪐");
        String select = leer.nextLine().trim().toLowerCase();
        Horoscopo horoscopo = consulta.verHoroscopo(select);
        if (horoscopo.sign() != null) {
            System.out.println("Date: " + horoscopo.date());
            System.out.println("Sign: " + horoscopo.sign());
            System.out.println("Horoscope: " + horoscopo.horoscope());
        } else {
            System.out.println("Invalid sign. Please try again.");
        }
        System.out.println("🔮✨-------------------------------------✨🔮");
    }
}

