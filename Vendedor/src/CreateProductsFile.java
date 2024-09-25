import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateProductsFile {

    public static void createProductsFile(int productsCount){
        try(FileWriter writer = new FileWriter("Lista De Productos")){
            Random random = new Random();

            for(int i = 0; i<productsCount; i++){
                int id = 1+i;
                String nombre = "producto" + id;
                double precio = 1000+(random.nextDouble()*1000);
                writer.write(id+": "+nombre+": $"+ String.format("%.2f",precio)+ "\n");
            }
            System.out.println("Archivo De Productos Creado Exitosamente");
        }catch (IOException e){
            System.out.println("Error Al Crear El Archivo De Productos"+e.getMessage());
        }
    }
}
