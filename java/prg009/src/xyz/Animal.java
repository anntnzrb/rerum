package xyz;

public class Animal {

    private String color;

    /*
     * en este caso, cuando se instancie el objeto sin algun argumento, por
     * default se asignara el color "cafe" al atributo color
     */

    public Animal()
    {
        this.setColor("cafe");
    }
    /*
     * por otro lado, cuando se instancie el objeto especificando algun
     * argumento, por ejemplo "verde" se asignara dicho color al atributo color
     */
    public Animal(String c)
    {
        this.setColor(c);
    }

    /* Setter */
    public void
    setColor(String c)
    {
        this.color = c;
    }
}
