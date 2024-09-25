public class main {

    public static void main(String[] args) {

        Vendedor vendedor1 = GenerateInfoFiles.createSalesManInfoFile();
        CreateSalesFile.createSalesFile(5,vendedor1);
        Vendedor vendedor2 = GenerateInfoFiles.createSalesManInfoFile();
        //CreateSalesFile.createSalesFile(3,vendedor2);

        //CreateProductsFile.createProductsFile(2);



    }
}
