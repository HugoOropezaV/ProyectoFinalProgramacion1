public class CinemaRoom {
    private int maxCapacity;
    private int actualCapacity;
    private int idRoom;
    private boolean full;

    public CinemaRoom(int idRoom, int maxCapacity){
        this.idRoom = idRoom;
        this.maxCapacity = maxCapacity;
        actualCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public boolean isFull(){
        if(actualCapacity >0){
            full = false;
        }else{
            full= true;
        }

        return full;
    }
    public void updateCapacity(int res){
        if(!isFull() && actualCapacity > res){
            actualCapacity -= res;

        }else{
            int missing =(actualCapacity-res)*-1;
            System.out.println("There are not enough free sites, missing: " + missing);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***************");
        sb.append("\nCinema Room: ");
        sb.append(idRoom);
        sb.append("\nCapacity: ");
        sb.append(maxCapacity);
        sb.append("\nFree sites: ");
        sb.append(actualCapacity);
        sb.append("\n***************");
        return sb.toString();
    }
}
