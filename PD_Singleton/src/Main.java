public class Main {
    public static void main(String[] args) {

        Nagato pain = Nagato.getInstance("Shinra Tensei");
        System.out.println(pain.frase);

        Nagato painDos = Nagato.getInstance("YMTKDS");
        System.out.println(painDos.frase);

        dbConnection puerto = dbConnection.getInstance("http://localhost:3000/");
        System.out.println(puerto.urlConnection);

        dbConnection puertoDos = dbConnection.getInstance("http://localhost:8888/");
        System.out.println(puertoDos.urlConnection);

    }
}
