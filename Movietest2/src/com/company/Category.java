package com.company;
import java.util.ArrayList;
import javax.swing.JOptionPane;
                                                                                 //EXAMPLE CLASS
public class Category{
    protected String nameAdmin = JOptionPane.showInputDialog("COMO SE LLAMA EL ADMINISTRADOR");
    ArrayList<String> Gender = new ArrayList<String>();
    String note = "En este género prevalecen altas dosis de adrenalina con una buena carga de movimiento, fugas, acrobacias, peleas, guerras, persecuciones y una lucha contra el mal.";
    String note1 = "Similares a las de acción, predominan las nuevas experiencias y situaciones.";
    String note2 = "Basados en fenómenos imaginarios, en la ciencia ficción son usuales los extraterrestres, sociedades inventadas, otros planetas…";
    String note3 = "Diseñadas específicamente para provocar la risa o la alegría entre los espectadores.";
    String note4 = "Este género analiza un hecho o situación real sin ficcionarlo.";
    String note5 = "Los dramas se centran en desarrollar el problema o problemas entre los diferentes protagonistas. Este es quizás uno de los géneros " +
            "\ncinematográficos más amplios de la lista. No predominan las aventuras o la acción, aunque pueden aparecer puntualmente Generalmente " +
            "\nse basan en desarrollar la interacción y caracteres humanos.";
    String note6 = "En ellas se incluyen personajes irreales o totalmente inventados, inexistentes en nuestra realidad. También podemos conocer este género de cine como “fantástico”. " +
            "\nNo se basa en ideas que puedan llegar a materializarse.";
    String note7 = "Las películas que cortan su desarrollo natural con fragmentos musicales son protagonistas de este género.";
    String note8 = "Conocido también como intriga, estas películas se desarrollan rápidamente, y todos sus elementos giran entorno un mismo elemento intrigante.";
    String note9 = "Su principal objetivo es causar miedo, horror, incomodidad o preocupación.";
    public String setAction(){
        return note;
    }
    public String setAdventure(){
        return note1;
    }
    public String setScienceFiction(){
        return note2;
    }
    public String setComedy(){
        return note3;
    }
    public String setDocumentaryFilm(){
        return note4;
    }
    public String setDrama(){
        return note5;
    }
    public String setFantasy(){
        return note6;
    }
    public String setMusical(){
        return note7;
    }
    public String setSuspense(){
        return note8;
    }
    public String setTerror(){
        return note9;
    }
    public String setAction(String message){
        String description = message;
        return description;
    }
    public String setAdventure(String message){
        String description = message;
        return description;
    }
    public String setScienceFiction(String message){
        String description = message;
        return description;
    }
    public String setComedy(String message){
        String description = message;
        return description;
    }
    public String setDocumentaryFilm(String message){
        String description = message;
        return description;
    }
    public String setDrama(String message){
        String description = message;
        return description;
    }
    public String setFantasy(String message){
        String description = message;
        return description;
    }
    public String setMusical(String message){
        String description = message;
        return description;
    }
    public String setSuspense(String message){
        String description = message;
        return description;
    }
    public String setTerror(String message){
        String description = message;
        return description;
    }
    public String ChangeDates(){
        String resultFinal = "PROCESO REALIZADO CON EXITO";
        Gender.add("Accion");
        Gender.add("Aventuras");
        Gender.add("Ciencia Ficcion");
        Gender.add("Comedia");
        Gender.add("Documental");
        Gender.add("Drama");
        Gender.add("Fantasia");
        Gender.add("Musical");
        Gender.add("Suspenso");
        Gender.add("Terror");
        String a = "";
        int option = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que quiera: "+
                "\n1. Añadir"+
                "\n2. Editar"+
                "\n3. Quitar"));

        switch(option){
            case 1 : String name = JOptionPane.showInputDialog("Añada el nombre del Genero: ");
                int choice = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro que quiere añadir este Genero: "+
                        "\n1. Yes"+
                        "\n2. Mo"));

                if(choice != 1){
                    System.out.println("El numero introducido es el incorrecto");
                    int again = Integer.parseInt(JOptionPane.showInputDialog("Quiere volverlo a intentar: "+
                            "\n1. Yes"+
                            "\n2. Mo"));
                    if(again == 1){
                        String name2 = JOptionPane.showInputDialog("Añada el nombre del Genero: ");
                        int choice2 = 0;
                        while( choice2 < 1 || choice2 > 2){
                            choice2 = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro que quiere añadir este Genero: "+
                                    "\n1. Yes"+
                                    "\n2. Mo"));
                        }
                        if(choice2 == 1){
                            Gender.add(name2);
                            System.out.println("Se añadio con exito");
                        }
                        else if(choice2 == 2){
                            int again2 = 0;
                            while (again2 < 1 || again2 > 2){
                                again2 = Integer.parseInt(JOptionPane.showInputDialog("Quiere volverlo a introducir el nombre del Genero: "+
                                        "\n1. Yes"+
                                        "\n2. Mo"));
                            }
                            if(again2 == 1){
                                String name3 = JOptionPane.showInputDialog("Introduza el nombre que se añadira a la lista de Generos");
                                Gender.add(name3);
                                System.out.println("Se añadio con exito");
                            }
                            else if(again2 == 2){
                                return a;
                            }
                        }
                    }
                    else{
                        return a;
                    }
                }
                else if(choice == 1){
                    Gender.add(name);
                    System.out.println("Se añadio con exito");
                }
                else if(choice == 2){
                    int again = 0;
                    while (again < 1 || again > 2){
                        again = Integer.parseInt(JOptionPane.showInputDialog("No quiere volverlo a intentar"+
                                "\n1. Yes"+
                                "\n2. Mo"));
                    }
                    if(again == 1){
                        String name2 = JOptionPane.showInputDialog("Introduza el nombre que se añadira a la lista de Generos");
                        Gender.add(name2);
                        System.out.println("Se añadio con exito");
                    }
                    else if(again == 2){
                        return a;
                    }
                }
                break;
            case 2 : int edit = Integer.parseInt(JOptionPane.showInputDialog("Que quieres editar: "+
                    "\n1. Nombre"+
                    "\n2. Description"));//solo se pueden editar las descripciones de los generos originales
                if(edit == 1){
                    for(int i=0 ; i < Gender.size(); i++){
                        System.out.println(i+1+".  "+ Gender.get(i));
                    }
                    int number = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del Genero que quiera editar"));
                    if(number > 0 && number <Gender.size()){
                        String newName  = JOptionPane.showInputDialog("Introduzca el nuevo Nombre: ");
                        Gender.set((number-1), newName);
                    }
                    else {
                        System.out.println("El numero introducido es incorrecto intentelo mas tarde ");
                    }
                }
                else if(edit == 2){
                    int number = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la descripcion que quieres editar:"+
                            "\n1.   Accion" +
                            "\n2.   Aventuras" +
                            "\n3.   Ciencia ficcion" +
                            "\n4.   Comedia" +
                            "\n5.   Documental" +
                            "\n6.   Drama" +
                            "\n7.   Fantasia" +
                            "\n8.   Musical" +
                            "\n9.   Suspenso" +
                            "\n10.  Terror"));
                    switch(number){
                        case 1 : String note = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Accion: ");
                            this.note = note;
                            System.out.println(setAction(note));
                            break;
                        case 2 : String note1 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Aventuras: ");
                            this.note1 = note1;
                            System.out.println(setAdventure(note1));
                            break;
                        case 3 : String note2 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Ciencia ficcion: ");
                            this.note2 = note2;
                            System.out.println(setScienceFiction(note2));
                            break;
                        case 4 : String note3 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Comedia: ");
                            this.note3 = note3;
                            System.out.println(setComedy(note3));
                            break;
                        case 5 : String note4 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Documental: ");
                            this.note4 = note4;
                            System.out.println(setDocumentaryFilm(note4));
                            break;
                        case 6 : String note5 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Drama: ");
                            this.note5 = note5;
                            System.out.println(setDrama(note5));
                            break;
                        case 7 : String note6 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Fantasia: ");
                            this.note6 = note6;
                            System.out.println(setFantasy(note6));
                            break;
                        case 8 : String note7 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Musical: ");
                            this.note7 = note7;
                            System.out.println(setMusical(note7));
                            break;
                        case 9 : String note8 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Suspenso: ");
                            this.note8 = note8;
                            System.out.println(setSuspense(note8));
                            break;
                        case 10 : String note9 = JOptionPane.showInputDialog("Escriba la descripciòn que quiera añadir a Terror: ");
                            this.note9 = note9;
                            System.out.println(setTerror(note9));
                            break;
                        default : System.out.println("El numero introducido es incorrecto intentelo mas tarde ");
                            break;
                    }

                }
                break;
            case 3 : for(int i=0 ; i < Gender.size(); i++){
                System.out.println(i+1+".  "+ Gender.get(i));
            }
                int number = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que quieres eliminar: "));
                if(number > 0 && number <Gender.size()){
                    Gender.remove(number-1);
                    System.out.println("Accion realizada con exito");
                }
                else{
                    System.out.println("El numero introducido es el incorrecto intentelo mas tarde ");
                }
                break;
            default :
                System.out.println("El numero introducido es el incorrecto intentelo mas tarde");
                break;
        }
        return resultFinal;
    }
    public void showDates(){
        System.out.println("LA LISTA DE GENEROS ES -->");
        for(int i=0; i < Gender.size(); i++){
            System.out.println(i+1+".  "+ Gender.get(i));
        }
        System.out.println("LA DESCRIPCION DEL GENERO ACCION ES:  \n"+setAction() );
        System.out.println("LA DESCRIPCION DEL GENERO AVENTURA ES:  \n"+setAdventure());
        System.out.println("LA DESCRIPCION DEL GENERO CIENCIA FICCION ES:  \n"+setScienceFiction() );
        System.out.println("LA DESCRIPCION DEL GENERO COMEDIA ES:  \n"+setComedy());
        System.out.println("LA DESCRIPCION DEL GENERO DOCUMENTAL ES:  \n"+setDocumentaryFilm() );
        System.out.println("LA DESCRIPCION DEL GENERO DRAMA ES:  \n"+setDrama());
        System.out.println("LA DESCRIPCION DEL GENERO FANTASIA ES:  \n"+setFantasy() );
        System.out.println("LA DESCRIPCION DEL GENERO MUSICAL ES:  \n"+setMusical());
        System.out.println("LA DESCRIPCION DEL GENERO SUSPENSO ES:  \n"+setSuspense() );
        System.out.println("LA DESCRIPCION DEL GENERO TERROR ES:  \n"+setTerror());
        System.out.println("TODO EN ORDEN ADMINISTRADOR:  \n"+nameAdmin);
    }

    public void showDatesWithChanges(){
        System.out.println("LA LISTA DE GENEROS ES -->");
        for(int i=0; i < Gender.size(); i++){
            System.out.println(i+1+".  "+ Gender.get(i));
        }
        System.out.println("LA DESCRIPCION DEL GENERO ACCION ES:  \n"+setAction(note));
        System.out.println("LA DESCRIPCION DEL GENERO AVENTURA ES:  \n"+setAdventure(note1));
        System.out.println("LA DESCRIPCION DEL GENERO CIENCIA FICCION ES:  \n"+setScienceFiction(note2));
        System.out.println("LA DESCRIPCION DEL GENERO COMEDIA ES:  \n"+setComedy(note3));
        System.out.println("LA DESCRIPCION DEL GENERO DOCUMENTAL ES:  \n"+setDocumentaryFilm(note4));
        System.out.println("LA DESCRIPCION DEL GENERO DRAMA ES:  \n"+setDrama(note5));
        System.out.println("LA DESCRIPCION DEL GENERO FANTASIA ES:  \n"+setFantasy(note6));
        System.out.println("LA DESCRIPCION DEL GENERO MUSICAL ES:  \n"+setMusical(note7));
        System.out.println("LA DESCRIPCION DEL GENERO SUSPENSO ES:  \n"+setSuspense(note8));
        System.out.println("LA DESCRIPCION DEL GENERO TERROR ES:  \n"+setTerror(note9));
        System.out.println("TODO EN ORDEN ADMINISTRADOR:  \n"+nameAdmin);
    }
}

