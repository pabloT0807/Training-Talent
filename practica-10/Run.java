public class Run{
    public static void main(String [] args){
        int edad = 19;
        EdadExeption edadEx = new EdadExeption();
    
        try{
            edadEx.validarEdad(edad);
    
        }catch(EdadExeption ex){
            
            System.out.println(ex.getMessage());
            //ex.printStackTrace
    
        }finally{
            System.out.println("gracias por visitarnos");

        }
    }

}