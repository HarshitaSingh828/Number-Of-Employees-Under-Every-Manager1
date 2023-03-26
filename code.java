
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    HashMap<String,String>map = new HashMap<>();
    for(int i = 0; i <n; i++){
        map.put(scn.next(), scn.next());
    }
    func(map);
    
  }
  public static void func(HashMap<String,String>map){
      HashMap<String,HashSet<String>>tree = new HashMap<>();
      String ceo = "";
      for(String emp:map.keySet()){
          String man = map.get(emp);
          if(man.equals(emp)) {
              ceo = man;
          }
          else{
              if(tree.containsKey(man)){
                HashSet<String>emps = tree.get(man);
                emps.add(emp);
              }
              else{
                  HashSet<String>emps = new HashSet<>();
                  emps.add(emp);
                  tree.put(man,emps);
              }
          }
      }
     HashMap<String, Integer> result = new HashMap<>();
     getsize(tree, ceo,result);
     for(String key : result.keySet()){
         System.out.println(key+ " "+ result.get(key));
     }
  }
  public static int getsize(HashMap<String,HashSet<String>>tree, String ceo, HashMap<String, Integer> result ){
      if(tree.containsKey(ceo)== false){
        result.put(ceo,0);
        return 1;
      }
      int sz = 0;
      for(String emp: tree.get(ceo)){
          int cs = getsize(tree,emp,result);
          sz+=cs;
      }
      result.put(ceo,sz);
      return sz+1;
  }
}
