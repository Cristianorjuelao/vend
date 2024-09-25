import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateSalesFile {

    public static void createSalesFile(int randomSalesCount, Vendedor vendedor){
        try(FileWriter writer = new FileWriter(vendedor.getNombreCompleto() +"ID: "+vendedor.getId()+".txt")){
            Random random = new Random();
            writer.write("Codigo Vendedor Es" + vendedor.getId() + "\n");

            for(int i=0; i<randomSalesCount; i++){
                int productId = 100+random.nextInt(3);
                int cantidad = random.nextInt(20)+1;
                writer.write("EAN Producto Es: "+productId+": Cantidad: "+cantidad+ "\n" );
            }
            System.out.println("Archivo De Ventas Creado Exitosamente");
        }catch (IOException e){
            System.out.println("Error Al Crear El Archivo De Ventas"+ e.getMessage() );
        }
    }
}
