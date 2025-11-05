public class Nagato {

    // PRIMER PASO
    private static Nagato pain;
    public String frase;

    // TERCER PASO
    private Nagato (String frase){
        this.frase = frase;
    }

    // SEGUNDO PASO
    public static Nagato getInstance (String frase){
        if (pain == null) {
            pain = new Nagato(frase);
        }
        return pain;
    }

}
