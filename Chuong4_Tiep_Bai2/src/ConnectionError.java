class ConnectionError extends Exception{
    int source;
    int destination;
    public ConnectionError(int s,int d){
        this.source = s;
        this.destination = d;
    }
    public String getMessage(){
    return "Conect from source to destination error!";
    }
}