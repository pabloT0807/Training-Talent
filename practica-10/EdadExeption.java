public class EdadExeption extends Exception{

    public EdadExeption(String message){
        super(message);
    }

    public EdadExeption(){

    }

    public void validarEdad(int edad) throws EdadExeption{
        if(!(edad >= 18)){
            throw new EdadExeption("Error de edad , es menor");
            //esta instruccion es la que lanzara el error para que la jvm pueda ver que existe una exception que necesita tratamiento
            // de un try catch , se usa el constructos de EdadExeption paraa que a su vez use el construc padre para crear la nueva excp

        }else{

        }
    }


}