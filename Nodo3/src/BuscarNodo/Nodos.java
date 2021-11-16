
package BuscarNodo;

import java.util.Scanner;

    public class Nodos {
    static class Node {
        String name;
        Node next;
        
        int opt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
        
         do{
            System.out.println("\n¿Qué operación deseas realizar?\n1. Agregar nodo inicial\n"
            +"2. Agregar nodo atras de inicial\n"
            +"3. Agregar nodo adelante de inicial\n"
            +"4. Agregar nodo intermedio\n"
            +"5. Eliminar"
            +"6.Generar"
            +"7.Buscar");
            
            int opt = sc.nextInt();

            switch(opt){ 
                    
                case 1:       
                    
                    dump("Case 1", top);

                    // 2. The singly linked list exists, and the no
                    //do  debe insertarse 
                    //antes que el primer nodo.
                    Node temp;

                    temp = new Node();
                    System.out.println("Ingresa contenido de nodo anterior a inicial");
                    temp.name = sc.nextLine();
                    temp.next = top;
                    top = temp;
                    
                    break;

                case 2:  
                         
                dump("Case 2", top);

                // 3. The singly linked list exists, and the node must be inserted
                //    after the last node
                //3. La lista enlazada individualmente existe y el nodo debe insertarse.
                //después del último nodo
                
                temp = new Node();
                System.out.println("ingresa contenido de nodo posterior a inicial");
                temp.name = sc.nextLine();
                temp.next = null;

                Node temp2;
                temp2 = top;

                    while (temp2.next != null) {
                        temp2 = temp2.next;
                    }

                    temp2.next = temp;
                    
                    break;
                    
                case 3:  
                    
                dump("Case 3", top);

                // 4. The singly linked list exists, and the node must be inserted
                //    between two nodes
                //4. La lista enlazada individualmente existe y el nodo debe insertarse.
                //    entre dos nodos
                
                temp = new Node();
                System.out.println("ingresa contenido de nodo intermedio");
                temp.name = sc.nextLine();

                temp2 = top;

                    while (temp2.name.equals(top.name) == false) {
                        temp2 = temp2.next;
                    }

                    temp.next = temp2.next;
                    temp2.next = temp;
            
                case 4:   
                    
                    dump("Case 4", top);
                    
                    break;
                    
                    
                case 5:
                    
                //ELIMINAR NODO
                    
                    System.out.println("¿Desea eliminar el nodo 1 o nodo 2?");
                    
                    opt=sc.nextInt();
                    
                    if(opt==1){
                        
                        for(int i=0; i<top.name.length(); i--){
                            System.out.println("El primer nodo se ha eliminado");
                        }
                    }
                    
                    else{
                        
                        for(int i=0; i<top.next.length(); i--){
                            System.out.println("El segundo nodo se ha eliminado");
                        }
                    }
                    
                    break;
            
            case 6:
            
                    String res="";

                for(int i=1; i<=3; i++){
                    int num = (int)((Math.random()*(('z'-'a')+1))+'a');
                    char letra = (char) num;
                    res=res+letra;
                }

                String resultado = res.toUpperCase().charAt(0) + res.substring(1, res.length()).toLowerCase();


                int numero = (int)(Math.random()*10+1);


                String resp="";

                for(int i=1; i<=1; i++){
                    int n = (int)((Math.random()*(('/'-'!'))));
                    char simb = (char) n;
                    resp=resp+simb;
                }
                
                String unir=resultado+numero+resp;
                //resultado
                System.out.println(unir);

            break;
            
            case 7:
                
                System.out.println("Ingrese el valor a buscar dentro del nodo: ");
                String v=sc.nextLine();
              
                    int intIndex = v.indexOf("");
                    
                        if(intIndex == - 1){
                           System.out.println("Valor encontrado");
                        }else{
                           System.out.println("Valor no encontrado"
                           + intIndex);
                        }

            }
    

