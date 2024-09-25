import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {

    public static Vendedor createSalesManInfoFile() {

            String[] nombres = {"Mackalister","Leonel","Leonardo","Daniel"};
            String[] apellidos = {"Castro","Catano","Messi","silva"};
            Random ramdom = new Random();

            String nombre = nombres[ramdom.nextInt(nombres.length)];
            String apellido = apellidos[ramdom.nextInt(apellidos.length)];
            int id = 1 + ramdom.nextInt(9000);

            Vendedor vendedor = new Vendedor(nombre, apellido, id);

        try(FileWriter writer = new FileWriter("Lista De Vendedores",true)){
            writer.write("ID vendedor: "+id+" Vendedor: "+nombre+" "+apellido+"\n" );
            System.out.println("Se Creo con Exito El Vendedor "+nombre+" "+apellido);
        }catch(IOException e) {
            System.out.println(" Error Al  Crear Al Vendedor " + e.getMessage());
        }
            return vendedor;
    }




}