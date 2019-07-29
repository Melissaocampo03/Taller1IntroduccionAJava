package entidades;

public enum Mensajes {

    MENSAJE_NOTA_SEGUIMIENTO("Ingresa tu nota de seguimiento: "),

    MENSAJE_NOTA_PARCIAL("Ingresa la nota de tu parcial: "),

    MENSAJE_NOTA_EXAMEN("Ingresa la nota de tu examen final: "),

    MENSAJE_NOTA_4_A_5(" Excelente, tu rendimiento ha sido el mejor."),

    MENSAJE_NOTA_3_A_39(" Tu rendimiento es aceptable, pero finalizaste bien."),

    MENSAJE_NOTA_2_A_29 (" Te sugerimos comprometerte más con tu estudio."),

    MENSAJE_NOTA_1_A_19(" Malas noticias, no cumpliste con el mínimo para avanzar."),

    MENSAJE_NOTA_0_A_09(" Nuevamente vuelve a iniciar tus estudios y dedícate."),

    MENSAJE_FINAL("Tu calificación final es: ");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje= s;
    }
    public String getMensaje(){
        return mensaje;
    }
}
