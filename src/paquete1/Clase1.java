package paquete1;

public class Clase1 {
    String atributo1; // El acceso esta limitado solo al paquete
    public String atributo2; // El acceso esta disponible para cualquier paquete
    private String atributo3; // El acceso solo esta disponible para esta clase

    public void mensanje(){
        atributo3 = "Hola, soy un atributo privado, pero no tan privado porque estoy siendo mostrado desde " +
                "una funcion de la clase1";
        System.out.println(atributo3);
    }
}
