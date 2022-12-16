public class voti {

    /** dichiarazione variabili
     *
     */
    private String materia, data;
    private int voto;

    /**
     * costruttore variabili
     * @param materia
     * @param data
     * @param voto
     */
    public voti(String materia, String data, int voto) {
        this.materia = materia;
        this.data = data;
        this.voto = voto;
    }

    /**
     * setter materia
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * setter data
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * setter voto
     * @param voto
     */
    public void setVoto(int voto) {
        this.voto = voto;
    }
}
