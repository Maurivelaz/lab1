/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6.velazquez;
import java.util.*;
/**
 *
 * @author Ulp
 */
public class Directorio {
    HashMap<Long,Clientes> listD =new HashMap<>();
    
    
    public int agregarCliente(long nro,Clientes c){
        
       // listD.put(nro,new Clientes(dni,nombre,apellido,ciudad,direccion));
       if(!listD.containsKey(nro)){
        listD.put(nro,c);
        return 1;
    }
       else return 0;
    }
    public Clientes buscarClientes(long nro){
        /*Set x = listD.keySet();
        Iterator it = x.iterator();
        while ( it.hasNext()){
            long num = (long)it.next();
             Clientes cli = listD.get(num);
             if (cli.getDni()==(nro)){
        System.out.println(cli.toString());
            }           
          */
        //Set x = listD.keySet();
      //  Iterator it = x.iterator(); devuelve un objeto cliente
          //  System.out.println(listD.get(nro)); 
          return listD.get(nro);
    }
    public Set<Long> buscarTelefono(String apellidos) {
        Set<Long> list1 = new HashSet();
        Set <Long> x = listD.keySet();
        Iterator it = x.iterator();
                                                   
         while (it.hasNext()){
          
             long num = (long)it.next();
             Clientes cli = listD.get(num);
             if (cli.getApellido().equals(apellidos)){
             
                 list1.add(num) ;
             //System.out.println("El numero de telefono "+num+" esta asociado al apellido "+cli.getApellido() );
         }
             
    }
         return  list1;
    }
    public List<Clientes> BuscarClientes(String unaCiudad){
        List c = new LinkedList();
        Set x = listD.keySet();
        Iterator it = x.iterator();
       
         while (it.hasNext()){
          
             long num = (long)it.next();
             Clientes cli = listD.get(num);
             if (cli.getCiudad().equals(unaCiudad)){
                String client= cli.toString();
             c.add(client);
            // System.out.println("El cliente "+cli.getNombre()+ " " +cli.getApellido()+" esta asociado a la ciudad de "+cli.getCiudad() );
         }
    }
        return c;
    }
    public Clientes borrarCliente(long documento){
        Set x = listD.keySet();
        Iterator it = x.iterator();
       Clientes bandera= null;
         while (it.hasNext()){
          
             long num = (long)it.next();
             Clientes cli = listD.get(num);
             if (cli.getDni()== documento){
            bandera = listD.remove(num);
             
            //System.out.println(bandera);
             break;
         }
    }
         return bandera;
}
    public long buscaClave(long dni){
        Set<Long> keys = listD.keySet();
        Long keyAux =0L;
        for (Long aux : keys) {
            Clientes cliente=listD.get(aux);
            if(cliente.getDni()== dni)
                keyAux = aux;
        }
        return keyAux;
    }
    /* Set<Long> list1 = new HashSet();
        Set <Long> z = listD.keySet();
        Iterator it = z.iterator();
                                                   
         while (it.hasNext()){
          
             long num = (long)it.next();
             Clientes cli = listD.get(num);
             if (cli.getDni()== dni){
             
                 list1.add(num) ;
             //System.out.println("El numero de telefono "+num+" esta asociado al apellido "+cli.getApellido() );
         }
             
    }
         return  list1;*/
       
    }