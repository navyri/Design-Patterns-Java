public class dbConnection {

    // PRIMER PASO
    private static dbConnection connection;
    public String urlConnection;

    // TERCER PASO
    private dbConnection (String urlConnection){
        this.urlConnection = urlConnection;
    }

    // SEGUNDO PASO
    public static dbConnection getInstance (String urlConnection){
        if (connection == null) {
            connection = new dbConnection(urlConnection);
        }
        return connection;
    }

}
