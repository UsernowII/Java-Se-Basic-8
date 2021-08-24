package JavaBasicGeekipedia;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night"://Ambar
                System.out.println("Selecionaste Night Mode");
                break;
            case "Blue dark":
                System.out.println("Seleccionaste Blue Mode");
                break;
            case "Dark":
                System.out.println("seleccionaste Dark Mode");
                break;
            default:
                System.out.println("selecciona una opcion correcta");
        }

    }
}
