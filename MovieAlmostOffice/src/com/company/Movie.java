package com.company;
import java.util.ArrayList;
import javax.swing.*;

public class Movie {
    protected int views;
    protected String name;
    protected int lengthMinuts;
    protected int rank;
    protected String premierDate;
    protected String comments;
    protected String language;
    protected String classification;
/*
    public Movie(String name, int lengthMinuts, int rank, String premierDate, String comments, int views, String language, String classification) {
        this.name = name;
        this.lengthMinuts = lengthMinuts;
        this.rank = rank;
        this.premierDate = premierDate;
        this.comments = comments;
        this.views = views;
        this.language = language;
        this.classification = classification;
    }
    */

    public String getName(){
        String result = "";
        ArrayList<String> Names = new ArrayList<String>();
        int number = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE NOMBRES PELICULAS QUE QUIERES AGREGAR"));
        String[] movies = new String[number];
        for(int i=0 ; i<movies.length; i++){
            movies[i] =JOptionPane.showInputDialog("EL NOMBRE DE LA "+(i+1)+"ª PELICULA ES:");
        }
        for(int i=0; i<movies.length; i++){
            Names.add(movies[i]);
        }
        for(int i=0; i<Names.size(); i++){
            if(i == Names.size()-1){
                result += Names.get(i);
            }
            else{
                result += Names.get(i)+" , ";
            }
        }
        return result;
    }
    public String getDuration(){
        String resultFinal = "";
        ArrayList<String> Duration = new ArrayList<String>();
        int addition = Integer.parseInt(JOptionPane.showInputDialog("CUANTAS HORAS QUIERE AÑADIR (ENTRE UNO Y UN MAXIMO DE 10 HORAS)"));

        if (addition > 0 && addition < 11){
            int add = Integer.parseInt(JOptionPane.showInputDialog("LA HORA DE LA PELICULA QUIERE: "+
                    "\n1. AÑADIRLA"+
                    "\n2. AGREGARLA DE MANERA ALEATORIA"));
            if(add == 1){
                for(int i=0; i<addition ; i++){
                    String result = "";
                    int userHours = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE HORAS (SE ACEPTA 1 o 2 HORAS)"));
                    if (userHours == 1){
                        int userMinuts = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE MiNUTOS  \n(SE ACEPTA ENTRE 30 A 60 MINUTOS)"));
                        int userSeconds = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE SEGUNDOS \n(SE ACEPTA ENTRE 0 A 60 SEGUNDOS)"));
                        if(userMinuts == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORA, "+userMinuts+" MINUTO Y "+userSeconds+" SEGUNDOS";
                        }
                        else if(userSeconds == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORA, "+userMinuts+" MINUTOS Y "+userSeconds+" SEGUNDO";
                        }
                        else{
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORA, "+userMinuts+" MINUTOS Y "+userSeconds+" SEGUNDOS";
                        }
                    }
                    else if(userHours == 2){
                        int userMinuts = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE MiNUTOS O MINUTO \n(SOLO SE ACEPTA ENTRE 0 A 30 MINUTOS)"));
                        int userSeconds = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE SEGUNDOS \n(SOLO SE ACEPTA ENTRE 0 A 60 SEGUNDOS)"));
                        if(userMinuts == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORAS, "+userMinuts+" MINUTO Y "+userSeconds+" SEGUNDOS";
                        }
                        else if(userSeconds == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORAS, "+userMinuts+" MINUTOS Y "+userSeconds+" SEGUNDO";
                        }
                        else{
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours+" HORAS, "+userMinuts+" MINUTOS Y "+userSeconds+" SEGUNDOS";
                        }
                    }
                    else{
                        int end = Integer.parseInt(JOptionPane.showInputDialog("INTRODUJO UN NUMERO ERRONEO QUIERE INTENTARLO OTRA VEZ: "+
                                "\n1. SI"+
                                "\n2. NO"));
                        if(end == 1){
                            int userHours2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE HORAS (SE ACEPTA 1 o 2 HORAS)"));
                            if(userHours2 == 1){
                                int userMinuts2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE MiNUTOS  \n(SE ACEPTA ENTRE 30 A 60 MINUTOS)"));
                                int userSeconds2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE SEGUNDOS \n(SE ACEPTA ENTRE 0 A 60 SEGUNDOS)"));
                                if(userMinuts2 == 1){
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORA, "+userMinuts2+" MINUTO Y "+userSeconds2+" SEGUNDOS";
                                }
                                else if(userSeconds2 == 1){
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORA, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SEGUNDO";
                                }
                                else{
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORA, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SEGUNDOS";
                                }
                            }
                            else if(userHours2 == 2){
                                int userMinuts2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE MiNUTOS O MINUTO \n(SOLO SE ACEPTA ENTRE 0 A 30 MINUTOS)"));
                                int userSeconds2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE SEGUNDOS \n(SOLO SE ACEPTA ENTRE 0 A 60 SEGUNDOS)"));
                                if(userMinuts2 == 1){
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORAS, "+userMinuts2+" MINUTO Y "+userSeconds2+" SEGUNDOS";
                                }
                                else if(userSeconds2 == 1){
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORAS, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SEGUNDO";
                                }
                                else{
                                    result = "LA PELICULA DURA UNA CANTIDAD DE "+userHours2+" HORAS, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SEGUNDOS";
                                }
                            }
                            else{
                                System.out.println("POR FAVOR LA SIGUIENTE VEZ INTRODUZCA UN NUMERO CORRECTO");
                                System.out.println("--REGRESANDO AL MENU--");
                            }
                            if(end == 2){
                                System.out.println("USTED ESCOGIO LA OPCION NO");
                                System.out.println("--REGRESANDO AL MENU--");
                            }
                            else{
                                System.out.println("POR FAVOR LA SIGUIENTE VEZ INTRODUZCA UN NUMERO CORRECTO");
                                System.out.println("--REGRESANDO AL MENU--");
                            }

                        }
                    }
                    Duration.add(result);
                }
            }
            else if(add == 2){
                for(int i=0; i<addition ; i++){
                    int dur = 0;
                    String result = "";
                    while(dur < 5400 || dur > 9000){
                        dur = (int)(Math.random()*9001);      //dur = Segundos que equivalen de 1 hora y media a 2 horas
                    }
                    int hours, minuts, seconds;
                    hours = dur / 3600;
                    dur -= (3600*hours);
                    minuts = dur / 60;
                    dur -= (60*minuts);
                    seconds =  dur;
                    if(hours == 1){
                        if(seconds == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORA, "+minuts+" MINUTOS Y "+seconds+" SEGUNDO";
                        }
                        else {
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORA, "+minuts+" MINUTOS Y "+seconds+" SEGUNDOS";
                        }
                    }
                    else if(hours == 2 && minuts == 0 && seconds == 0){
                        result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORAS";
                    }
                    else if(hours == 2){
                        if(seconds == 1 && minuts == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORAS, "+minuts+" MINUTO Y "+seconds+" SEGUNDO";
                        }
                        else if(minuts == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORAS, "+minuts+" MINUTO Y "+seconds+" SEGUNDOS";
                        }
                        else if(seconds == 1){
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORAS, "+minuts+" MINUTOS Y "+seconds+" SEGUNDO";
                            System.out.println();            }
                        else {
                            result = "LA PELICULA DURA UNA CANTIDAD DE "+hours+" HORAS, "+minuts+" MINUTOS Y "+seconds+" SEGUNDOS";
                        }
                    }
                    Duration.add(result);
                }
            }
            else{
                System.out.println("POR FAVOR LA SIGUIENTE VEZ INTRODUZCA UN NUMERO CORRECTO");
                System.out.println("--REGRESANDO AL MENU--");
            }
        }
        else{
            System.out.println("POR FAVOR LA SIGUIENTE VEZ INTRODUZCA UN NUMERO CORRECTO");
            System.out.println("--REGRESANDO AL MENU--");
        }
        for(int i=0; i<Duration.size(); i++){
            resultFinal += "LA "+(i+1)+"ª DURACION ES --> "+Duration.get(i) + ("\n");
        }
        System.out.println(resultFinal);
        return resultFinal;
    }
    public String getRank(){
        String resultFinal ="\n"+"---PROCESO TERMINADO----"+"\n"+"\n";
        String aux = "";
        ArrayList<String> ranks = new ArrayList<String>();
        ranks.add("LA MEJOR PELICULA DE LA ACTUALIDAD");
        ranks.add("LA MEJOR PELICULA CLASICA MODERNA");
        ranks.add("LA MEJOR PELICULA CLASICA");
        ranks.add("LA MEJOR PELICULA ANIMADA");
        ranks.add("LA MEJOR PELICULA DE ACCION");
        ranks.add("LA MEJOR PELICULA DE AVENTURAS");
        ranks.add("LA MEJOR PELICULA DE CIENCIA FICCION");
        ranks.add("LA MEJOR PELICULA DE COMEDIA");
        ranks.add("EL MEJOR DOCUMENTAL");
        ranks.add("LA MEJOR PELICULA DE DRAMA");
        ranks.add("LA MEJOR PELICULA DE FANTASIA");
        ranks.add("LA MEJOR PELICULA MUSICAL");
        ranks.add("LA MEJOR PELICULA DE SUSPENSO");
        ranks.add("LA MEJOR PELICULA DE TERROR");
        int option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA OPCION QUE DESEE:" +
                "\n1. AGREGAR UNA PELICULA AL RANKING" +
                "\n2. QUITAR UNA PELICULA AL RANKING"));
        if(option == 1){
            System.out.println("ESTOS SON TODOS LOS RANKS");
            for(int i=0; i<ranks.size(); i++){
                System.out.println((i+1)+". "+ranks.get(i));
            }
            int option3 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL RANKING AL CUAL QUIERE AÑADIR"));
            if(option3 < 1 || option3 > ranks.size()) {
                System.out.println("USTED INTRODUJO UN NUMERO INCORRECTO");
                int option4 = 0;
                while (option4 < 1 || option4 > 2) {
                    option4 = Integer.parseInt(JOptionPane.showInputDialog("QUIERE VOLVERLO A INTENTAR:" +
                            "\n1. SI" +
                            "\n2. NO"));
                }
                if (option4 == 1) {
                    System.out.println("ESTOS SON TODOS LOS RANKS");
                    for (int i = 0; i < ranks.size(); i++) {
                        System.out.println((i + 1) + ". " + ranks.get(i));
                    }
                    int option5 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL RANKING AL CUAL QUIERE AÑADIR"));
                    if (option5 < 1 || option5 > ranks.size()) {
                        System.out.println("REGRESANDO AL MENU");
                    }
                    String add2 = JOptionPane.showInputDialog("CUAL ES EL NOMBRE DE LA PELICULA QUE QUIERE AÑADIR");
                    int option6 = 0;
                    while (option6 < 1 || option6 > 2) {
                        option6 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE AÑADIR ESTA PELICULA" +
                                "\n1. SI" +
                                "\n2. NO"));
                    }
                    if (option6 == 1) {
                        aux += ranks.get(option5 - 1) + " ES LA PELICULA " + add2.toUpperCase();
                        ranks.set((option5-1), aux);
                        System.out.println(aux);
                    } else if (option6 == 2) {
                        System.out.println("REGRESANDO AL MENU");
                    }
                } else if (option4 == 2) {
                    System.out.println("REGRESANDO AL MENU");
                }
            }
            String add = JOptionPane.showInputDialog("CUAL ES EL NOMBRE DE LA PELICULA QUE QUIERE AÑADIR");
            int option2 = 0;
            while (option2 < 1 || option2 > 2){
                option2 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE AÑADIR ESTA PELICULA" +
                        "\n1. SI" +
                        "\n2. NO"));
            }
            if(option2 == 1){
                aux += ranks.get(option3-1) + " ES PARA LA PELICULA "+add.toUpperCase();
                ranks.set((option3-1), aux);
                System.out.println(aux);
            }
            else if(option2 == 2){
                System.out.println("REGRESANDO AL MENU");
            }
        }
        else if(option == 2){
            System.out.println("ESTOS SON TODOS LOS RANKS");
            for(int i=0; i<ranks.size(); i++){
                System.out.println((i+1)+". "+ranks.get(i));
            }
            int move = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL RANKING EL CUAL QUIERE QUITAR"));
            if(move < 1 || move > ranks.size()){
                System.out.println("USTED INTRODUJO UN NUMERO INCORRECTO");
                int options = 0;
                while (options < 1 && options > 2) {
                    options = Integer.parseInt(JOptionPane.showInputDialog("QUIERE VOLVERLO A INTENTAR:" +
                            "\n1. SI" +
                            "\n2. NO"));
                }
                if(options == 1){
                    int move2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL RANKING EL CUAL QUIERE QUITAR"));
                    if(move2 < 1 || move2 > ranks.size()){
                        System.out.println("USTED INTRODUJO UN NUMERO INCORRECTO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 1){
                        ranks.set((move-1), "LA MEJOR PELICULA DE LA ACTUALIDAD");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 2){
                        ranks.set((move-1), "LA MEJOR PELICULA CLASICA MODERNA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 3){
                        ranks.set((move-1), "LA MEJOR PELICULA CLASICA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 4){
                        ranks.set((move-1), "LA MEJOR PELICULA ANIMADA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 5){
                        ranks.set((move-1), "LA MEJOR PELICULA DE ACCION");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 6){
                        ranks.set((move-1), "LA MEJOR PELICULA DE AVENTURAS");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 7){
                        ranks.set((move-1), "LA MEJOR PELICULA DE CIENCIA FICCION");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 8){
                        ranks.set((move-1), "LA MEJOR PELICULA DE COMEDIA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 9){
                        ranks.set((move-1), "EL MEJOR DOCUMENTAL");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 10){
                        ranks.set((move-1), "LA MEJOR PELICULA DE DRAMA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 11){
                        ranks.set((move-1), "LA MEJOR PELICULA DE FANTASIA");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 12){
                        ranks.set((move-1), "LA MEJOR PELICULA MUSICAL");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 13){
                        ranks.set((move-1), "LA MEJOR PELICULA DE SUSPENSO");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                    else if(move == 14){
                        ranks.set((move-1), "LA MEJOR PELICULA DE TERROR");
                        System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                        System.out.println("REGRESANDO AL MENU");
                    }
                }
                else if(options == 2){
                    System.out.println("REGRESANDO AL MENU");
                }
            }
            else if(move == 1){
                ranks.set((move-1), "LA MEJOR PELICULA DE LA ACTUALIDAD");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 2){
                ranks.set((move-1), "LA MEJOR PELICULA CLASICA MODERNA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 3){
                ranks.set((move-1), "LA MEJOR PELICULA CLASICA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 4){
                ranks.set((move-1), "LA MEJOR PELICULA ANIMADA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 5){
                ranks.set((move-1), "LA MEJOR PELICULA DE ACCION");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 6){
                ranks.set((move-1), "LA MEJOR PELICULA DE AVENTURAS");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 7){
                ranks.set((move-1), "LA MEJOR PELICULA DE CIENCIA FICCION");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 8){
                ranks.set((move-1), "LA MEJOR PELICULA DE COMEDIA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 9){
                ranks.set((move-1), "EL MEJOR DOCUMENTAL");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 10){
                ranks.set((move-1), "LA MEJOR PELICULA DE DRAMA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 11){
                ranks.set((move-1), "LA MEJOR PELICULA DE FANTASIA");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 12){
                ranks.set((move-1), "LA MEJOR PELICULA MUSICAL");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 13){
                ranks.set((move-1), "LA MEJOR PELICULA DE SUSPENSO");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
            else if(move == 14){
                ranks.set((move-1), "LA MEJOR PELICULA DE TERROR");
                System.out.println("SE RETIRO LA PELICULA DEL RANKING CON EXITO");
                System.out.println("REGRESANDO AL MENU");
            }
        }
        for(int i=0; i<ranks.size();i++){
            resultFinal += ranks.get(i)+"\n";
            System.out.println(resultFinal);

        }
        return resultFinal;
    }
    public String getPremierDate(){
        String resultFinal = "";
        ArrayList<String> PremierDate  = new ArrayList<String>();
        int number = Integer.parseInt(JOptionPane.showInputDialog("CUANTAS FECHAS DE ESTRENO VA AÑADIR"));
        for(int i=0; i<number; i++){
            String result = "";
            String name = JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA PELICULA QUE SE ESTRENA");
            int year;
            int month;
            int day;
            int yearActually = Integer.parseInt(JOptionPane.showInputDialog("EN QUE AÑO ESTAMOS"));
            year = 0;
            while((yearActually+10) < year || yearActually > year){
                year = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL AÑO DEL ESTRENO"));
                if((yearActually+10) < year || yearActually > year){
                    System.out.println("EL ESTRENO NO TIENEN QUE PASAR 10 AÑOS DE LA FECHA ACTUAL");
                    System.out.println("INTENTE OTRA VEZ");
                    System.out.println("**********************************************");
                }
            }
            month = 0;
            while(month > 12 || month < 1){
                month = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL MES DEL ESTRENO" +
                        "\n1. ENERO      / 2. FEBRERO  / 3. MARZO      / 4. ABRIL"+
                        "\n5. MAYO       / 6. JUNIO    / 7. JULIO      / 8. AGOSTO"+
                        "\n9. SEPTIEMBRE / 10. OCTUBRE / 11. NOVIEMBRE / 12. DICIEMBRE"));
                if(month > 12 || month < 1){
                    System.out.println("INTRODUJO UN NUMERO ERRONEO");
                    System.out.println("INTENTE OTRA VEZ");
                    System.out.println("**********************************************");
                }
            }
            ArrayList<Integer> daysMonths = new ArrayList<Integer>();
            int january = 31;
            int february = 28;
            int march = 31;
            int april = 30;
            int may = 31;
            int june = 30;
            int july = 31;
            int august = 31;
            int september = 30;
            int october = 31;
            int november = 30;
            int december = 31;
            daysMonths.add(january);
            daysMonths.add(february);
            daysMonths.add(march);
            daysMonths.add(april);
            daysMonths.add(may);
            daysMonths.add(june);
            daysMonths.add(july);
            daysMonths.add(august);
            daysMonths.add(september);
            daysMonths.add(october);
            daysMonths.add(november);
            daysMonths.add(december);
            day = 0;
            while(day < 1 || day > daysMonths.get(month-1)){
                day = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL DIA DEL ESTRENO"));
                if(day < 1 || day > daysMonths.get(month-1)){
                    System.out.println("EN ESE MES NO EXISTE ESE DIA");
                    System.out.println("INTENTE OTRA VEZ");
                    System.out.println("**********************************************");
                }
            }
            result +="SE ESTRENA LA PELICULA "+name+" LA FECHA --> "+day+"/"+month+"/"+year;
            PremierDate.add(result);
        }
        for(int i=0; i<PremierDate.size(); i++){
            resultFinal += PremierDate.get(i)+"\n";
        }
        System.out.println(resultFinal);
        return resultFinal;
    }
    public String getComments(){
        String result = "EJECUCION TERMINADA";
        ArrayList<String> Comments = new ArrayList<String>();
        int option = 0;
        while (option < 1 || option > 2) {
            option = Integer.parseInt(JOptionPane.showInputDialog("USTED QUIERE AÑADIR UN NUEVO COMENTARIO:" +
                                                                  "\n1. SI" +
                                                                  "\n2. NO"));
        }
        if(option == 1){
            int option2 = 0;
            do{
                String add2 = JOptionPane.showInputDialog("ESCRIBA EL COMENTARIO");
                Comments.add(add2);
                option2 = Integer.parseInt(JOptionPane.showInputDialog("USTED QUIERE AÑADIR OTRO COMENTARIO:" +
                        "\n1. SI" +
                        "\n2. NO"));
            } while(option2 == 1);
            System.out.println("COMENTARIO AGREGADO CON EXITO");
        }
        else if(option == 2){
            System.out.println("REGRESANDO AL MENU");
        }
        System.out.println(result);
        return result;
    }
    public int getViews() {
        System.out.println("QUIRES VER LA PELICULA");
        int option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE:" +
                "\n1. SI QUIERES VER LA PELICULA" +
                "\n2. SI NO QUIERE VER LA PELICULA"));
        if (option < 1 || option >= 2) {
            System.out.println("USTED INTRODUJO UN NUMERO INCORRECTO");
            int option2 = 0;
            while (option2 < 1 || option2 > 2) {
                option2 = Integer.parseInt(JOptionPane.showInputDialog("QUIERE VOLVERLO A INTENTAR:" +
                        "\n1. SI" +
                        "\n2. NO"));
            }
            if (option2 == 1) {
                int option3 = 0;
                while (option3 < 1 || option3 > 2) {
                    option3 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE:" +
                            "\n1. SI QUIERES VER LA PELICULA" +
                            "\n2. SI NO QUIERE VER LA PELICULA"));
                    if (option3 == 1) {
                        System.out.println("INGRESANDO A LA PELICULA");
                        views++;
                        return views;
                    } else if (option3 == 2) {
                        System.out.println("REGRESANDO AL MENU DE PELICULAS");
                        return 0;
                    }
                }
            } else if (option2 == 2) {
                System.out.println("REGRESANDO AL MENU DE PELICULAS");
                return 0;
            }
        } else if (option == 1) {
            System.out.println("INGRESANDO A LA PELICULA");
            views++;
            return views;
        }
        return 0;
    }
    public String getLanguage(){
        String result = "EJECUCION TERMINADA";
        ArrayList<String> Languajes = new ArrayList<String>();
        ArrayList<String> Subtitles = new ArrayList<String>();
        String languaje = "Español"; //predetermined
        String subtitle = "Español"; //predetermined
        Languajes.add("Ingles");
        Languajes.add("Español");
        Subtitles.add("Ingles");
        Subtitles.add("Español");
        int options = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA ACCION QUE QUIERE REALIZAR" +
                "\n1. CAMBIAR EL IDIOMA DE LA PELICULA" +
                "\n2. CAMBIAR EL SUBTITULO DE LA PELICULA" +
                "\n3. AGREGAR UN IDIOMA NUEVO" +
                "\n2. AGREGAR UN SUBTITULO NUEVO" +
                "\n3. QUITAR UN IDIOMA" +
                "\n4. QUITAR UN SUBTITULO"));
        if(options == 1){

            System.out.println("A QUE IDIOMA QUIERE CAMBIARLO");
            System.out.println("OPCIONES: " +
                               "\n0. PARA SALIR");
            for(int i=0; i<Languajes.size(); i++){
                System.out.println((i+1)+". "+Languajes.get(i));
            }
            int number = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA OPCIONA QUE QUIERE REALIZAR"));
            if(number == 0){
                System.out.println("REGRESANDO AL MENU");
            }
            else if(number > 0 && number <= Languajes.size()){
                languaje = Languajes.get(number-1);
                System.out.println("SE CAMBIO AL IDIOMA "+languaje.toUpperCase());
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        if(options == 2){
            System.out.println("A QUE IDIOMA QUIERE CAMBIAR LOS SUBTITULOS");
            System.out.println("OPCIONES: " +
                               "\n0. PARA SALIR");
            for(int i=0; i<Subtitles.size(); i++){
                System.out.println((i+1)+". "+Subtitles.get(i));
            }
            int number = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA OPCIONA QUE QUIERE REALIZAR"));
            if(number == 0){
                System.out.println("REGRESANDO AL MENU");
            }
            else if(number > 0 && number <= Subtitles.size()){
                subtitle = Subtitles.get(number-1);
                System.out.println("SE CAMBIO AL IDIOMA "+subtitle.toUpperCase());
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        if(options == 3){
            String add = JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DEL IDIOMA QUE QUIERE AGREGAR");
            int options2 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE AÑADIR ESTE IDIOMA" +
                    "\n1. SI" +
                    "\n2. NO"));
            if(options2 == 1){
                Languajes.add(add);
                System.out.println("AÑADIDO EL IDIOMA "+add.toUpperCase()+" CON EXITO");
                return result;
            }
            else if(options2 == 2){
                System.out.println("REGRESANDO AL MENU DE INICIO");
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        if(options == 4){
            String add = JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DEL IDIOMA DEL SUBITULO QUE QUIERE AGREGAR");
            int options2 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE AÑADIR ESTE SUBTITULO" +
                                                                        "\n1. SI" +
                                                                        "\n2. NO"));
            if(options2 == 1){
                Subtitles.add(add);
                System.out.println("AÑADIDO EL IDIOMA "+add.toUpperCase()+" CON EXITO");
            }
            else if(options2 == 2){
                System.out.println("REGRESANDO AL MENU DE INICIO");
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        if(options == 5){
            System.out.println("ESTOS SON LOS IDIOMAS QUE TENEMOS: ");
            for(int i=0; i<Languajes.size(); i++){
                System.out.println((i+1)+". "+Languajes.get(i));
            }
            int options2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL IDIOMA QUE QUIERE QUITAR"));
            int options3 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE QUITAR ESTE IDIOMA" +
                                                                        "\n1. SI" +
                                                                        "\n2. NO"));
            if(options3 == 1){
                Languajes.remove(options2-1);
                System.out.println("QUITADO EL IDIOMA "+Languajes.get(options2-1)+" CON EXITO");
            }
            else if(options3 == 2){
                System.out.println("REGRESANDO AL MENU DE INICIO");
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        if(options == 6){
            System.out.println("ESTOS SON LOS IDIOMAS DE LOS SUBTITULOS QUE TENEMOS: ");
            for(int i=0; i<Subtitles.size(); i++){
                System.out.println((i+1)+". "+Subtitles.get(i));
            }
            int options2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DEL SUBTITULO QUE QUIERE QUITAR"));
            int options3 = Integer.parseInt(JOptionPane.showInputDialog("ESTA SEGURO QUE QUIERE QUITAR ESTE SUBTITULO" +
                                                                        "\n1. SI" +
                                                                        "\n2. NO"));
            if(options3 == 1){
                Subtitles.remove(options2-1);
                System.out.println("QUITADO EL IDIOMA "+Subtitles.get(options2-1)+" CON EXITO");
            }
            else if(options3 == 2){
                System.out.println("REGRESANDO AL MENU DE INICIO");
            }
            else{
                System.out.println("EL NUMERO QUE SE INTRODUJO ES EL INCORRECTO PORFAVOR INTENTELO MAS TARDE");
            }
        }
        return result;
    }
}