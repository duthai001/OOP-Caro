public class Agent {
    public void connecting(int source, int destination) throws ConnectionError{
        if (source == destination || destination ==0)
        {
            throw new ConnectionError(source,destination);
        }
        }
        public int running(int source, int destination,int value){
        try {
            Agent  a = new Agent();
            a.connecting(source, destination);
        }
        catch (ConnectionError e)
        {
            System.out.println(e);
            return 1;
        }
        return 0;
        }
}
