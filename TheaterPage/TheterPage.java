import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList.*;

public class TheterPage {
    private String cinemaPageName = cinemaData.getName();
    private User[] usersList;
    private Challenge[] ChallengesList;
    private Cinema cinemaData;
    private Movie[] moviesData;
    private Movie[] top;


    public void setTop(Movie[] top) {
        this.top = top;
    }

    public TheterPage(Cinema cinemaData) {
        this.cinemaData = cinemaData;
    }

    public User getUserAcount(String IDUuario){

        for (int i = 0; i < usersList.length; i++){
            if (IDUsuario.equals(usersList[i].getID())){
                return usersList[i];
            }
        }
        return null;
    }

    public void setUsersList(User[] usersList) {
        int k = 0;
        for (int i = 0; i < usersList.length; i++){
            for (int j = (i + 1); j < usersList.length; j++){
                if(usersList[i].getID().equals(usersList[j].getID())){
                    k += 1;
                }
            }
        }

        if (k == 0){
            this.usersList = usersList;
        }else{
            System.out.println("existen" +  k + "usuarios con ID duplicada en la lista que intentaste");
        }
    }

    public void showLogInInterface(String name, String password){

    }

    public void showReserveTicketInterface(String movieName, int nroTickets){

    }

    public void setMoviesData(Movie[] moviesData) {
        this.moviesData = moviesData;
    }

    public Movie[] getBillBoard(){
        return cinemaData.getBillBoard();
    }

    public Movie[] getTop(){
        return top;
    }

    public String[] getComments(Movie movie){
        return movie.getComments();
    }

    public int getCinemaRoomCapacity(CinemaRoom room){
        return room.getCapacity();
    }

    public Movie getMovieData(Movie movie){
        return movie;
    }



    public void setChallengesList(Challenge[] challengesList) {
        if (challengesList.length > 5){
            this.ChallengesList = challengesList;
        }else{
            System.out.println("existen demasiados desafios en la lista ingresada");
        }

    }



}
