public class Database {

    boolean connected;

    public void connectDataBase(){
        setConnected(true);
    }

    public boolean isAvailable() {
        return isConnected();
    }
    public int getUniqueId() {
        return 42;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }


}
