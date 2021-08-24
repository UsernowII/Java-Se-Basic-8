package JavaBasicPlatzi;

public class IfStatement {
    public static void main(String[] args){
       boolean isBluetoothEnable = false;
       int fileSended = 3;
       if (isBluetoothEnable) {
           //send file
           fileSended++;
           System.out.println("Archivo enviado");
       }else{
           fileSended--;
           System.out.println("Por favor enciende tu bluetooth");
       }


    }
}
