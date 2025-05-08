package template;

import interfaz.ILector;

public abstract class MenuTemplate implements ILector {
    String op;

    public abstract void horoscop();

    public final void iniciarMenu() {
        do {
            System.out.println("🌌-------------------------------------🌠");
            System.out.println("---- ☀\uFE0F The Cosmic Arcane \uD83C\uDF19 ----");
            System.out.println("1. The zodiac ✨");
            System.out.println("0. Exit \uD83D\uDD1A");
            System.out.println("Select an option: ");
            op = leer.nextLine();
            System.out.println("🌌-------------------------------------🌠");
            switch (op) {
                case "1":
                    horoscop();
                    break;
                case "0":
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        } while (!op.equals("0"));
    }
}
