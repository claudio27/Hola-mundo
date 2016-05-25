/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringaleatorio;

/**
 *
 * @author Claudio
 */
public class StringAleatorio {

  
       
      
public String cadenaAleatoria(int tam){

     String cadena = "ABCDEFGHIJKLMUNOPQRSTUVXYZ123456789";
       String resultado= "";

for(int i = 0; i < tam; i++){

 resultado += cadena.charAt((int)(Math.random()*33));

}

return resultado;


}
  
    public static void main(String[] args) {
        
       StringAleatorio st = new StringAleatorio();
       
       String cad = st.cadenaAleatoria(20);
       
       System.out.println(cad);
}

    public static void main(String[] args) {
        
       StringAleatorio st = new StringAleatorio();
       
       String cad = st.cadenaAleatoria(20);
       
       System.out.println(cad);
}
    public static void main(String[] args) {
        
       StringAleatorio st = new StringAleatorio();
       
       String cad = st.cadenaAleatoria(20);
       
       System.out.println(cad);
}
    public static void main(String[] args) {
        
       StringAleatorio st = new StringAleatorio();
       
       String cad = st.cadenaAleatoria(20);
       
       System.out.println(cad);
}



}